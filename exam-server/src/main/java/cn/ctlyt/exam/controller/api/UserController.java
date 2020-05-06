package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.ClazzService;
import cn.ctlyt.exam.service.EmailService;
import cn.ctlyt.exam.service.RoleService;
import cn.ctlyt.exam.service.UserService;
import cn.ctlyt.exam.utils.*;
import cn.ctlyt.exam.vo.InvitationCode;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassNameUserController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 23:04
 * @Version V1.0
 **/
@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    EmailService emailService;
    @Autowired
    ClazzService clazzService;


    @Autowired
    @Qualifier("thymeleafViewResolver")
    private ThymeleafViewResolver thymeleafViewResolver;

    @GetMapping("login")
    public Result doLogin(User user,HttpServletRequest request) throws Exception {
        user.setU_id(0);
        if(user.verifyLogin()){
            User user1 = userService.getUser(user);
            if(user1!=null && user1.getU_id()!=null && user1.getU_id()!=0){
                //创建key
                String subject = JSON.toJSONString(user1); //将java对象转换为JSON数据
                String jwt = JwtUtil.createJWT(Constant.JWT_ID, Constant.ISSUER, subject, Constant.JWT_TTL);
                Claims claims = JwtUtil.parseJWT(jwt);
                if(thymeleafViewResolver != null){
                    Clazz clazzByCID = clazzService.getClazzByCID(user1.getC_id());
                    request.getSession().setAttribute("user",user1);
                    request.getSession().setAttribute("clazz",clazzByCID);
                }
                RedisUtil.set(Constant.getToken(claims.getId(),user1.getC_id(),user1.getR_id()),claims.getSubject(),60*60*3);
                return ResultGenerator.genSuccessResult(jwt);
            }
        }
        return ResultGenerator.genFailResult("用户名或密码错误");
    }
    @PostMapping("register")
    public Result doRegister(User user,Integer code){
        if(user.verifyRegister()){
            Set<String> keys = RedisUtil.keys(InvitationCode.no + "-*-" + code);
            if(keys==null || keys.size()<=0){
                return ResultGenerator.genFailResult("没有此邀请码");
            }
            AtomicReference<InvitationCode> invitationCode = new AtomicReference<>();
            keys.forEach(item->{
                System.out.println(item);
                invitationCode.set((InvitationCode) RedisUtil.get(item));
            });
            user.setR_id(invitationCode.get().getR_id());
            user.setC_id(invitationCode.get().getC_id());
            userService.addUser(user);
            return ResultGenerator.genSuccessResult(user.getU_id());
        }
        return ResultGenerator.genFailResult("添加失败");
    }
    @GetMapping("getuserinfo")
    public Result getUserInfo(String token){
        Claims claims = JwtUtil.parseJWT(token);
        Integer u_id = JSON.parseObject(claims.getSubject(), User.class).getU_id();
        User user = new User();

        user.setU_id(u_id);
        User user1 = userService.getUser(user);
        user1.setRole(roleService.getRole(user1.getR_id()));
        return ResultGenerator.genSuccessResult(user1);
    }
    @GetMapping("logout")
    public Result logout(String token,HttpServletRequest request){
        Claims claims = JwtUtil.parseJWT(token);
        User user = JSON.parseObject(claims.getSubject(), User.class);
        try{
            request.getSession().removeAttribute("user");
            RedisUtil.del(Constant.getToken(claims.getId(),user.getC_id(),user.getR_id()));
        }catch (Exception e){

        }finally {
            return ResultGenerator.genSuccessResult("退出登录");
        }
    }
    /*
     * 功能描述：修改密码
     * @param [request, password]
     * @return cn.ctlyt.exam.pojo.Result
     * @Author: 村头老杨头
     * @Date: 2020/5/4 0004 19:27
     *
     */
    @GetMapping("updatepwd")
    public Result updatePwd(HttpServletRequest request,String password){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if(user!=null){
            if(!PatternUtil.regPassword(password))
                return ResultGenerator.genFailResult("密码格式不正确");
            user.setPassword(password);
            userService.updateUser(user);
            return ResultGenerator.genSuccessResult().setMessage("修改密码成功");
        }else{
            return ResultGenerator.genUnauthorizedResult().setMessage("没有权限修改");
        }
    }
    @GetMapping("update")
    public Result update(HttpServletRequest request,User user){
        HttpSession session = request.getSession();
        User usertmp = (User)session.getAttribute("user");
        if(usertmp!=null){
            if(PatternUtil.regPhone(user.getPhone())){
                usertmp.setPhone(user.getPhone());
            }
            if(PatternUtil.regEmail(user.getEmail())){
                usertmp.setEmail(user.getEmail());
            }
            if(PatternUtil.regUsername(user.getUsername())){
                usertmp.setUsername(user.getUsername());
            }
            userService.updateUser(usertmp);
            request.getSession().setAttribute("user",usertmp);
            return ResultGenerator.genSuccessResult().setMessage("修改用户成功");
        }else{
            return ResultGenerator.genUnauthorizedResult().setMessage("没有权限修改");
        }
    }

    /*
     * 功能描述：忘记密码
     * @param 
     * @return 
     * @Author: 村头老杨头
     * @Date: 2020/4/30 0030 17:22
     *
     */
    @GetMapping("forget")
    public Result forget(String phone){
        if(PatternUtil.regPhone(phone)){
            User userByPhone = userService.getUserByPhone(phone);
            if(userByPhone!=null){
                if(userByPhone.getEmail()!=null){
                    String string = UUID.randomUUID().toString();
                    //存入缓存
                    RedisUtil.set(string,userByPhone);
                    String htmlStr = "<h1>忘记密码</h1>点击链接重置密码："+Constant.OL_URL+"/resetpwd/"+string+"<h3>请勿吧此链接告知第三人</h3><h5>链接有效时长2小时</h5>";
                    try {
                        emailService.sendHtmlMail(userByPhone.getEmail(),htmlStr,"["+Constant.SYSTEM_NAME+"]忘记密码");
                        return ResultGenerator.genSuccessResult("邮件发送成功");
                    } catch (MessagingException e) {
                        throw new BizException("邮件发送失败");
                    }
                }else{
                    throw new BizException("没有设置个人邮箱");
                }
            }else{
                throw new BizException("没有此用户");
            }
        }else{
            throw new BizException("手机号格式不符合要求");
        }
    }
}

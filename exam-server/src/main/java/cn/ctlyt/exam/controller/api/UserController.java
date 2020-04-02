package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.RoleService;
import cn.ctlyt.exam.service.UserService;
import cn.ctlyt.exam.utils.Constant;
import cn.ctlyt.exam.utils.JwtUtil;
import cn.ctlyt.exam.utils.RedisUtil;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("login")
    public Result doLogin(User user) throws Exception {
        user.setU_id(0);
        if(user.verifyLogin()){
            User user1 = userService.getUser(user);
            if(user1!=null && user1.getU_id()!=null && user1.getU_id()!=0){
                //创建key
                String subject = JSON.toJSONString(user1); //将java对象转换为JSON数据
                String jwt = JwtUtil.createJWT(Constant.JWT_ID, "ctlyt", subject, Constant.JWT_TTL);
                Claims claims = JwtUtil.parseJWT(jwt);
                System.out.println("getID:"+claims.getId());
                RedisUtil.set(Constant.getToken(claims.getId(),user1.getC_id(),user1.getR_id()),claims.getSubject(),60*60*1000);
                return ResultGenerator.genSuccessResult(jwt);
            }
        }
        return ResultGenerator.genFailResult("用户名或密码错误");
    }
    @GetMapping("register")
    public Result doRegister(User user){
        if(user.verifyRegister()){
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
    public Result logout(String token){
        Claims claims = JwtUtil.parseJWT(token);
        User user = JSON.parseObject(claims.getSubject(), User.class);
        try{
            RedisUtil.del(Constant.getToken(claims.getId(),user.getC_id(),user.getR_id()));
        }catch (Exception e){

        }finally {
            return ResultGenerator.genSuccessResult("退出登录");
        }
    }
}

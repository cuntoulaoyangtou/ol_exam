package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.config.GlobalConfig;
import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.ClazzService;
import cn.ctlyt.exam.service.UserService;
import cn.ctlyt.exam.utils.RedisUtil;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * @ClassNameUserController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 5:37
 * @Version V1.0
 **/
@RestController(value = "adminUserController")
@RequestMapping("admin/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ClazzService clazzService;
    @PostMapping("add")
    public Result addUser(User user) throws SQLException {
        try{
            if(userService.addUser(user)>0){
                return ResultGenerator.genSuccessResult(user);
            }
            return ResultGenerator.genFailResult("添加失败").setData(user);
        }catch (DuplicateKeyException e){
            throw new BizException("用户手机号已存在",user);
        } catch (DataIntegrityViolationException e){
            throw new BizException("角色ID或班级ID错误",user);
        }

    }
    @PostMapping("update")
    public Result updateUser(User user){
        try{
            if(userService.updateUser(user)>0){
                return ResultGenerator.genSuccessResult(user);
            }
            return ResultGenerator.genFailResult("修改失败").setData(user);
        }catch (DuplicateKeyException e){
            throw new BizException("用户手机号已存在",user);
        } catch (DataIntegrityViolationException e){
            throw new BizException("角色ID或班级ID错误",user);
        }
    }
    @PostMapping("del")
    public Result delUser(Integer u_id){
        if(userService.delUser(u_id)>0){
            return ResultGenerator.genSuccessResult(u_id);
        }
        return ResultGenerator.genFailResult("删除失败").setData(u_id);
    }
    @PostMapping("getusers")
    public Result getUsers(@RequestParam(value="pageNo",defaultValue="1" ,required=false) Integer pageNo,@RequestParam(value="pageSize",defaultValue="20" ,required=false)  Integer pageSize, User user,@RequestParam(value="g_id",defaultValue="0" ,required=false)  Integer g_id,@RequestParam(value="s_id",defaultValue="0" ,required=false)  Integer s_id, @RequestParam(value="m_id",defaultValue="0" ,required=false) Integer m_id){
        PageInfo<User> users = userService.getUsers(pageNo, pageSize, user, g_id, s_id,m_id);
        return ResultGenerator.genSuccessResult(users);
    }
    @PostMapping("olusers")
    public Result olUsers(Clazz clazz,@RequestParam(value="s_id",defaultValue="0" ,required=false) Integer s_id,@RequestParam(value="r_id",defaultValue="0" ,required=false) Integer r_id){
        List<Clazz> list = new ArrayList<>();
        if(clazz.getG_id()!=null || clazz.getM_id()!=null || clazz.getC_id()!=null || s_id !=0 ){
            //校区在线人数
            //年级在线人数
            //班级在线人数
            PageInfo<Clazz> clazzs = clazzService.getClazzs(1, 500, new Clazz(), s_id);

            for(Clazz clazz1 : clazzs.getList()){
                Set<String> keys = RedisUtil.keys(GlobalConfig.TOKEN_HEADER+"_"+clazz1.getC_id()+"*");
                List list1 = RedisUtil.gList(keys);
                list.addAll(list1);
            }
        }else{
            if(r_id!=null && r_id!=0){
                //学生在线人数
                for(int i=1; i<=r_id; i++){
                    Set<String> keys = RedisUtil.keys(GlobalConfig.TOKEN_HEADER+"_*_"+i+"_*");
                    List list1 = RedisUtil.gList(keys);
                    list.addAll(list1);
                }
            }else{
                //所有在线用户
                Set<String> keys = RedisUtil.keys(GlobalConfig.TOKEN_HEADER+"*");
                list = RedisUtil.gList(keys);
            }
        }

        return ResultGenerator.genSuccessResult(list);
    }
}

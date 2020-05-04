package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.UserService;
import cn.ctlyt.exam.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: exam
 * @description: 视图控制器
 * @author: 村头老杨头
 * @create: 2020-04-30 23:46
 */
@Controller
public class ViewController {
    @Autowired
    UserService userService;
    @GetMapping("/resetpwd/{key}")
    public String resetPwd(@PathVariable String key, HttpServletRequest request){
        System.out.println(key);
        Object o = RedisUtil.get(key);
        if(o!=null){
            request.setAttribute("key",key);
            return "uresetpwd";
        }else{
            request.setAttribute("msg","地址链接已失效！");
            return "err";
        }

    }
    @PostMapping("setpwd")
    public String setPwd(String key,String pwd,HttpServletRequest request){
        Object o = RedisUtil.get(key);
        if(o!=null){
            User o1 = (User) o;
            o1.setPassword(pwd);
            userService.updateUser(o1);
            RedisUtil.del(key);
            return "succeed";
        }else{
            request.setAttribute("msg","地址链接已失效！");
            return "err";
        }
    }

    @GetMapping("err")
    public String err(HttpServletRequest request){
        request.setAttribute("msg",request.getParameter("msg"));
        return "err";
    }
}
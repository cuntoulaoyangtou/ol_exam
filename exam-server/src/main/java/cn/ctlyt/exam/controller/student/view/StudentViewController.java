package cn.ctlyt.exam.controller.student.view;

import cn.ctlyt.exam.service.QuestionService;
import cn.ctlyt.exam.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: exam
 * @description: 登录视图控制器
 * @author: 村头老杨头
 * @create: 2020-05-01 08:41
 */
@Controller
public class StudentViewController {
    @Autowired
    QuestionService questionService;

    /*
     * 功能描述：登录注册页面视图
     * @param []
     * @return java.lang.String
     * @Author: 村头老杨头
     * @Date: 2020/5/3 0003 17:10
     *
     */
    @GetMapping("login")
    public String login(){
        return "student/login/login";
    }
    @GetMapping("/")
    public String index(HttpServletRequest request){
        HttpSession session = request.getSession();
        Map map = (Map)RedisUtil.get("index_data");
        if(map == null){
            //试题总数
            int questionCountByQtids = questionService.getQuestionCountByQtids(null);
            map = new HashMap();
            map.put("qcount",questionCountByQtids);
            RedisUtil.set("index_data",map);
        }
        request.setAttribute("map",map);
        request.setAttribute("user",session.getAttribute("user"));
        request.setAttribute("clazz",session.getAttribute("clazz"));
//        model.addAllAttributes(map);
//        model.addAttribute("map",map);

//        request.setAttribute("map",map);
//        questionService.
//        request.setAttribute("user",request.getSession().getAttribute("user"));
        return "student/index";
    }
    //个人信息
    @GetMapping("/user/userinfo")
    public String userUserInfo(){
        return "student/user/userinfo";
    }
    //个人中心
    @GetMapping("/user/usercenter")
    public String userUsercenter(){
        return "student/user/usercenter";
    }
}
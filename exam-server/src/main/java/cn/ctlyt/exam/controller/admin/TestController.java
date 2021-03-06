package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.Test;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.service.TestService;
import cn.ctlyt.exam.utils.Constant;
import cn.ctlyt.exam.utils.ResultGenerator;
import cn.ctlyt.exam.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @program: exam
 * @description: 试卷
 * @author: 村头老杨头
 * @create: 2020-04-03 11:58
 */
@RestController
@RequestMapping("admin/test")
public class TestController {
    @Autowired
    TestService testService;
    @PostMapping("pretest")
    public Result preTest(HttpServletRequest request){
        String header = request.getHeader(Constant.TOKEN_HEADER);
        User userByJwt = User.getUserByJwt(header);
        Map map = testService.preTest(userByJwt);
        return ResultGenerator.genSuccessResult(map);
    }

    @PostMapping("add")
    public Result addTest(HttpServletRequest request, Test test,String cls,String tids){
        String header = request.getHeader(Constant.TOKEN_HEADER);
        User userByJwt = User.getUserByJwt(header);
        test.setU_id(userByJwt.getU_id());
        Test test1 = testService.addTest(test, cls, tids);
        return ResultGenerator.genSuccessResult(test1);
    }

    @PostMapping("addrand")
    public Result addTestRand(HttpServletRequest request,Test test,String ecs,String cls, Integer difficulty,String nums){
        String header = request.getHeader(Constant.TOKEN_HEADER);
        User userByJwt = User.getUserByJwt(header);
        test.setU_id(userByJwt.getU_id());
        Test test1 = testService.addTestRand(test, ecs, cls, difficulty, nums);
        return ResultGenerator.genSuccessResult(test1);
    }
}
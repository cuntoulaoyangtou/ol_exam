package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Result;
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
        List<Tree> trees = testService.preTest(userByJwt);
        return ResultGenerator.genSuccessResult(trees);
    }
}
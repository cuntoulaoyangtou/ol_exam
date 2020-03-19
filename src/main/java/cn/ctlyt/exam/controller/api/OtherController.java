package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.OtherService;
import cn.ctlyt.exam.utils.ResultGenerator;
import cn.ctlyt.exam.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassNameOtherController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/16 0016 10:40
 * @Version V1.0
 **/
@RestController
@RequestMapping("api/other")
public class OtherController {
    @Autowired
    OtherService otherService;
    @GetMapping("getchaptertree")
    public Result getChapterTree(){
        List<Tree> chapterTree = otherService.getChapterTree();
        return ResultGenerator.genSuccessResult(chapterTree);
    }
}

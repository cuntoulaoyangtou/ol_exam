package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.pojo.Chapter;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.ChapterService;
import cn.ctlyt.exam.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassNameChapterController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 22:29
 * @Version V1.0
 **/
@RestController("apiChapterController")
@RequestMapping("api/chapter")
public class ChapterController {
    @Autowired
    ChapterService chapterService;
    @GetMapping("getchaptersbycumid")
    public Result getChapters(Integer cum_id){
        List<Chapter> chaptersByCUMID = chapterService.getChaptersByCUMID(cum_id);
        return ResultGenerator.genSuccessResult(chaptersByCUMID);
    }
}

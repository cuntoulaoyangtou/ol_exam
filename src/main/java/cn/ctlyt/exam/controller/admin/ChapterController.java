package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Chapter;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.ChapterService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameChapterController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 22:25
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/chapter")
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @PostMapping("add")
    public Result addChapter(Chapter chapter){
        chapterService.addChapter(chapter);
        return ResultGenerator.genSuccessResult(chapter);
    }
    @PostMapping("/update")
    public Result updateChapter(Chapter chapter){
        if(chapterService.updateChapter(chapter)>0){
            return ResultGenerator.genSuccessResult(chapter);
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("/del")
    public Result delChapter(Integer ec_id){
        if(chapterService.delChapter(ec_id)>0){
            return ResultGenerator.genSuccessResult(ec_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("/getchapters")
    public Result getChapters(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize, @RequestParam(value="ec_name",defaultValue="" ,required=false)String ec_name, @RequestParam(value="cum_id",defaultValue="0" ,required=false)Integer cum_id){
        PageInfo<Chapter> chapters = chapterService.getChapters(pageNo, pageSize, ec_name,cum_id);
        return ResultGenerator.genSuccessResult(chapters);
    }
    @PostMapping("/getchapter")
    public Result getChapter(Integer ec_id){
        Chapter chapter = chapterService.getChapter(ec_id);
        return ResultGenerator.genSuccessResult(chapter);
    }
}

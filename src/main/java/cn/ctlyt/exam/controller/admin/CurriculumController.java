package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Curriculum;
import cn.ctlyt.exam.pojo.Curriculum;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.CurriculumService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameCurriculumController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 21:24
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/curriculum")
public class CurriculumController {
    @Autowired
    CurriculumService curriculumService;

    @PostMapping("add")
    public Result addCurriculum(Curriculum curriculum){
        curriculumService.addCurriculum(curriculum);
        return ResultGenerator.genSuccessResult(curriculum);
    }
    @PostMapping("/update")
    public Result updateCurriculum(Curriculum curriculum){
        if(curriculumService.updateCurriculum(curriculum)>0){
            return ResultGenerator.genSuccessResult(curriculum);
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("/del")
    public Result delCurriculum(Integer cum_id){
        if(curriculumService.delCurriculum(cum_id)>0){
            return ResultGenerator.genSuccessResult(cum_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("/getcurriculums")
    public Result getCurriculums(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize, @RequestParam(value="cum_name",defaultValue="" ,required=false)String cum_name, @RequestParam(value="m_id",defaultValue="0" ,required=false)Integer m_id){
        PageInfo<Curriculum> curriculums = curriculumService.getCurriculums(pageNo, pageSize, cum_name,m_id);
        return ResultGenerator.genSuccessResult(curriculums);
    }
    @PostMapping("/getcurriculum")
    public Result getCurriculum(Integer cum_id){
        Curriculum curriculum = curriculumService.getCurriculum(cum_id);
        return ResultGenerator.genSuccessResult(curriculum);
    }
}

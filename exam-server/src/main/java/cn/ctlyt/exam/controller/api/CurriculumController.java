package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.pojo.Curriculum;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.CurriculumService;
import cn.ctlyt.exam.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassNameCurriculumController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 22:19
 * @Version V1.0
 **/
@RestController("apiCurriculumController")
@RequestMapping("api/curriculum")
public class CurriculumController {
    @Autowired
    CurriculumService curriculumService;
    @GetMapping("getcurriculumsbymid")
    public Result getCurriculums(Integer m_id){
        List<Curriculum> curriculumsBYMID = curriculumService.getCurriculumsBYMID(m_id);
        return ResultGenerator.genSuccessResult(curriculumsBYMID);
    }
}

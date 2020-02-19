package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Grade;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.GradeService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameGradeController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 9:43
 * @Version V1.0
 **/
@RestController(value = "apiGrageController")
@RequestMapping("api/grade")
public class GradeController {
    @Autowired
    GradeService gradeService;
    @GetMapping("getgrades")
    public Result getGrades(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize, @RequestParam(value="g_name",defaultValue="" ,required=false)String g_name,@RequestParam(value="s_id",defaultValue="0" ,required=false)Integer s_id){
        PageInfo<Grade> grades = gradeService.getGrades(pageNo, pageSize, g_name, s_id);
        if(grades.getList().size()>0){
            return ResultGenerator.genSuccessResult(grades);
        }else{
            throw new BizException("没有年级数据",(Object)("g_name:"+g_name+",s_id:"+s_id));
        }
    }
    @GetMapping("getgrade")
    public Result getGrade(Integer g_id){
        Grade grade = gradeService.getGrade(g_id);
        if (grade==null){
            throw new BizException("没有年级数据",(Object)("g_id:"+g_id));
        }
        return ResultGenerator.genSuccessResult(grade);
    }

}

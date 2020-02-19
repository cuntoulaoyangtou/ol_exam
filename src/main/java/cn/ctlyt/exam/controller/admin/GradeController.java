package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Grade;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.GradeService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameGradeController
 * @Description 年级
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 3:44
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/grade")
public class GradeController {
    @Autowired
    GradeService gradeService;
    @PostMapping("/add")
    public Result addGrade(Grade grade){
        if(grade.getS_id()==null || grade.getS_id()<=0){
            return ResultGenerator.genFailResult("请填写学校ID");
        }
        if(gradeService.addGrade(grade)>0){
            return ResultGenerator.genSuccessResult(grade.getG_id());
        }
        return ResultGenerator.genFailResult("添加失败");
    }
    @PostMapping("/update")
    public Result updateGrade(Grade grade){
        if(gradeService.updateGrade(grade)>0){
            return ResultGenerator.genSuccessResult(grade.getG_id());
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("/del")
    public Result delGrade(Integer g_id){
        if(gradeService.delGrade(g_id)>0){
            return ResultGenerator.genSuccessResult(g_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("/getgrades")
    public Result getGrades(Integer pageNo,Integer pageSize,String g_name,Integer s_id){
        PageInfo<Grade> grades = gradeService.getGrades(pageNo, pageSize, g_name,s_id);
        if(grades.getList().size()>0){
            return ResultGenerator.genSuccessResult(grades);
        }
        return ResultGenerator.genFailResult("查询失败");
    }
    @PostMapping("/getgrade")
    public Result getGrade(Integer g_id){
        Grade grade = gradeService.getGrade(g_id);
        if(grade!=null){
            return ResultGenerator.genSuccessResult(grade);
        }
        return ResultGenerator.genFailResult("查询失败");
    }

}

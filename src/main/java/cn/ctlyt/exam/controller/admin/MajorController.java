package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Major;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.MajorService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameMajorController
 * @Description 专业
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 3:57
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/major")
public class MajorController {
    @Autowired
    MajorService majorService;
    @PostMapping("add")
    public Result addMajor(Major major){
        if(majorService.addMajor(major)>0){
            return ResultGenerator.genSuccessResult(major.getM_id());
        }
        return ResultGenerator.genFailResult("添加失败");
    }
    @PostMapping("update")
    public Result updateMajor(Major major){
        if(majorService.updateMajor(major)>0){
            return ResultGenerator.genSuccessResult(major.getM_id());
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("del")
    public Result delMajor(Integer m_id){
        if(majorService.delMajor(m_id)>0){
            return ResultGenerator.genSuccessResult(m_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("getmajors")
    public Result getMajors(Integer pageNo,Integer pageSize,String m_name){
        PageInfo<Major> majors = majorService.getMajors(pageNo, pageSize, m_name);
        return ResultGenerator.genSuccessResult(majors);
    }
    @PostMapping("getmajor")
    public Result getMajor(Integer m_id){
        Major major = majorService.getMajor(m_id);
        return ResultGenerator.genSuccessResult(major);
    }

}

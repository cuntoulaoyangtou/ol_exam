package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.Grade;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.ClazzService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameClazzController
 * @Description 班级
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 19:36
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/clazz")
public class ClazzController {
    @Autowired
    ClazzService clazzService;
    @PostMapping("/add")
    public Result addClazz(Clazz clazz){
        if(clazz.getM_id()==null || clazz.getM_id()<=0){
            return ResultGenerator.genFailResult("请选择专业ID");
        }
        if(clazz.getG_id()==null || clazz.getG_id()<=0){
            return ResultGenerator.genFailResult("请选择年级ID");
        }
        if(clazzService.addClazz(clazz)>0){
            return ResultGenerator.genSuccessResult(clazz.getG_id());
        }
        return ResultGenerator.genFailResult("添加失败");
    }
    @PostMapping("/update")
    public Result updateClazz(Clazz clazz){
        if(clazzService.updateClazz(clazz)>0){
            return ResultGenerator.genSuccessResult(clazz.getG_id());
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("/del")
    public Result delClazz(Integer c_id){
        if(clazzService.delClazz(c_id)>0){
            return ResultGenerator.genSuccessResult(c_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("/getclazzs")
    public Result getClazz(Integer pageNo, Integer pageSize, Clazz clazz,Integer s_id){
        PageInfo<Clazz> clazzs = clazzService.getClazzs(pageNo, pageSize,clazz,s_id);
        return ResultGenerator.genSuccessResult(clazzs);
    }
    @PostMapping("/getclazz")
    public Result getClazz(Integer c_id){
        Clazz clazz = clazzService.getClazz(c_id);
        if(clazz!=null){
            return ResultGenerator.genSuccessResult(clazz);
        }
        return ResultGenerator.genFailResult("查询失败");
    }
}

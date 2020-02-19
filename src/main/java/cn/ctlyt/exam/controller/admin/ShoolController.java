package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.Shool;
import cn.ctlyt.exam.service.ShoolService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameShoolController
 * @Description 学校
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 1:15
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/shool")
public class ShoolController {
    @Autowired
    ShoolService shoolService;
    @PostMapping("/add")
    public Result addShool(Shool shool){
        if((shoolService.addShool(shool))>0){
            return ResultGenerator.genSuccessResult(shool.getS_id());
        }
        return ResultGenerator.genFailResult("添加失败");
    }
    @PostMapping("/update")
    public Result updateShool(Shool shool){
        if(shoolService.updateShool(shool)>0){
            return ResultGenerator.genSuccessResult(shool.getS_id());
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("/del")
    public Result delShool(Integer s_id){
        if(shoolService.delShool(s_id)>0){
            return ResultGenerator.genSuccessResult(s_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("/getshools")
    public Result getShools(Integer pageNo,Integer pageSize,String s_name){
        PageInfo<Shool> shools = shoolService.getShools(pageNo, pageSize, s_name);
        if (shools.getList().size()>0){
            return ResultGenerator.genSuccessResult(shools);
        }
        return ResultGenerator.genFailResult("查询失败");
    }
    @PostMapping("/getshool")
    public Result getShoolBySID(Integer s_id){
        Shool shoolBySID = shoolService.getShoolBySID(s_id);
        if(shoolBySID!=null){
            return ResultGenerator.genSuccessResult(shoolBySID);
        }
        return ResultGenerator.genFailResult("查询失败");
    }
}

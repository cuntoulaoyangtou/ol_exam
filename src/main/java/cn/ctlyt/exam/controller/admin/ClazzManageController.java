package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.pojo.ClazzManage;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.ClazzManageService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassNameClazzManageController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/21 0021 21:42
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/clazzmanage")
public class ClazzManageController {
    @Autowired
    ClazzManageService clazzManageService;
    @PostMapping("add")
    public Result addClazzManage(ClazzManage clazzManage){
        if(clazzManageService.addClazzManage(clazzManage)>0){
            return ResultGenerator.genSuccessResult(clazzManage);
        }
        return ResultGenerator.genFailResult("添加班级管理员失败");
    }
    @PostMapping("adds")
    public Result addClazzManages(@RequestParam(value="u_id" ,required=true)Integer u_id,@RequestParam(value="c_ids" ,required=true) String c_ids){
        if(c_ids==null){
            return ResultGenerator.genFailResult("班级为空");
        }
        List<Integer> integers = JSON.parseArray(c_ids, Integer.class);
        int i = clazzManageService.addClazzManages(u_id, integers);
        if(i>0){
            return ResultGenerator.genSuccessResult(i);
        }
        return ResultGenerator.genFailResult("添加班级管理员失败");
    }
    @PostMapping("update")
    public Result updateClazzManage(ClazzManage clazzManage){
        if(clazzManageService.updateClazzManage(clazzManage)>0){
            return ResultGenerator.genSuccessResult(clazzManage);
        }
        return ResultGenerator.genFailResult("修改班级管理员失败");
    }
    @PostMapping("del")
    public Result delClazzManage(@RequestParam(value="cm_id",defaultValue="0" ,required=false)Integer cm_id,@RequestParam(value="u_id",defaultValue="0" ,required=false)Integer u_id){
        if(clazzManageService.delClazzManage(cm_id,u_id)>0){
            return ResultGenerator.genSuccessResult(cm_id);
        }
        return ResultGenerator.genFailResult("删除班级管理员失败");
    }
    @PostMapping("getclazzmanages")
    public Result getClazzManages(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false) Integer pageSize, ClazzManage clazzManage){
        PageInfo<ClazzManage> clazzManages = clazzManageService.getClazzManages(pageNo, pageSize, clazzManage);
        return ResultGenerator.genSuccessResult(clazzManages);
    }
    @PostMapping("getclazzmanage")
    public Result getClazzManage(Integer cm_id){
        ClazzManage clazzManage = clazzManageService.getClazzManage(cm_id);
        return ResultGenerator.genSuccessResult(clazzManage);
    }

}

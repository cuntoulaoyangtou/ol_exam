package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.Shool;
import cn.ctlyt.exam.service.ShoolService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameShoolController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 9:21
 * @Version V1.0
 **/
@RestController(value = "apiShoolController")
@RequestMapping("api/shool")
public class ShoolController {
    @Autowired
    ShoolService shoolService;
    @GetMapping("getshools")
    public Result getShools(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo,@RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize,@RequestParam(value="s_name",defaultValue="" ,required=false)String s_name){
        PageInfo<Shool> shools = shoolService.getShools(pageNo, pageSize, s_name);
        return ResultGenerator.genSuccessResult(shools);
    }
}

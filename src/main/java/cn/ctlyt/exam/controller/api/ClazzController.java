package cn.ctlyt.exam.controller.api;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.service.ClazzService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameClazzController
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 9:56
 * @Version V1.0
 **/
@RestController(value = "apiClazzController")
@RequestMapping("api/clazz")
public class ClazzController {
    @Autowired
    ClazzService clazzService;
    @GetMapping("getclazzs")
    public Result getClazzs(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false)Integer pageSize, Clazz clazz, @RequestParam(value="s_id",defaultValue="0" ,required=false)Integer s_id){
        PageInfo<Clazz> clazzs = clazzService.getClazzs(pageNo, pageSize, clazz, s_id);
        if(clazzs.getList().size()>0){
            return ResultGenerator.genSuccessResult(clazzs);
        }else{
            throw new BizException("没有班级数据",clazz);
        }
    }
    @GetMapping("getclazz")
    public Result getClazz(Integer c_id){
        Clazz clazz = clazzService.getClazz(c_id);
        if(clazz==null){
            throw new BizException("没有班级数据",(Object)("c_id:"+c_id));
        }
        return ResultGenerator.genSuccessResult(clazz);
    }
}

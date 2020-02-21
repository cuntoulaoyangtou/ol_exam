package cn.ctlyt.exam.controller.admin;

import cn.ctlyt.exam.mapper.RoleMapper;
import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.pojo.Role;
import cn.ctlyt.exam.service.RoleService;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameRoleControler
 * @Description 角色
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 3:38
 * @Version V1.0
 **/
@RestController
@RequestMapping("admin/role")
public class RoleControler {
    @Autowired
    RoleService roleService;
    @PostMapping("add")
    public Result addRole(Role role){
        if(roleService.addRole(role)>0){
            return ResultGenerator.genSuccessResult(role.getR_id());
        }
        return ResultGenerator.genFailResult("添加失败");
    }
    @PostMapping("update")
    public Result updateRole(Role role){
        if(roleService.updateRole(role)>0){
            return ResultGenerator.genSuccessResult(role.getR_id());
        }
        return ResultGenerator.genFailResult("修改失败");
    }
    @PostMapping("del")
    public Result delRole(Integer r_id){
        if(roleService.delRole(r_id)>0){
            return ResultGenerator.genSuccessResult(r_id);
        }
        return ResultGenerator.genFailResult("删除失败");
    }
    @PostMapping("getroles")
    public Result getRoles(@RequestParam(value="pageNo",defaultValue="1" ,required=false)Integer pageNo, @RequestParam(value="pageSize",defaultValue="20" ,required=false) Integer pageSize, @RequestParam(value="r_name",defaultValue="" ,required=false) String r_name){
        PageInfo<Role> roles = roleService.getRoles(pageNo, pageSize, r_name);
        return ResultGenerator.genSuccessResult(roles);
    }
    @PostMapping("getrole")
    public Result getRole(Integer r_id){
        Role role = roleService.getRole(r_id);
        return ResultGenerator.genSuccessResult(role);
    }
}

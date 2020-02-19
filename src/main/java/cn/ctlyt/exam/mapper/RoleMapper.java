package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Role;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassNameRoleMapper
 * @Description 角色Mapper
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 16:30
 * @Version V1.0
 **/
@Repository
public interface RoleMapper extends Mapper<Role> {
}

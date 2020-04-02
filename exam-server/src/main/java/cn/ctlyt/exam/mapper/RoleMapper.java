package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameRoleMapper
 * @Description 角色Mapper
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 16:30
 * @Version V1.0
 **/
@Repository
public interface RoleMapper extends Mapper<Role> {
    @Select("select * from `u_role` where r_id < #{r_id}")
    public List<Role> getRolesLessRID(Integer r_id);
}

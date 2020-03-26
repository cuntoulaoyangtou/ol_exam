package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.RoleMapper;
import cn.ctlyt.exam.pojo.Role;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameRoleService
 * @Description 角色
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 19:47
 * @Version V1.0
 **/
@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    /*
     * 功能描述：添加角色
     * @param [role]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:09
     *
     */
    public int addRole(Role role){
        return roleMapper.insert(role);
    }
    /*
     * 功能描述：修改角色
     * @param [role]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:11
     *
     */
    public int updateRole(Role role){
        return roleMapper.updateByPrimaryKeySelective(role);
    }
    /*
     * 功能描述：删除角色
     * @param [r_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:10
     *
     */
    public int delRole(Integer r_id){
        return roleMapper.deleteByPrimaryKey(r_id);
    }
    /*
     * 功能描述：分页模糊查询
     * @param [pageNo, pageSize, r_name]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Role>
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:12
     *
     */
    public PageInfo<Role> getRoles(Integer pageNo,Integer pageSize,String r_name){
        PageHelper.startPage(pageNo,pageSize);
        Example example = new Example(Role.class);
        if(r_name!=null){
            Example.Criteria criteria = example.createCriteria();
            criteria.andLike("r_name","%"+r_name+"%");
        }
        List<Role> roles = roleMapper.selectByExample(example);
        return new PageInfo<Role>(roles);
    }
    /*
     * 功能描述：获取角色
     * @param [r_id]
     * @return cn.ctlyt.exam.pojo.Role
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:21
     *
     */
    public Role getRole(Integer r_id){
        return roleMapper.selectByPrimaryKey(r_id);
    }
}

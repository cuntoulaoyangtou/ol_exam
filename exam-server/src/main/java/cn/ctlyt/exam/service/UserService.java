package cn.ctlyt.exam.service;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.mapper.*;
import cn.ctlyt.exam.pojo.*;
import cn.ctlyt.exam.utils.PatternUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassNameUserService
 * @Description 用户
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 19:44
 * @Version V1.0
 **/
@Service
@Transactional
public class UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    ClazzMapper clazzMapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    ClazzManageMapper clazzManageMapper;
    @Autowired
    ShoolMapper shoolMapper;
    @Autowired
    GradeMapper gradeMapper;
    @Autowired
    MajorMapper majorMapper;

    public Map preUser(User user) {
        Map map = new HashMap();
        if (user.getR_id() <= 6) {
            List<Clazz> clazzsByUID = clazzMapper.getClazzsByUID(user.getU_id());
            List<Role> rolesLessRID = roleMapper.getRolesLessRID(user.getR_id());
            if (clazzsByUID == null || clazzsByUID.size() <= 0) {
                throw new BizException("请联系上级领导添加管理班级");
            }
            map.put("clazzes", clazzsByUID);
            map.put("roles", rolesLessRID);
        } else {
            //查询学校
            List<Shool> shools = shoolMapper.selectAll();
            //查询年级
            List<Grade> grades = gradeMapper.selectAll();
            //查询班级
            List<Clazz> clazzes = clazzMapper.selectAll();
            List<Role> roles = roleMapper.selectAll();
            map.put("shools", shools);
            map.put("grades", grades);
            map.put("clazzes", clazzes);
            map.put("roles", roles);
        }
        List<Major> majors = majorMapper.selectAll();
        map.put("majors", majors);
        return map;
    }

    /*
     * 功能描述：添加用户
     * @param [user]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:26
     *
     */
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    /*
     * 功能描述：修改用户
     * @param [user]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:26
     *
     */
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    /*
     * 功能描述：删除用户
     * @param [u_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:27
     *
     */
    public int delUser(Integer u_id) {
        return userMapper.deleteByPrimaryKey(u_id);
    }

    /*
     * 功能描述：分页查询 根据真实名 手机号 模糊查询 或角色id 班级id 年级id 学校id
     * @param [pageNo, pageSize, user, g_id, s_id]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.User>
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 21:46
     *
     */
    public PageInfo<User> getUsers(Integer pageNo, Integer pageSize, User user, Integer g_id, Integer s_id, Integer m_id, Boolean cm) {
        PageHelper.startPage(pageNo, pageSize);
        List<User> users;
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        //根据用户名查询
        if (user.getReal_name() != null) {
            criteria.andLike("real_name", "%" + user.getReal_name() + "%");
        }
        //根据电话号查询
        if (user.getPhone() != null) {
            criteria.andLike("phone", "%" + user.getPhone() + "%");
        }
        //根据班级查询
        if (user.getC_id() != null && user.getC_id() != 0) {
            criteria.andEqualTo("c_id", user.getC_id());
        }
        //根据角色id
        if (user.getR_id() != null && user.getR_id() != 0) {
            criteria.andEqualTo("r_id", user.getR_id());
        }
        //根据学校查询
        if (s_id != null && s_id != 0) {
            if (m_id != null && m_id != 0) {
                users = userMapper.getUsersBy(m_id, s_id, g_id);
            } else {
                users = userMapper.getUsersBySID(s_id, user.getR_id());
            }

        } else {
            //根据年级查询
            if (m_id != null && m_id != 0) {
                users = userMapper.getUsersBy(m_id, null, g_id);
            } else {
                if (g_id != null && g_id != 0) {
                    users = userMapper.getUsersByGID(g_id);
                } else {
                    users = userMapper.selectByExample(example);
                }
            }
        }
        if (cm) {
            for (User user1 : users) {
                user1.setClazzManages(clazzManageMapper.getClazzManages(user1.getU_id(), null));
            }
        }
        return new PageInfo<>(users);
    }

    public PageInfo<User> getUsersBySelectUser(Integer pageNo, Integer pageSize, User user, Integer m_id, User suser) {
        List<Clazz> clazzsByUID = clazzMapper.getClazzsByUID(suser.getU_id());
        PageHelper.startPage(pageNo, pageSize);
        List<User> users;
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        //根据用户名查询
        if (user.getReal_name() != null) {
            criteria.andLike("real_name", "%" + user.getReal_name() + "%");
        }
        //根据电话号查询
        if (user.getPhone() != null) {
            criteria.andLike("phone", "%" + user.getPhone() + "%");
        }
        //根据班级查询
        boolean cl = false;
        List cids = new ArrayList();
        for (Clazz clazz : clazzsByUID) {
            if (user.getC_id() == clazz.getC_id()) {
                criteria.andEqualTo("c_id", user.getC_id());
                cl = true;
                break;
            }
            if (m_id != null && m_id != 0) {
                if (m_id == clazz.getM_id()) {
                    cids.add(clazz.getC_id());
                }
            } else {
                cids.add(clazz.getC_id());
            }
        }
        if (!cl && cids.size()>0) {
            criteria.andIn("c_id", cids);
        }
        if (user.getC_id() != null && user.getC_id() != 0) {
            criteria.andEqualTo("c_id", user.getC_id());
        }
        //根据角色id
        if (user.getR_id() != null && user.getR_id() != 0) {
            criteria.andEqualTo("r_id", user.getR_id());
        }
        return new PageInfo<>(userMapper.selectByExample(example));
    }

    /*
     * 功能描述：查询用户
     * @param [user]
     * @return cn.ctlyt.exam.pojo.User
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 22:59
     *
     */
    public User getUser(User user) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        if (PatternUtil.regUsername(user.getUsername())) {
            //根据用户名
            criteria.andEqualTo("username", user.getUsername());
        } else {
            if (PatternUtil.regPhone(user.getPhone())) {
                //根据手机号
                criteria.andEqualTo("phone", user.getPhone());
            } else {
                if (user.getU_id() != null && user.getU_id() != 0) {
                    User user1 = userMapper.selectByPrimaryKey(user.getU_id());
                    user1.setPassword(null);
                    return user1;
                }
            }
        }
        criteria.andEqualTo("password", user.getPassword());
        User user1 = userMapper.selectOneByExample(example);
        if (user1 != null) {
            user1.setPassword(null);
        }
        return user1;
    }
    /*
     * 功能描述：根据手机号获取用户
     * @param [phone]
     * @return cn.ctlyt.exam.pojo.User
     * @Author: 村头老杨头
     * @Date: 2020/4/30 0030 17:28
     *
     */
    public User getUserByPhone(String phone){

        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("phone",phone);
        User user = userMapper.selectOneByExample(example);
        return user;
    }
}

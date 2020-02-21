package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.ClazzMapper;
import cn.ctlyt.exam.mapper.GradeMapper;
import cn.ctlyt.exam.mapper.UserMapper;
import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.Grade;
import cn.ctlyt.exam.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassNameUserService
 * @Description 用户
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 19:44
 * @Version V1.0
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    /*
     * 功能描述：添加用户
     * @param [user]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:26
     *
     */
    public int addUser(User user){
        return userMapper.insert(user);
    }
    /*
     * 功能描述：修改用户
     * @param [user]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 20:26
     *
     */
    public int updateUser(User user){
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
    public int delUser(Integer u_id){
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
    public PageInfo<User> getUsers(Integer pageNo,Integer pageSize,User user,Integer g_id,Integer s_id,Integer m_id){
        PageHelper.startPage(pageNo,pageSize);
        List<User> users;
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        //根据用户名查询
        if(user.getReal_name() !=null){
            criteria.andLike("real_name","%"+user.getReal_name()+"%");
        }
        //根据电话号查询
        if(user.getPhone() != null){
            criteria.andLike("phone","%"+user.getPhone()+"%");
        }
        //根据班级查询
        if(user.getC_id()!= null && user.getC_id()!=0){
            criteria.andEqualTo("c_id",user.getC_id());
        }
        //根据角色id
        if(user.getR_id()!= null && user.getR_id()!=0){
            criteria.andEqualTo("r_id",user.getR_id());
        }
        //根据学校查询
        if(s_id!=null && s_id!=0){
            if(m_id!=null && m_id!=0){
                users = userMapper.getUsersBy(m_id,s_id,g_id);
            }else{
                users = userMapper.getUsersBySID(s_id);
            }

        }else{
            //根据年级查询
            if(m_id!=null && m_id!=0){
                users = userMapper.getUsersBy(m_id,null,g_id);
            }else{
                if(g_id!=null && g_id!=0){
                    users = userMapper.getUsersByGID(g_id);
                }else{
                    users = userMapper.selectByExample(example);
                }
            }
        }
        return new PageInfo<>(users);
    }
    /*
     * 功能描述：查询用户
     * @param [user]
     * @return cn.ctlyt.exam.pojo.User
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 22:59
     *
     */
    public User getUser(User user){
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        if(user.getUsername()!=null && !user.getUsername().equals("") && user.verifyUsername()){
            //根据用户名
            criteria.andEqualTo("username",user.getUsername());
        }else{
            if(user.getPhone() !=null && !user.getPhone().equals("") && user.verifyPhone()){
                //根据手机号
                criteria.andEqualTo("phone",user.getPhone());
            }else{
                if(user.getU_id()!=null && user.getU_id()!=0){
                    User user1 = userMapper.selectByPrimaryKey(user.getU_id());
                    user1.setPassword("");
                    return user1;
                }
            }
        }
        criteria.andEqualTo("password",user.getPassword());
        User user1 = userMapper.selectOneByExample(example);
        if(user1!=null){
            user1.setPassword("");
        }
        return user1;
    }
}

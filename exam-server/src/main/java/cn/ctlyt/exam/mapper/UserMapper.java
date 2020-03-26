package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameUserMapper
 * @Description 用户Mapper
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 16:28
 * @Version V1.0
 **/
@Repository
public interface UserMapper extends Mapper<User> {
    @Select("select * from u_user where c_id in(select c_id from u_clazz where g_id = #{g_id})")
    public List<User> getUsersByGID(Integer g_id);
    @Select("<script>select * from u_user where c_id in(select c_id from u_clazz where g_id in (select g_id from u_grade where s_id = #{s_id}))<if test='r_id!=null and r_id!=0'> and r_id=#{r_id}</if></script>")
    public List<User> getUsersBySID(Integer s_id,Integer r_id);
    @Select("<script>select * from u_user where c_id in (select c_id from u_clazz where m_id=#{m_id})" +
            "<if test='s_id != null and s_id!=0'>and c_id in(select c_id from u_clazz where g_id in (select g_id from u_grade where s_id = #{s_id} " +
            "<if test='g_id!=null and g_id!=0'>and g_id = #{g_id} </if>) )</if></script>")
    public List<User> getUsersBy(Integer m_id, Integer s_id, Integer g_id);
}

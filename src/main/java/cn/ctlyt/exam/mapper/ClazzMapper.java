package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Clazz;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameClazzMapper
 * @Description 班级Mapper
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 16:32
 * @Version V1.0
 **/
@Repository
public interface ClazzMapper extends Mapper<Clazz> {
    @Select("select * from u_clazz where g_id in(select g_id from u_grade where s_id = #{s_id})")
    public List<Clazz> getClazzsBySID(Integer s_id);
}

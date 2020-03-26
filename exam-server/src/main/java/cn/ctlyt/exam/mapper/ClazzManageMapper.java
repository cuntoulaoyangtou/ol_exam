package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.ClazzManage;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameClazzManageMapper
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/21 0021 20:54
 * @Version V1.0
 **/
@Repository
public interface ClazzManageMapper extends Mapper<ClazzManage> {
    @Select("<script>" +
            "select * from u_clazz_manage <where><if test='u_id!=null and u_id!=0'>u_id=#{u_id}</if><if test='c_id!=null and c_id!=0'> or c_id=#{c_id}</if></where>" +
            "</script>")
    @Results(id = "q_all", value = {
            @Result(column = "u_id",property = "u_id"),
            @Result(column = "u_id",property = "user", one = @One(select = "cn.ctlyt.exam.mapper.UserMapper.selectByPrimaryKey")),
            @Result(column = "c_id",property = "c_id"),
            @Result(column = "c_id",property = "clazz", one = @One(select = "cn.ctlyt.exam.mapper.ClazzMapper.selectByPrimaryKey")),
    })
    public List<ClazzManage> getClazzManages(Integer u_id,Integer c_id);
}

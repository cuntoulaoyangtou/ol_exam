package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Option;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameOptionMapper
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:11
 * @Version V1.0
 **/
@Repository
public interface OptionMapper extends Mapper<Option> {
    @Select("select * from e_option where q_id=#{q_id}")
    List<Option> getOptionsByQID(Integer q_id);
}

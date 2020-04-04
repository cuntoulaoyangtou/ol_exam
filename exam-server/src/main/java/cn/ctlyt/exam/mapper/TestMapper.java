package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

@Repository
public interface TestMapper extends Mapper<Test> {
    @Select("<script></script>")
    public List<Test> getTestByDateAndCID(String t_title, Date start_time,Date end_time,Integer c_id, Integer g_id,Integer s_id);
}

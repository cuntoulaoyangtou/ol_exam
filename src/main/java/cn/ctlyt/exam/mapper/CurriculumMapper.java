package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Curriculum;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/**
 * @ClassNameCurriculumMapper
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 19:40
 * @Version V1.0
 **/
@Repository
public interface CurriculumMapper extends Mapper<Curriculum> {
    @Select("select * from e_curriculum where m_id = #{m_id} order by cum_priority")
    @Results(id = "cum_all", value = {
            @Result(column = "cum_id",property = "cum_id"),
            @Result(column = "cum_id",property = "chapters", many = @Many( select = "cn.ctlyt.exam.mapper.ChapterMapper.getChapters")),
    })
    public List<Curriculum> getCurriculums(Integer m_id);
}

package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Chapter;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameChapterMapper
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 19:39
 * @Version V1.0
 **/
@Repository
public interface ChapterMapper extends Mapper<Chapter> {
    @Select("select * from e_chapter where cum_id = #{cum_id} order by ec_priority")
    public List<Chapter> getChapters(Integer cum_id);
}

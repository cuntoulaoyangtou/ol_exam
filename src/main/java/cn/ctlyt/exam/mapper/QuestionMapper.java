package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Question;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassNameQuestionMapper
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:10
 * @Version V1.0
 **/
@Repository
public interface QuestionMapper extends Mapper<Question> {
    @Select("<script>select * from e_question <where>" +
            "           <if test=\"q_content!=null and q_content != ''\">" +
            "                and q_content like '%' #{q_content} '%'" +
            "            </if>" +
            "            <if test=\"qt_id > 0\">" +
            "                and qt_id = #{qt_id}" +
            "            </if>" +
            "            <if test=\"ec_id > 0\">" +
            "                and ec_id = #{ec_id}" +
            "            </if>" +
            "        </where>" +
            " order by q_id desc" +
            "</script>")
    @Results(id = "question_all", value = {
            @Result(column = "q_id",property = "q_id"),
            @Result(column = "q_id",property = "options", many = @Many( select = "cn.ctlyt.exam.mapper.OptionMapper.getOptionsByQID")),
    })
    public List<Question> getQuestionsLikeContent(String q_content,Integer qt_id,Integer ec_id);
}

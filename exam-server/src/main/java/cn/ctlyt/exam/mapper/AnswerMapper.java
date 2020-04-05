package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Answer;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface AnswerMapper extends Mapper<Answer>, MySqlMapper<Answer> {
}

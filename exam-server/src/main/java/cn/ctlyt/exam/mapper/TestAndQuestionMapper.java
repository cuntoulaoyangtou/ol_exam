package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.TestAndQustion;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface TestAndQuestionMapper extends Mapper<TestAndQustion>, MySqlMapper<TestAndQustion> {
}

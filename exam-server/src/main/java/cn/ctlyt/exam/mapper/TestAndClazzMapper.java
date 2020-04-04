package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.TestAndClazz;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.ArrayList;

@Repository
public interface TestAndClazzMapper extends Mapper<TestAndClazz>, MySqlMapper<TestAndClazz> {
}

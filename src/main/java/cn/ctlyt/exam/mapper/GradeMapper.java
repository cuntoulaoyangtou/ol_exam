package cn.ctlyt.exam.mapper;

import cn.ctlyt.exam.pojo.Grade;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @ClassNameGradeMapper
 * @Description 年级Mapper
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 16:32
 * @Version V1.0
 **/
@Repository
public interface GradeMapper extends Mapper<Grade> {
}

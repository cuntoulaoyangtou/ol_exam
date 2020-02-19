package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.GradeMapper;
import cn.ctlyt.exam.pojo.Grade;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameGradeService
 * @Description 年级
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 3:15
 * @Version V1.0
 **/
@Service
public class GradeService {
    @Autowired
    GradeMapper gradeMapper;
    /*
     * 功能描述：添加年级
     * @param [grade]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 3:29
     *
     */
    public int addGrade(Grade grade){
        return gradeMapper.insert(grade);
    }
    /*
     * 功能描述：修改年级
     * @param [grade]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 3:30
     *
     */
    public int updateGrade(Grade grade){
        return gradeMapper.updateByPrimaryKeySelective(grade);
    }
    /*
     * 功能描述：删除年级
     * @param [g_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 3:33
     *
     */
    public int delGrade(Integer g_id){
        return gradeMapper.deleteByPrimaryKey(g_id);
    }
    /*
     * 功能描述：分页查询 模糊
     * @param [pageNo, pageSize, g_name]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Grade>
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 3:36
     *
     */
    public PageInfo<Grade> getGrades(Integer pageNo,Integer pageSize,String g_name,Integer s_id){
        PageHelper.startPage(pageNo,pageSize);
        List<Grade> grades;
        Example example = new Example(Grade.class);
        example.orderBy("g_priority");
        Example.Criteria criteria = example.createCriteria();
        if(g_name!=null){
            criteria.andLike("g_name","%"+g_name+"%");
        }
        if(s_id!=null && s_id!=0){
            criteria.andEqualTo("s_id",s_id);
        }
        grades = gradeMapper.selectByExample(example);
        return new PageInfo<Grade>(grades);
    }
    /*
     * 功能描述：查询年级
     * @param [g_id]
     * @return cn.ctlyt.exam.pojo.Grade
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 3:42
     *
     */
    public Grade getGrade(Integer g_id){
        return gradeMapper.selectByPrimaryKey(g_id);
    }
}

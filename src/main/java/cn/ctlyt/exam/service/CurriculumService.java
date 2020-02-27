package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.CurriculumMapper;
import cn.ctlyt.exam.pojo.Curriculum;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameCurriculumService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 19:42
 * @Version V1.0
 **/
@Service
public class CurriculumService {
    @Autowired
    CurriculumMapper curriculumMapper;

    /*
     * 功能描述：添加课程
     * @param [curriculum]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 19:50
     *
     */
    public int addCurriculum(Curriculum curriculum){
        return curriculumMapper.insert(curriculum);
    }

    /*
     * 功能描述：修改课程
     * @param [curriculum]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 19:50
     *
     */
    public int updateCurriculum(Curriculum curriculum){
        return curriculumMapper.updateByPrimaryKeySelective(curriculum);
    }
    /*
     * 功能描述：删除课程
     * @param [cum_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 19:51
     *
     */
    public int delCurriculum(Integer cum_id){
        return curriculumMapper.deleteByPrimaryKey(cum_id);
    }
    /*
     * 功能描述：根据分类查询课程
     * @param [m_id]
     * @return java.util.List<cn.ctlyt.exam.pojo.Curriculum>
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:06
     *
     */
    public List<Curriculum> getCurriculumsBYMID(Integer m_id){
        return curriculumMapper.getCurriculums(m_id);
    }

    /*
     * 功能描述：分页模糊查询
     * @param [pageNo, pageSize, cum_name, m_id]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Curriculum>
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 19:52
     *
     */
    public PageInfo<Curriculum> getCurriculums(Integer pageNo, Integer pageSize, String cum_name, Integer m_id){
        PageHelper.startPage(pageNo,pageSize);
        List<Curriculum> curriculums;
        Example example = new Example(Curriculum.class);
        example.orderBy("cum_priority");
        Example.Criteria criteria = example.createCriteria();
        if(cum_name!=null){
            criteria.andLike("cum_name","%"+cum_name+"%");
        }
        if(m_id!=null && m_id!=0){
            criteria.andEqualTo("cum_id",m_id);
        }
        curriculums = curriculumMapper.selectByExample(example);
        return new PageInfo<Curriculum>(curriculums);
    }
    /*
     * 功能描述：查询课程
     * @param [cum_id]
     * @return cn.ctlyt.exam.pojo.Curriculum
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 19:54
     *
     */
    public Curriculum getCurriculum(Integer cum_id){
        return curriculumMapper.selectByPrimaryKey(cum_id);
    }
}

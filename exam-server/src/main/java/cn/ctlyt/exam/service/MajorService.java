package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.MajorMapper;
import cn.ctlyt.exam.pojo.Major;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameMajorService
 * @Description 专业
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 3:20
 * @Version V1.0
 **/
@Service
public class MajorService {
    @Autowired
    MajorMapper majorMapper;

    /*
     * 功能描述：添加专业
     * @param [major]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/19 0019 3:21
     *
     */
    public int addMajor(Major major){
        return majorMapper.insert(major);
    }
    /*
     * 功能描述：修改专业
     * @param [major]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/19 0019 3:24
     *
     */
    public int updateMajor(Major major){
        return majorMapper.updateByPrimaryKeySelective(major);
    }
    /*
     * 功能描述：删除专业
     * @param [m_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/19 0019 3:26
     *
     */
    public int delMajor(Integer m_id){
        return majorMapper.deleteByPrimaryKey(m_id);
    }
    /*
     * 功能描述：分页模糊查询
     * @param [pageNo, pageSize, m_name]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Major>
     * @Author: 村头老杨头
     * @Date: 2020/2/19 0019 3:32
     *
     */
    public PageInfo<Major> getMajors(Integer pageNo,Integer pageSize, String m_name){
        PageHelper.startPage(pageNo,pageSize);
        Example example = new Example(Major.class);
        example.orderBy("m_priority");
        if(m_name!=null){
            Example.Criteria criteria = example.createCriteria();
            criteria.andLike("m_name","%"+m_name+"%");
        }
        List<Major> majors = majorMapper.selectByExample(example);
        return new PageInfo<Major>(majors);
    }
    /*
     * 功能描述：查询专业
     * @param [m_id]
     * @return cn.ctlyt.exam.pojo.Major
     * @Author: 村头老杨头
     * @Date: 2020/2/19 0019 3:34
     *
     */
    public Major getMajor(Integer m_id){
        return majorMapper.selectByPrimaryKey(m_id);
    }
}

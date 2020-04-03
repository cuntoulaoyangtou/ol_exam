package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.ClazzMapper;
import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.Grade;
import cn.ctlyt.exam.utils.RedisUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameClazzService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 19:24
 * @Version V1.0
 **/
@Service
public class ClazzService {
    @Autowired
    ClazzMapper clazzMapper;

    /*
     * 功能描述：添加班级
     * @param [clazz]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 19:27
     *
     */
    public int addClazz(Clazz clazz){
        RedisUtil.del("shools","shoolTree","grades","gradeTree","classes");
        return clazzMapper.insert(clazz);
    }

    /*
     * 功能描述：修改班级
     * @param [clazz]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 19:29
     *
     */
    public int updateClazz(Clazz clazz){
        RedisUtil.del("shools","shoolTree","grades","gradeTree","classes");
        return clazzMapper.updateByPrimaryKeySelective(clazz);
    }

    /*
     * 功能描述：删除班级
     * @param [c_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 19:29
     *
     */
    public int delClazz(Integer c_id){
        RedisUtil.del("shools","shoolTree","grades","gradeTree","classes");
        return clazzMapper.deleteByPrimaryKey(c_id);
    }

    /*
     * 功能描述：分页模糊查询
     * @param [pageNo, pageSize, c_name]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Clazz>
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 19:32
     *
     */
    public PageInfo<Clazz> getClazzs(Integer pageNo, Integer pageSize, Clazz clazz, Integer s_id){
        PageHelper.startPage(pageNo,pageSize);
        List<Clazz> clazzs;
        Example example = new Example(Clazz.class);
        example.orderBy("c_priority");
        Example.Criteria criteria = example.createCriteria();
        if(clazz.getC_name()!=null){
            criteria.andLike("c_name","%"+clazz.getC_name()+"%");
        }
        if(clazz.getG_id()!=null && clazz.getG_id()!=0) {
            criteria.andEqualTo("g_id",clazz.getG_id());
        }
        if(clazz.getM_id()!=null && clazz.getM_id()!=0){
            criteria.andEqualTo("m_id",clazz.getM_id());
        }
        if(s_id!=null && s_id!=0){
            clazzs = clazzMapper.getClazzsBySID(s_id,clazz.getM_id());
        }else {
            clazzs = clazzMapper.selectByExample(example);
        }
        return new PageInfo<Clazz>(clazzs);
    }

    /*
     * 功能描述：查询班级
     * @param [c_id]
     * @return cn.ctlyt.exam.pojo.Clazz
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 19:34
     *
     */
    public Clazz getClazz(Integer c_id){
        return clazzMapper.selectByPrimaryKey(c_id);
    }
}

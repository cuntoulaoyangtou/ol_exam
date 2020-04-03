package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.ShoolMapper;
import cn.ctlyt.exam.pojo.Shool;
import cn.ctlyt.exam.utils.RedisUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameShoolService
 * @Description
 * @Author Administrator
 * @Date 2020/2/17 0017 16:36
 * @Version V1.0
 **/
@Service
public class ShoolService {
    @Autowired
    ShoolMapper shoolMapper;

    /*
     * 功能描述：添加学校
     * @param [shool]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/17 0017 16:56
     *
     */
    public int addShool(Shool shool){
        RedisUtil.del("shools","shoolTree","grades","gradeTree","classes");
        return shoolMapper.insert(shool);
    }

    /*
     * 功能描述：修改学校
     * @param [shool]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/17 0017 16:58
     *
     */
    public int updateShool(Shool shool){
        RedisUtil.del("shools","shoolTree","grades","gradeTree","classes");
        return shoolMapper.updateByPrimaryKeySelective(shool);
    }
    /*
     * 功能描述：删除学校
     * @param [sid]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/17 0017 17:01
     *
     */
    public int delShool(Integer sid){
        RedisUtil.del("shools","shoolTree","grades","gradeTree","classes");
        return shoolMapper.deleteByPrimaryKey(sid);
    }
    /*
     * 功能描述：分页查询学校 模糊查询
     * @param [pageNo, pageSize， s_name]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Shool>
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 2:36
     *
     */
    public PageInfo<Shool> getShools(Integer pageNo, Integer pageSize,String s_name){

        PageHelper.startPage(pageNo,pageSize);
        List<Shool> shools;
        if(s_name!=null){
            Example example = new Example(Shool.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andLike("s_name","%"+s_name+"%");
            shools = shoolMapper.selectByExample(example);
        }else{
            shools = shoolMapper.selectAll();
        }
        return new PageInfo<Shool>(shools);
    }
    /*
     * 功能描述：根据学校id获取学校
     * @param [s_id]
     * @return cn.ctlyt.exam.pojo.Shool
     * @Author: 村头老杨头
     * @Date: 2020/2/18 0018 2:39
     *
     */
    public Shool getShoolBySID(Integer s_id){
        return shoolMapper.selectByPrimaryKey(s_id);
    }
}

package cn.ctlyt.exam.service;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.mapper.ClazzManageMapper;
import cn.ctlyt.exam.pojo.ClazzManage;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameClazzManageService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/21 0021 20:57
 * @Version V1.0
 **/
@Service
public class ClazzManageService {
    @Autowired
    ClazzManageMapper clazzManageMapper;

    /*
     * 功能描述：添加班级管理员
     * @param [clazzManage]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/21 0021 21:01
     *
     */
    public int addClazzManage(ClazzManage clazzManage){
        if(clazzManage.getU_id()!=null && clazzManage.getU_id()!=0){
            throw new BizException("用户ID不允许为空",clazzManage);
        }
        if(clazzManage.getC_id()!=null && clazzManage.getC_id()!=0){
            throw new BizException("班级ID不允许为空",clazzManage);
        }
        return clazzManageMapper.insert(clazzManage);
    }
    /*
     * 功能描述：批量插入管理班级
     * @param [u_id, c_ids]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/21 0021 23:56
     *
     */
    public int addClazzManages(Integer u_id,List<Integer> c_ids){
        int tmp=0;
        for (Integer c_id: c_ids) {
            ClazzManage clazzManage = new ClazzManage();
            clazzManage.setU_id(u_id);
            clazzManage.setC_id(c_id);
            clazzManageMapper.insert(clazzManage);
            tmp++;
        }
        return tmp;
    }
    /*
     * 功能描述：修改班级管理员
     * @param [clazzManage]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/21 0021 21:03
     *
     */
    public int updateClazzManage(ClazzManage clazzManage){
        if(clazzManage.getU_id()!=null && clazzManage.getU_id()!=0){
            throw new BizException("用户ID不允许为空",clazzManage);
        }
        if(clazzManage.getC_id()!=null && clazzManage.getC_id()!=0){
            throw new BizException("班级ID不允许为空",clazzManage);
        }
        return clazzManageMapper.updateByPrimaryKeySelective(clazzManage);
    }
    /*
     * 功能描述：删除班级管理员
     * @param [cm_id, u_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/21 0021 21:04
     *
     */
    public int delClazzManage(Integer cm_id, Integer u_id){
        if(u_id!=null && u_id!=0 ){
            Example example = new Example(ClazzManage.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("u_id",u_id);
            return clazzManageMapper.deleteByExample(example);
        }
        return clazzManageMapper.deleteByPrimaryKey(cm_id);
    }
    /*
     * 功能描述：分组模糊查询班级管理员
     * @param [pageNo, pageSize, clazzManage]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.ClazzManage>
     * @Author: 村头老杨头
     * @Date: 2020/2/21 0021 21:14
     *
     */
    public PageInfo<ClazzManage> getClazzManages(Integer pageNo,Integer pageSize,ClazzManage clazzManage){
        PageHelper.startPage(pageNo,pageSize);
        List<ClazzManage> clazzManages = clazzManageMapper.getClazzManages(clazzManage.getU_id(),clazzManage.getC_id());
        return new PageInfo<ClazzManage>(clazzManages);
    }
    /*
     * 功能描述：获取管理员
     * @param [cm_id]
     * @return cn.ctlyt.exam.pojo.ClazzManage
     * @Author: 村头老杨头
     * @Date: 2020/2/21 0021 21:15
     *
     */
    public ClazzManage getClazzManage(Integer cm_id){
        return clazzManageMapper.selectByPrimaryKey(cm_id);
    }

}

package cn.ctlyt.exam.service;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.mapper.ClazzMapper;
import cn.ctlyt.exam.mapper.TestMapper;
import cn.ctlyt.exam.pojo.Clazz;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: exam
 * @description: 试卷服务
 * @author: 村头老杨头
 * @create: 2020-04-03 10:57
 */
@Service
public class TestService {
    @Autowired
    TestMapper testMapper;
    @Autowired
    ClazzMapper clazzMapper;
    @Autowired
    OtherService otherService;
    public List<Tree> preTest(User user){
        List trees = new ArrayList();
        if(user.getR_id()<7){
            //查询班级
            List<Clazz> clazzsByUID = clazzMapper.getClazzsByUID(user.getU_id());
            if(clazzsByUID == null || clazzsByUID.size()<=0){
                throw new BizException("请联系上级主管添加管理班级");
            }
            for(Clazz clazz : clazzsByUID){
                trees.add(new Tree(clazz.getC_name(),clazz.getC_id()));
            }
        }else{
            //查询学校树
            return otherService.getShoolTree();
        }
        return trees;
    }
}
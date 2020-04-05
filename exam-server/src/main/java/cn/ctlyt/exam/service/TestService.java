package cn.ctlyt.exam.service;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.mapper.*;
import cn.ctlyt.exam.pojo.*;
import cn.ctlyt.exam.utils.QuestionUtil;
import cn.ctlyt.exam.vo.QuestionConut;
import cn.ctlyt.exam.vo.Tree;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Autowired
    TestAndClazzMapper testAndClazzMapper;
    @Autowired
    TestAndQuestionMapper testAndQuestionMapper;

    @Autowired
    QuestionMapper questionMapper;

    public Map preTest(User user){
        Map map = new HashMap();
        List<Tree> trees = new ArrayList<>();
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
            trees = otherService.getShoolTree();
        }
        map.put("shoolTree",trees);
        map.put("majorTree",otherService.getChapterTree());
        return map;
    }
    public PageInfo getTests(Integer pageNo, Integer pageSize, Date start_time,Date end_time,String t_title,Integer c_id,Integer g_id,Integer s_id){
        PageHelper.startPage(pageNo,pageSize);
        List<Test> testByDateAndCID = testMapper.getTestByDateAndCID(t_title, start_time, end_time, c_id, g_id, s_id);
        return new PageInfo(testByDateAndCID);
    }

    public Test addTest(Test test,String cls,String tids){
        //添加试卷
        test.setCreate_time(new Date());
        int i = testMapper.insertSelective(test);
        //添加班级
        List<Integer> integers = JSON.parseArray(cls, Integer.class);
        ArrayList<TestAndClazz> objects = new ArrayList<>();
        integers.forEach(item->{
            objects.add(new TestAndClazz(test.getT_id(),item));
        });
        int i1 = testAndClazzMapper.insertList(objects);
        //添加试题
        List<Integer> integers1 = JSON.parseArray(tids, Integer.class);
        ArrayList<TestAndQustion> objects1 = new ArrayList<>();
        integers1.forEach(item->{
            objects1.add(new TestAndQustion(test.getT_id(),item));
        });
        testAndQuestionMapper.insertList(objects1);
        return test;
    }


    public Test addTestRand(Test test,String ecs,String cls,Integer difficulty,String nums){
        List<Integer>numlist = JSON.parseArray(nums,Integer.class);

        //查询试题总数
        ecs = ecs.substring(1,ecs.length());
        QuestionConut questCount = questionMapper.getQuestCount(ecs);
        if(questCount.getSingle() < numlist.get(0)){
            throw new BizException("单选题数量不够:"+ questCount.getSingle());
        }
        if(questCount.getMultiple() < numlist.get(1)){
            throw new BizException("多选题数量不够:"+questCount.getMultiple());
        }
        if(questCount.getJudge() < numlist.get(2)){
            throw new BizException("判断题数量不够:"+questCount.getJudge());
        }
        if(questCount.getFilling() < numlist.get(3)){
            throw new BizException("填空题数量不够:"+questCount.getFilling());
        }
        if(questCount.getShortn() < numlist.get(4)){
            throw new BizException("简答题数量不够:"+questCount.getShortn());
        }

        //        试题查询

        // 降低重复率

        //根据班级查询试卷ID
        //根据试卷id查询试题出现的次数

        //查询错误率高的试题



        //添加试卷
        test.setCreate_time(new Date());
        testMapper.insert(test);


        List<Question> questByECID = questionMapper.getQuestByECID(ecs);
        //添加试题
        Map defCount = QuestionUtil.getDefCount(difficulty, numlist);
        Map map = QuestionUtil.getMap(numlist, questByECID);
        List<Question> question = QuestionUtil.getQuestion(defCount, map);
        List<TestAndQustion> taqs  = new ArrayList<>();
        question.forEach(item->{
            taqs.add(new TestAndQustion(test.getT_id(),item.getQ_id()));
        });
        testAndQuestionMapper.insertList(taqs);


        //添加班级
        List<Integer> integers = JSON.parseArray(cls, Integer.class);
        List<TestAndClazz> clazzes = new ArrayList<>();
        integers.forEach(item->{
            clazzes.add(new TestAndClazz(test.getT_id(),item));
        });
        testAndClazzMapper.insertList(clazzes);


        return null;

    }
}
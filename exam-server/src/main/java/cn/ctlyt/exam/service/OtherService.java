package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.*;
import cn.ctlyt.exam.pojo.*;
import cn.ctlyt.exam.utils.RedisUtil;
import cn.ctlyt.exam.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;


/**
 * @ClassNameOtherService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/3/16 0016 10:44
 * @Version V1.0
 **/
@Service
@Transactional
public class OtherService {
    @Autowired
    MajorMapper majorMapper;
    @Autowired
    CurriculumMapper curriculumMapper;
    @Autowired
    ChapterMapper chapterMapper;

    @Autowired
    ShoolMapper shoolMapper;
    @Autowired
    GradeMapper gradeMapper;
    @Autowired
    ClazzMapper clazzMapper;


    //后期再优化   2020-4-3
    public List<Tree> getChapterTree(){
        List<Major> majors = majorMapper.selectAll();
        List trees = new ArrayList();
        for(Major major : majors){
            Tree tree = new Tree(major.getM_name(),major.getM_id());
            Example example = new Example(Curriculum.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("m_id",major.getM_id());
            List<Curriculum> curricula = curriculumMapper.selectByExample(example);
            if(curricula!=null){
                List currs = new ArrayList();
                tree.setChildren(currs);
                for(Curriculum curriculum :curricula){
                    Tree tree1 = new Tree(curriculum.getCum_name(), curriculum.getCum_id());
                    Example example1 = new Example(Chapter.class);
                    Example.Criteria criteria1 = example1.createCriteria();
                    criteria1.andEqualTo("cum_id", curriculum.getCum_id());
                    List<Chapter> chapters = chapterMapper.selectByExample(example1);
                    if(chapters!=null){
                        List chaps = new ArrayList();
                        tree1.setChildren(chaps);
                        for (Chapter chapter : chapters){
                            Tree tree2 = new Tree(chapter.getEc_name(),chapter.getEc_id());
                            chaps.add(tree2);
                        }
                    }
                    currs.add(tree1);
                }
            }
            trees.add(tree);
        }
        return trees;
    }


    public List<Tree> getShoolTree(){
        List<Shool> shools = null;
        List<Grade> grades = null;
        List<Clazz> clazzes = null;
        if(RedisUtil.get("shools")==null){
            shools = shoolMapper.selectAll();
            RedisUtil.set("shools",shools);
            grades = gradeMapper.selectAll();
            RedisUtil.set("grades",grades);
            clazzes = clazzMapper.selectAll();
            RedisUtil.set("clazzes",clazzes);
        }
        if(RedisUtil.get("shoolTree")==null){
            if(shools==null){
                shools = (List<Shool>) RedisUtil.get("shools");
                grades = (List<Grade>) RedisUtil.get("grades");
                clazzes = (List<Clazz>) RedisUtil.get("clazzes");
            }
            List<Tree> shoolTrees = new ArrayList();
            List<Tree>gradeTrees = new ArrayList();
            for(Grade grade : grades){
                Tree tree = new Tree(grade.getS_id(), grade.getG_name(), grade.getG_id());
                tree.setChildren(new ArrayList<>());
                for(Clazz clazz : clazzes){
                    if(clazz.getG_id() == grade.getG_id()){
                        tree.getChildren().add(new Tree(clazz.getC_name(),clazz.getC_id()));
                    }
                }
                gradeTrees.add(tree);
            }
            RedisUtil.set("gradeTree",gradeTrees);
            for (Shool shool : shools){
                Tree tree = new Tree(shool.getS_name(), shool.getS_id());
                tree.setChildren(new ArrayList<>());
                for(Tree tree1 : gradeTrees){
                    if(shool.getS_id() == tree1.getId()){
                        tree.getChildren().add(tree1);
                    }
                }
                shoolTrees.add(tree);
            }
            RedisUtil.set("shoolTree",shoolTrees);
            return shoolTrees;
        }else{
            return (List<Tree>) RedisUtil.get("shoolTree");
        }
    }
}

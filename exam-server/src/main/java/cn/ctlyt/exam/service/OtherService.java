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
        List<Major> majors = null;
        List<Curriculum> curricula = null;
        List<Chapter> chapters = null;
        if(RedisUtil.get("majors")== null){
            majors = majorMapper.selectAll();
            curricula = curriculumMapper.selectAll();
            chapters = chapterMapper.selectAll();
            RedisUtil.set("majors",majors);
            RedisUtil.set("curricula",curricula);
            RedisUtil.set("chapters",chapters);
        }

        if(RedisUtil.get("majorTree") == null){
            if(majors == null){
                majors = (List<Major>) RedisUtil.get("majors");
                curricula = (List<Curriculum>) RedisUtil.get("curricula");
                chapters = (List<Chapter>) RedisUtil.get("chapters");
            }

            List majorsTree = new ArrayList();
            List<Tree> curriculaTree = new ArrayList<>();
            List<Chapter> finalChapters = chapters;
            curricula.forEach(item->{
                Tree tree = new Tree(item.getM_id(),item.getCum_name(),item.getCum_id());
                tree.setChildren(new ArrayList<>());
                finalChapters.forEach(it->{
                    if(item.getCum_id() == it.getCum_id()){
                        tree.getChildren().add(new Tree(it.getEc_name(),it.getEc_id()));
                    }
                });
                curriculaTree.add(tree);
            });
            RedisUtil.set("curriculaTree",curriculaTree);
            majors.forEach(item->{
                Tree tree = new Tree(item.getM_name(), item.getM_id());
                tree.setChildren(new ArrayList<>());
                curriculaTree.forEach(it->{
                    if(item.getM_id() == it.getId()){
                        tree.getChildren().add(it);
                    }
                });
                majorsTree.add(tree);
            });
            RedisUtil.set("majorTree",majorsTree);
            return majorsTree;
        }
        return (List<Tree>) RedisUtil.get("majorTree");
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

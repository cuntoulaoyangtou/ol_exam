package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.ChapterMapper;
import cn.ctlyt.exam.mapper.CurriculumMapper;
import cn.ctlyt.exam.mapper.MajorMapper;
import cn.ctlyt.exam.pojo.Chapter;
import cn.ctlyt.exam.pojo.Curriculum;
import cn.ctlyt.exam.pojo.Major;
import cn.ctlyt.exam.vo.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

}

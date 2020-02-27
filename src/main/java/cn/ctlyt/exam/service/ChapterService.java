package cn.ctlyt.exam.service;

import cn.ctlyt.exam.mapper.ChapterMapper;
import cn.ctlyt.exam.pojo.Chapter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameChapterService
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 19:42
 * @Version V1.0
 **/
@Service
public class ChapterService {
    @Autowired
    ChapterMapper chapterMapper;
    /*
     * 功能描述：添加章节
     * @param [chapter]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:09
     *
     */
    public int addChapter(Chapter chapter){
        return chapterMapper.insert(chapter);
    }
    /*
     * 功能描述：修改章节
     * @param [chapter]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:10
     *
     */
    public int updateChapter(Chapter chapter){
        return chapterMapper.updateByPrimaryKeySelective(chapter);
    }

    /*
     * 功能描述：删除章节
     * @param [ec_id]
     * @return int
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:10
     *
     */
    public int delChapter(Integer ec_id){
        return chapterMapper.deleteByPrimaryKey(ec_id);
    }
    /*
     * 功能描述：根据课程id查询
     * @param [cum_id]
     * @return java.util.List<cn.ctlyt.exam.pojo.Chapter>
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:14
     *
     */
    public List<Chapter> getChaptersByCUMID(Integer cum_id){
        return chapterMapper.getChapters(cum_id);
    }

    /*
     * 功能描述：分组模糊查询
     * @param [pageNo, pageSize, ec_name, cum_id]
     * @return com.github.pagehelper.PageInfo<cn.ctlyt.exam.pojo.Chapter>
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:11
     *
     */
    public PageInfo<Chapter> getChapters(Integer pageNo, Integer pageSize, String ec_name, Integer cum_id){
        PageHelper.startPage(pageNo,pageSize);
        List<Chapter> chapters;
        Example example = new Example(Chapter.class);
        example.orderBy("ec_priority");
        Example.Criteria criteria = example.createCriteria();
        if(ec_name!=null){
            criteria.andLike("ec_name","%"+ec_name+"%");
        }
        if(cum_id!=null && cum_id!=0){
            criteria.andEqualTo("cum_id",cum_id);
        }
        chapters = chapterMapper.selectByExample(example);
        return new PageInfo<Chapter>(chapters);
    }
    /*
     * 功能描述：查询章节
     * @param [ec_id]
     * @return cn.ctlyt.exam.pojo.Chapter
     * @Author: 村头老杨头
     * @Date: 2020/2/26 0026 21:12
     *
     */
    public Chapter getChapter(Integer ec_id){
        return chapterMapper.selectByPrimaryKey(ec_id);
    }
}

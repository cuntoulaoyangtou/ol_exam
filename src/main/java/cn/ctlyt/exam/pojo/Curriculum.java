package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @ClassNameCurriculum
 * @Description 课程
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 19:31
 * @Version V1.0
 **/
@Table(name = "e_curriculum")
@NameStyle(Style.normal)
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cum_id;
    private String cum_name;
    private Integer cum_priority;
    private Integer m_id;
    private List<Chapter> chapters;

    public Integer getCum_id() {
        return cum_id;
    }

    public void setCum_id(Integer cum_id) {
        this.cum_id = cum_id;
    }

    public String getCum_name() {
        return cum_name;
    }

    public void setCum_name(String cum_name) {
        this.cum_name = cum_name;
    }

    public Integer getCum_priority() {
        return cum_priority;
    }

    public void setCum_priority(Integer cum_priority) {
        this.cum_priority = cum_priority;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}

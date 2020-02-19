package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassNameMajor
 * @Description 专业
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 3:02
 * @Version V1.0
 **/
@Table(name = "u_major")
@NameStyle(Style.normal)
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer m_id;
    private String m_name;
    private String m_intro;
    private Integer m_priority;

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_intro() {
        return m_intro;
    }

    public void setM_intro(String m_intro) {
        this.m_intro = m_intro;
    }

    public Integer getM_priority() {
        return m_priority;
    }

    public void setM_priority(Integer m_priority) {
        this.m_priority = m_priority;
    }
}

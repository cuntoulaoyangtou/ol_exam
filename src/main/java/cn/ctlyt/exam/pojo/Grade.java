package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @ClassNameGrade
 * @Description 年级
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 5:10
 * @Version V1.0
 **/
@Table(name = "u_grade")
@NameStyle(Style.normal)
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer g_id;
    private String g_name;
    private Integer g_priority;
    private Integer s_id;

    public Integer getG_id() {
        return g_id;
    }

    public void setG_id(Integer g_id) {
        this.g_id = g_id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public Integer getG_priority() {
        return g_priority;
    }

    public void setG_priority(Integer g_priority) {
        this.g_priority = g_priority;
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

}

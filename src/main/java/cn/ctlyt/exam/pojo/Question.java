package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @ClassNameQuestion
 * @Description 试题
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:00
 * @Version V1.0
 **/
@Table(name = "e_question")
@NameStyle(Style.normal)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer q_id;
    private String q_content;
    private Date q_create_time;
    private Date q_update_time;
    private String q_create_name;
    private String q_parse;
    private String q_ability;
    private Integer qt_id;
    private Integer ec_id;
    private String q_difficulty;

    private List<Option> options;

    public Integer getQ_id() {
        return q_id;
    }

    public void setQ_id(Integer q_id) {
        this.q_id = q_id;
    }

    public String getQ_content() {
        return q_content;
    }

    public void setQ_content(String q_content) {
        this.q_content = q_content;
    }

    public Date getQ_create_time() {
        return q_create_time;
    }

    public void setQ_create_time(Date q_create_time) {
        this.q_create_time = q_create_time;
    }

    public Date getQ_update_time() {
        return q_update_time;
    }

    public void setQ_update_time(Date q_update_time) {
        this.q_update_time = q_update_time;
    }

    public String getQ_create_name() {
        return q_create_name;
    }

    public void setQ_create_name(String q_create_name) {
        this.q_create_name = q_create_name;
    }

    public String getQ_parse() {
        return q_parse;
    }

    public void setQ_parse(String q_parse) {
        this.q_parse = q_parse;
    }

    public String getQ_ability() {
        return q_ability;
    }

    public void setQ_ability(String q_ability) {
        this.q_ability = q_ability;
    }

    public Integer getQt_id() {
        return qt_id;
    }

    public void setQt_id(Integer qt_id) {
        this.qt_id = qt_id;
    }

    public Integer getEc_id() {
        return ec_id;
    }

    public void setEc_id(Integer ec_id) {
        this.ec_id = ec_id;
    }

    public String getQ_difficulty() {
        return q_difficulty;
    }

    public void setQ_difficulty(String q_difficulty) {
        this.q_difficulty = q_difficulty;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}

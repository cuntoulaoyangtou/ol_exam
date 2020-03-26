package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassNameQuestionType
 * @Description 试题类型
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 4:06
 * @Version V1.0
 **/
@Table(name = "e_question_type")
@NameStyle(Style.normal)
public class QuestionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer qt_id;
    private String qt_name;
    private Integer qt_priority;

    public Integer getQt_id() {
        return qt_id;
    }

    public void setQt_id(Integer qt_id) {
        this.qt_id = qt_id;
    }

    public String getQt_name() {
        return qt_name;
    }

    public void setQt_name(String qt_name) {
        this.qt_name = qt_name;
    }

    public Integer getQt_priority() {
        return qt_priority;
    }

    public void setQt_priority(Integer qt_priority) {
        this.qt_priority = qt_priority;
    }
}

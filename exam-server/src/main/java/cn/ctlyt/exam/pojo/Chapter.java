package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassNameChapter
 * @Description 章节
 * @Author 村头老杨头
 * @Date 2020/2/26 0026 19:30
 * @Version V1.0
 **/
@Table(name = "e_chapter")
@NameStyle(Style.normal)
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ec_id;
    private String ec_name;
    private Integer ec_priority;
    private Integer cum_id;

    public Integer getEc_id() {
        return ec_id;
    }

    public void setEc_id(Integer ec_id) {
        this.ec_id = ec_id;
    }

    public String getEc_name() {
        return ec_name;
    }

    public void setEc_name(String ec_name) {
        this.ec_name = ec_name;
    }

    public Integer getEc_priority() {
        return ec_priority;
    }

    public void setEc_priority(Integer ec_priority) {
        this.ec_priority = ec_priority;
    }

    public Integer getCum_id() {
        return cum_id;
    }

    public void setCum_id(Integer cum_id) {
        this.cum_id = cum_id;
    }
}

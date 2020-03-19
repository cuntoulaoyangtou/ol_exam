package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * @ClassNameOption
 * @Description 选项
 * @Author 村头老杨头
 * @Date 2020/3/17 0017 3:56
 * @Version V1.0
 **/
@Table(name = "e_option")
@NameStyle(Style.normal)
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer o_id;
    private String o_no;
    private String o_content;
    private Boolean o_flag;
    private Integer q_id;

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getO_no() {
        return o_no;
    }

    public void setO_no(String o_no) {
        this.o_no = o_no;
    }

    public String getO_content() {
        return o_content;
    }

    public void setO_content(String o_content) {
        this.o_content = o_content;
    }

    public Boolean getO_flag() {
        return o_flag;
    }

    public void setO_flag(Boolean o_flag) {
        this.o_flag = o_flag;
    }

    public Integer getQ_id() {
        return q_id;
    }

    public void setQ_id(Integer q_id) {
        this.q_id = q_id;
    }

    @Override
    public String toString() {
        return "Option{" +
                "o_id=" + o_id +
                ", o_no='" + o_no + '\'' +
                ", o_content='" + o_content + '\'' +
                ", o_flag=" + o_flag +
                ", q_id=" + q_id +
                '}';
    }
}

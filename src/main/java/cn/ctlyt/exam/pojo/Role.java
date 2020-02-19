package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassNameRole
 * @Description 角色
 * @Author 村头老杨头
 * @Date2020/2/17 0017 5:13
 * @Version V1.0
 **/
@Table(name = "u_role")
@NameStyle(Style.normal)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer r_id;
    private String r_name;
    private String r_comment;

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_comment() {
        return r_comment;
    }

    public void setR_comment(String r_comment) {
        this.r_comment = r_comment;
    }
}

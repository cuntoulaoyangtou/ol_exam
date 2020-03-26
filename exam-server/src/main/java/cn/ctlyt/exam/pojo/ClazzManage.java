package cn.ctlyt.exam.pojo;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassNameClazzManage
 * @Description 班级管理
 * @Author 村头老杨头
 * @Date 2020/2/21 0021 20:50
 * @Version V1.0
 **/
@Table(name = "u_clazz_manage")
@NameStyle(Style.normal)
public class ClazzManage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cm_id;
    private Integer u_id;
    private User user;
    private Integer c_id;
    private Clazz clazz;

    public Integer getCm_id() {
        return cm_id;
    }

    public void setCm_id(Integer cm_id) {
        this.cm_id = cm_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}

package cn.ctlyt.exam.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@program: exam
 *@description: 试卷班级关系
 *@author: 村头老杨头
 *@create: 2020-04-03 10:49
 */
@Table(name = "c_test_and_clazz")
public class TestAndClazz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tc_id;
    private Integer t_id;
    private Integer c_id;

    public Integer getTc_id() {
        return tc_id;
    }

    public void setTc_id(Integer tc_id) {
        this.tc_id = tc_id;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }
}
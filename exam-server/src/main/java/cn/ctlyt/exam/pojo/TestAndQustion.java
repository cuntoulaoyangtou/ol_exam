package cn.ctlyt.exam.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@program: exam
 *@description: 试卷试题关系
 *@author: 村头老杨头
 *@create: 2020-04-03 10:46
 */
@Table(name = "c_test_and_question")
public class TestAndQustion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tq_id;
    private Integer t_id;
    private Integer q_id;

    public Integer getTq_id() {
        return tq_id;
    }

    public void setTq_id(Integer tq_id) {
        this.tq_id = tq_id;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getQ_id() {
        return q_id;
    }

    public void setQ_id(Integer q_id) {
        this.q_id = q_id;
    }
}
package cn.ctlyt.exam.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: exam
 * @description: 答案
 * @author: 村头老杨头
 * @create: 2020-04-05 01:50
 */
@Table(name = "ue_answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long a_id;
    private Long rc_id;
    private Integer q_id;
    private String answer;
    private Boolean m_judge;
    private Boolean h_judge;

    public Long getA_id() {
        return a_id;
    }

    public void setA_id(Long a_id) {
        this.a_id = a_id;
    }

    public Long getRc_id() {
        return rc_id;
    }

    public void setRc_id(Long rc_id) {
        this.rc_id = rc_id;
    }

    public Integer getQ_id() {
        return q_id;
    }

    public void setQ_id(Integer q_id) {
        this.q_id = q_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Boolean getM_judge() {
        return m_judge;
    }

    public void setM_judge(Boolean m_judge) {
        this.m_judge = m_judge;
    }

    public Boolean getH_judge() {
        return h_judge;
    }

    public void setH_judge(Boolean h_judge) {
        this.h_judge = h_judge;
    }
}
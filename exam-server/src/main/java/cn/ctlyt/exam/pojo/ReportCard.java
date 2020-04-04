package cn.ctlyt.exam.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @program: exam
 * @description: 成绩单
 * @author: 村头老杨头
 * @create: 2020-04-05 01:58
 */
@Table(name = "ue_report_card")
public class ReportCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rc_id;
    private Integer u_id;
    private Integer t_id;
    private Integer score;
    private Integer corr;
    private Integer err;

    public Long getRc_id() {
        return rc_id;
    }

    public void setRc_id(Long rc_id) {
        this.rc_id = rc_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getCorr() {
        return corr;
    }

    public void setCorr(Integer corr) {
        this.corr = corr;
    }

    public Integer getErr() {
        return err;
    }

    public void setErr(Integer err) {
        this.err = err;
    }
}
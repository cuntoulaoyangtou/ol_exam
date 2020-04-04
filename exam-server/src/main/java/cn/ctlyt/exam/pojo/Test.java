package cn.ctlyt.exam.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *@program: exam
 *@description: 试卷
 *@author: 村头老杨头
 *@create: 2020-04-03 10:38
 */
@Table(name = "e_test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private Integer type_id;
    private String t_title;
    private String t_summary;
    private Date create_time;
    private Date update_time;
    private Date start_time;
    private Date end_time;
    private Integer u_id;
    private Integer total;
    private Boolean visibility;
    private Integer single_val;
    private Integer multiple_val;
    private Integer judge_val;
    private Integer filling_val;
    private Integer short_val;

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getT_title() {
        return t_title;
    }

    public void setT_title(String t_title) {
        this.t_title = t_title;
    }

    public String getT_summary() {
        return t_summary;
    }

    public void setT_summary(String t_summary) {
        this.t_summary = t_summary;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }

    public Integer getSingle_val() {
        return single_val;
    }

    public void setSingle_val(Integer single_val) {
        this.single_val = single_val;
    }

    public Integer getMultiple_val() {
        return multiple_val;
    }

    public void setMultiple_val(Integer multiple_val) {
        this.multiple_val = multiple_val;
    }

    public Integer getJudge_val() {
        return judge_val;
    }

    public void setJudge_val(Integer judge_val) {
        this.judge_val = judge_val;
    }

    public Integer getFilling_val() {
        return filling_val;
    }

    public void setFilling_val(Integer filling_val) {
        this.filling_val = filling_val;
    }

    public Integer getShort_val() {
        return short_val;
    }

    public void setShort_val(Integer short_val) {
        this.short_val = short_val;
    }
}
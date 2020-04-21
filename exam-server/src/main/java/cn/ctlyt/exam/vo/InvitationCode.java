package cn.ctlyt.exam.vo;

import java.util.Date;

/**
 * @program: exam
 * @description: 用户邀请码
 * @author: 村头老杨头
 * @create: 2020-04-21 16:37
 */
public class InvitationCode {
    private Date startDate;
    private Date endDate;
    private Integer code;
    private Integer r_id;
    private Integer c_id;
    private Integer u_id;

    private String no = "invitation";

    public InvitationCode() {
        this.startDate = new Date();
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCode() {
        return code;
    }
    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getNo() {
        return no;
    }

    public long getTime(){
        return (this.endDate.getTime()-this.startDate.getTime())/1000;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

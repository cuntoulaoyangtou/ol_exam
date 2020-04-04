package cn.ctlyt.exam.vo;

/**
 * @program: exam
 * @description: 试题Vo
 * @author: 村头老杨头
 * @create: 2020-04-05 02:05
 */
public class QuestionVo {
    private Integer q_id;
    private Integer type_id;
    private Integer frequency; //出现频率
    private Double errrate;

    public Integer getQ_id() {
        return q_id;
    }

    public void setQ_id(Integer q_id) {
        this.q_id = q_id;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Double getErrrate() {
        return errrate;
    }

    public void setErrrate(Double errrate) {
        this.errrate = errrate;
    }
}
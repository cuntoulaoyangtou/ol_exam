package cn.ctlyt.exam.vo;

/**
 * @program: exam
 * @description: 试题数量
 * @author: 村头老杨头
 * @create: 2020-04-04 19:43
 */
public class QuestionConut {
    private Integer single;
    private Integer multiple;
    private Integer judge;
    private Integer filling;
    private Integer shortn;

    public Integer getSingle() {
        return single;
    }

    public void setSingle(Integer single) {
        this.single = single;
    }

    public Integer getMultiple() {
        return multiple;
    }

    public void setMultiple(Integer multiple) {
        this.multiple = multiple;
    }

    public Integer getJudge() {
        return judge;
    }

    public void setJudge(Integer judge) {
        this.judge = judge;
    }

    public Integer getFilling() {
        return filling;
    }

    public void setFilling(Integer filling) {
        this.filling = filling;
    }

    public Integer getShortn() {
        return shortn;
    }

    public void setShortn(Integer shortn) {
        this.shortn = shortn;
    }
}
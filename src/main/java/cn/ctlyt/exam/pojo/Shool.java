package cn.ctlyt.exam.pojo;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @ClassNameShool
 * @Description 学校
 * @Author 村头老杨头
 * @Date 2020/2/17 0017 5:05
 * @Version V1.0
 **/
@Table(name = "u_shool")
@NameStyle(Style.normal)
public class Shool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer s_id;
    private String s_name;
    private String s_longitude;
    private String s_latitude;

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_longitude() {
        return s_longitude;
    }

    public void setS_longitude(String s_longitude) {
        this.s_longitude = s_longitude;
    }

    public String getS_latitude() {
        return s_latitude;
    }

    public void setS_latitude(String s_latitude) {
        this.s_latitude = s_latitude;
    }

}

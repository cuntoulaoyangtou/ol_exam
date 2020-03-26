package cn.ctlyt.exam.pojo;

import cn.ctlyt.exam.exception.BizException;
import cn.ctlyt.exam.utils.ResultGenerator;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @ClassNameUser
 * @Description 用户
 * @Author 村头老杨头
 * @Date2020/2/17 0017 5:14
 * @Version V1.0
 **/
@Table(name = "u_user")
@NameStyle(Style.normal)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer u_id;
    private String username;
    private String phone;
    private String password;
    private String real_name;
    private String avatar;
    private Integer integral;
    private Integer c_id;
    private Integer r_id;
    private Role role;
    private List<ClazzManage> clazzManages;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public boolean verifyUsername(){
        if(Pattern.matches("^[\\w\\u4e00-\\u9fa5]{5,8}$",this.username==null?"":username)){
            return true;
        }
        return false;
    }
    public boolean verifyPhone(){
        if( Pattern.matches("^1[3456789]\\d{9}$",this.phone==null?"":phone)){
            return true;
        }
        return false;
    }
    public boolean verifyRegister(){
        if(verifyUsername() || verifyPhone()){
            if(this.password!=null && this.password.length()>=32){
                if(this.r_id!=null && this.r_id!=0){
                    if(this.c_id!=null && this.c_id!=0){
                        if(this.real_name!=null){
                            return true;
                        }else {
                            throw new BizException("填写真实姓名",this);
                        }
                    }else{
                        throw new BizException("未选择班级",this);
                    }
                }else{
                    throw new BizException("未选择角色",this);
                }
            }else{
                throw new BizException("密码不符合要求",this);
            }
        }else{
            throw new BizException("用户名或手机号不符合要求",this);
        }
    }
    public boolean verifyLogin(){
        if(verifyUsername() || verifyPhone()){
            if(this.password!=null && this.password.length()>=32){
                return true;
            }else{
                throw new BizException("密码不符合要求",this);
            }
        }else{
            throw new BizException("用户名或手机号不符合要求",this);
        }
    }

    public List<ClazzManage> getClazzManages() {
        return clazzManages;
    }

    public void setClazzManages(List<ClazzManage> clazzManages) {
        this.clazzManages = clazzManages;
    }
}

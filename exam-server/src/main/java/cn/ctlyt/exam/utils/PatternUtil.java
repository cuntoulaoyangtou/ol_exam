package cn.ctlyt.exam.utils;

import java.util.regex.Pattern;

/**
 * @program: exam
 * @description: 正则验证
 * @author: 村头老杨头
 * @create: 2020-05-05 12:41
 */
public class PatternUtil {
    /**
     * 手机号正则
     */
    private static final String PHONE_REG = "^[1]([3-9])[0-9]{9}$";
    /**
     * 邮箱正则
     */
    private static final String EMAIL_REG = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
    /**
     * 用户名正则
     */
    private static final String USERNAME_REG = "^[\\W\\u4e00-\\u9fa5]{5,8}$";

    /**
     * 密码正则
     */
    private static final String PASSWROD_REG = "^[0-9a-fA-F]{32}&";


    public static boolean regPhone(String phone){
        if(phone==null)
            return false;
        return Pattern.matches(PHONE_REG,phone);
    }
    public static boolean regEmail(String email){
        if(email==null)
            return false;
        return Pattern.matches(EMAIL_REG,email);
    }
    public static boolean regUsername(String username){
        if(username == null)
            return false;
        return Pattern.matches(USERNAME_REG,username);
    }
    public static boolean regPassword(String password){
        if(password == null)
            return false;
        return Pattern.matches(USERNAME_REG,password);
    }
}
package cn.ctlyt.exam.utils;

import java.util.UUID;

/**
 * @ClassNameConstant
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 18:31
 * @Version V1.0
 **/
public class Constant {

    public static final String JWT_ID = UUID.randomUUID().toString(); //生成的token
    public static final String TOKEN_HEADER = "token";


    public static final String JWT_SECRET = "ctlytexam";//加密密文
    public static final int JWT_TTL = 60*60*1000;  //过期时间 3600000

    public static String getToken(String tokenid,Integer cid,Integer rid){
        return TOKEN_HEADER+"_"+cid+"_"+rid+"_"+tokenid;
    }

}

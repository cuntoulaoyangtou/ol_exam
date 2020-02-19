package cn.ctlyt.exam.config;

/**
 * @ClassNameGlobalConfig
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 18:47
 * @Version V1.0
 **/
public class GlobalConfig {
    public static final String TOKEN_HEADER = "ctlyt_user";

    public static String getToken(String tokenid,Integer cid,Integer rid){
        return TOKEN_HEADER+"_"+cid+"_"+rid+"_"+tokenid;
    }
}

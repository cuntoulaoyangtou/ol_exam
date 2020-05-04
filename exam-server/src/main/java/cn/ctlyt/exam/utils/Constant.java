package cn.ctlyt.exam.utils;

import org.springframework.beans.factory.annotation.Value;

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

    /**
     * 文件上传路径
     */
    public static final String FILE_UPLOAD_DIR = "./uploads";

    /**
     * 服务器外网
     */
    public static final String OL_URL = "http://127.0.0.1:8081";

    /**
     * 文件下载接口路径
     */
    public static final String FILE_UPLOAD_INTERFACE = "/api/upload/downloadFile/";
    /**
     * 系统名称
     */
    public static String SYSTEM_NAME = "在线考试系统";

    /**
     * 手机号正则
     */
    public static final String PHONE_REG = "^[1]([3-9])[0-9]{9}$";
    /**
     * 邮箱正则
     */
    public static final String EMAIL_REG = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";



    public static String getServletFileUpload(){
        return OL_URL+FILE_UPLOAD_INTERFACE;
    }

    public static String getToken(String tokenid,Integer cid,Integer rid){
        return TOKEN_HEADER+"_"+cid+"_"+rid+"_"+tokenid;
    }

}

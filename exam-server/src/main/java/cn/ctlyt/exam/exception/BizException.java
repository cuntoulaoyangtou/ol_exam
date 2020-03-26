package cn.ctlyt.exam.exception;

/**
 * @ClassNameBizException
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 8:07
 * @Version V1.0
 **/
public class BizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 数据
     */
    private Object data;


    public BizException() {
        super();
    }


    public BizException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public BizException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public BizException(String errorMsg,Object data) {
        super(errorMsg);
        this.errorMsg = errorMsg;
        this.data = data;
    }
    public BizException(String errorCode, String errorMsg,Object data) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    public BizException(String errorCode, String errorMsg,Object data, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
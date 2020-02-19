package cn.ctlyt.exam.exception;

import cn.ctlyt.exam.pojo.Result;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.ExpiredJwtException;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.mybatis.spring.MyBatisSystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassNameGlobalException
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/19 0019 7:46
 * @Version V1.0
 **/
@ControllerAdvice
public class GlobalException {
    private static final Logger logger = LoggerFactory.getLogger(GlobalException.class);

    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public Result bizExceptionHandler(HttpServletRequest req, BizException e){
        logger.error("发生业务异常！原因是：{} {}",e.getErrorMsg(), JSON.toJSONString(e.getData()));
        return ResultGenerator.genFailResult(e.getMessage()).setData(e.getData());
    }



    /**
     * SQL唯一约束的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = DuplicateKeyException.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, DuplicateKeyException e){
        logger.error("SQL唯一约束异常！原因是:{}",e);
        return ResultGenerator.genFailResult("SQL唯一约束异常");
    }

    /**
     * SQL外键约束的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = DataIntegrityViolationException.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, DataIntegrityViolationException e){
        logger.error("SQL外键约束异常！原因是:{}",e);
        return ResultGenerator.genFailResult("SQL外键约束异常");
    }


    /**
     * SQL查询的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = TooManyResultsException.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, TooManyResultsException e){
        logger.error("SQL查询异常！原因是: {}",e);
        return ResultGenerator.genFailResult("SQL查询异常");
    }

    /**
     * MyBatis异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyBatisSystemException.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, MyBatisSystemException e){
        logger.error("MyBatis异常！原因是: {}",e);
        return ResultGenerator.genFailResult("MyBatis异常");
    }

    /**
     * 处理空指针的异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, NullPointerException e){
        logger.error("发生空指针异常！原因是:{}",e);
        return ResultGenerator.genFailResult("空指针异常");
    }


    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public Result exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:{}",e);
        return ResultGenerator.genFailResult("未知异常");
    }
}

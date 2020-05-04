package cn.ctlyt.exam.filter;

import cn.ctlyt.exam.pojo.ResultCodeEnum;
import cn.ctlyt.exam.pojo.User;
import cn.ctlyt.exam.utils.Constant;
import cn.ctlyt.exam.utils.JwtUtil;
import cn.ctlyt.exam.utils.RedisUtil;
import cn.ctlyt.exam.utils.ResultGenerator;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassNameAuthorityFilter
 * @Description
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 4:01
 * @Version V1.0
 **/
@Order(2)
@WebFilter(filterName = "authority",urlPatterns = "/admin/*")
public class AuthorityFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("authority");
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String method = request.getMethod();
        if(!"OPTIONS".equals(method)){
            String token = request.getHeader("token");
            try {
                Claims c = JwtUtil.parseJWT(token);
                User user = JSON.parseObject(c.getSubject(), User.class);
                if(RedisUtil.get(Constant.getToken(c.getId(),user.getC_id(),user.getR_id()))== null){
                    throw new ExpiredJwtException(null,null,"Token 失效");
                }else{
                    filterChain.doFilter(servletRequest, servletResponse);
                }
            } catch (ExpiredJwtException e) {
                servletResponse.setCharacterEncoding("utf-8");
                HttpServletResponse response = (HttpServletResponse)servletResponse;
                response.addHeader("Access-Control-Allow-Origin","*");
                response.addHeader("Content-Type","application/json;charset=UTF-8");
                ServletOutputStream outputStream = response.getOutputStream();
                outputStream.write(JSON.toJSONString(ResultGenerator.genFailResult("Token失效").setCode(ResultCodeEnum.NOT_TOKEN)).getBytes());
                outputStream.flush();
                System.err.println("Token 已失效");
            }
        }else{
            filterChain.doFilter(request,servletResponse);
        }
    }



    @Override
    public void destroy() {

    }
}

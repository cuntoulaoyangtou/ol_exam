package cn.ctlyt.exam.filter;

import cn.ctlyt.exam.config.GlobalConfig;
import cn.ctlyt.exam.pojo.User;
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
import java.io.IOException;
import java.io.PrintWriter;

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
        String token = ((HttpServletRequest) servletRequest).getHeader("token");

        try {
            Claims c = JwtUtil.parseJWT(token);
            User user = JSON.parseObject(c.getSubject(), User.class);
            if(RedisUtil.get(GlobalConfig.getToken(c.getId(),user.getC_id(),user.getR_id()))== null){
                throw new ExpiredJwtException(null,null,"Token 失效");
            }else{
                filterChain.doFilter(servletRequest, servletResponse);
            }
        } catch (ExpiredJwtException e) {
            servletResponse.setCharacterEncoding("utf-8");
            PrintWriter writer = servletResponse.getWriter();
            writer.println(JSON.toJSONString(ResultGenerator.genFailResult("Token失效")));
            writer.flush();
            System.err.println("Token 已失效");
        }

    }


    @Override
    public void destroy() {

    }
}

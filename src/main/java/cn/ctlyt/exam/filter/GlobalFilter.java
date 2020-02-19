package cn.ctlyt.exam.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ClassNameGlobalFilter
 * @Description 全局过滤器
 * @Author 村头老杨头
 * @Date 2020/2/18 0018 3:55
 * @Version V1.0
 **/
@Order(0)
@WebFilter(filterName = "global",urlPatterns = "/*")
public class GlobalFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("global");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}

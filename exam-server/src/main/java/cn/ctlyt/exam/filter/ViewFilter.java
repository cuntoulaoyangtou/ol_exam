package cn.ctlyt.exam.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;


/**
 * @program: exam
 * @description: 视图过滤器
 * @author: 村头老杨头
 * @create: 2020-05-04 08:31
 */
@Order(2)
@WebFilter(filterName = "view",urlPatterns = "/user/*")
public class ViewFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if(request.getSession().getAttribute("user")!=null){
            HttpSession session = request.getSession();
            request.setAttribute("user",session.getAttribute("user"));
            request.setAttribute("clazz",session.getAttribute("clazz"));
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            request.getSession().invalidate();
            servletResponse.setCharacterEncoding("utf-8");
            HttpServletResponse servletResponse1 = (HttpServletResponse) servletResponse;
            servletResponse1.sendRedirect("/err?msg="+URLEncoder.encode("未登录没有权限访问","UTF-8"));
        }

    }

    @Override
    public void destroy() {

    }
}
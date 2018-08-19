package edu.hebut.filter;

import javax.servlet.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("before " + sdf.format(new Date()));
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("after " + sdf.format(new Date()));
    }
}

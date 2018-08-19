package edu.hebut.filter;

import javax.servlet.*;
import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        filterChain.doFilter(servletRequest,servletResponse);
    }
}

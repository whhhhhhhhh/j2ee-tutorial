package edu.hebut.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        if ("/login".equals(uri) || "/login.jsp".equals(uri) || "".equals(uri)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            String username = (String) session.getAttribute("username");
            if (username == null) {
                request.getRequestDispatcher("/login").forward(request, response);
            } else {
                filterChain.doFilter(request, response);
            }
        }
    }
}

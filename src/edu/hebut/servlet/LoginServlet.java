package edu.hebut.servlet;

import edu.hebut.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private LoginService loginService = new LoginService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (loginService.dologin(username,password)) {
//            request.getRequestDispatcher("/CustomerServlet").forward(request,response);
            request.getSession().setAttribute("username",username);
            Cookie usernameCookie = new Cookie("username",username);
            Cookie passwordCookie = new Cookie("password",password);
            usernameCookie.setMaxAge(60 * 60 * 24);
            passwordCookie.setMaxAge(60 * 60 * 24);
            response.addCookie(usernameCookie);
            response.addCookie(passwordCookie);
            response.sendRedirect("/customerList");
        } else {
            response.sendRedirect("/ErrorPage/passError.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String username = null;
        String password = null;
        if (cookies !=null && cookies.length > 1) {
            for (Cookie cookie:cookies) {
                if ("username".equals(cookie.getName())) {
                    username = cookie.getValue();
                }
                if ("password".equals(cookie.getName())) {
                    password = cookie.getValue();
                }
            }
            if (loginService.dologin(username,password)) {
                request.getSession().setAttribute("username",username);
                response.sendRedirect("/customerList");
            }
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
//        response.setStatus(405);
    }
}

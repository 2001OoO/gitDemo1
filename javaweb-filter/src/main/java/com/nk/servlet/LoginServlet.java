package com.nk.servlet;

import com.nk.pojo.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        if(username.equals("6xiao")){
            req.getSession().setAttribute(Constant.USER_SESSION, req.getSession().getId());
            resp.sendRedirect("/j/sys/success.jsp");
        }else{
            resp.sendRedirect("/j/error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

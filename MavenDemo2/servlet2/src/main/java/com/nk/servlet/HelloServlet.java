package com.nk.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.getInitParameter()
        ServletContext servletContext = this.getServletContext();
        String username = "小东西针不戳";
        servletContext.setAttribute("username",username);

        System.out.println("啦啦啦啦阿拉老");
    }
}

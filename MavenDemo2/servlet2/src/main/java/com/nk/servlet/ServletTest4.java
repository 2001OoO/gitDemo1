package com.nk.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Properties;

public class ServletTest4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        System.out.println("使用了Dispatcher进行转发");
//        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/st");   //请求转发路径
//        requestDispatcher.forward(req,resp);    //使用方法forward转发请求和返回

        Properties properties = new Properties();
        servletContext.getRequestDispatcher("/st").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

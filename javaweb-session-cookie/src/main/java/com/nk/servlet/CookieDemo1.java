package com.nk.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
//        从客户端获取Cookies
        Cookie[] cookies = req.getCookies();

        if(cookies!=null){
            writer.write("上次访问时间:");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
//                获取cookie的名字
                if(cookie.getName().equals("lastLoginTime")){
                    long value = Long.parseLong(cookie.getValue());
                    Date date = new Date(value);
                    writer.write(date.toLocaleString());
                }
            }
        }else {
            writer.write("第一次访问");
        }
//        新建cookie
        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis()+"");
//        设置cookie保存时间
        cookie.setMaxAge(24*60*60);
//        cookie传给客户端
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

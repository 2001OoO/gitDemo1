package com.nk.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

public class CookieDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = req.getCookies();
        PrintWriter writer = resp.getWriter();
        if(cookies!=null){
            writer.write("上次访问时间:");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
//                获取cookie的名字
                if(cookie.getName().equals("name")){
                    System.out.println(cookie.getValue());

//                    如果中文有乱码使用编解码的方式
//                    解码
//                    1. URLDecoder.decode(cookie.getValue(),"UTF-8");
                    writer.write(cookie.getValue());

                }
            }
        }else {
            writer.write("第一次访问");
        }

//        编码
//        2. Cookie cookie = new Cookie("name", URLEncoder.encode("小东西嘎嘎香","UTF-8"));
        Cookie cookie = new Cookie("name", "小东西嘎嘎香");
        resp.addCookie(cookie);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

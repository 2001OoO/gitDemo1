package com.nk.servlet;

import com.nk.pojo.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class SessionDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        解决乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

//        得到session
        HttpSession session = req.getSession();

//        给session存东西
        session.setAttribute("name", new Person("小东西",18));

//        获取session ID
        String id = session.getId();

//        判断session是不是新创建
        if(session.isNew()){
            resp.getWriter().write("Session创建成功，ID："+id);
        }else{
            resp.getWriter().write("Session已经存在,ID:" + id);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

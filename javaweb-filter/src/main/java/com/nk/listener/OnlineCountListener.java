package com.nk.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class OnlineCountListener implements HttpSessionListener {
//    创建session的监听
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        System.out.println(se.getSession().getId());
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if(onlineCount == null){
            onlineCount = 1;
        }else {
            onlineCount = onlineCount.intValue() + 1;
        }

        servletContext.setAttribute("OnlineCount", onlineCount);
    }

//    销毁session的监听
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
//        配置销毁
//        se.getSession().invalidate();
        Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");

        if(onlineCount == null){
            onlineCount = 0;
        }else {
            onlineCount = onlineCount.intValue() - 1;
        }

        servletContext.setAttribute("OnlineCount", onlineCount);
    }
}

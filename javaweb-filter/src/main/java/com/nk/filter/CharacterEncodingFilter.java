package com.nk.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class CharacterEncodingFilter implements Filter {

//    初始化,项目启动时初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("*********************CharacterEncodingFilter初始化*********************");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

//      让请求继续往下走，如果不写，请求到这里就停止了
        filterChain.doFilter(servletRequest,servletResponse);
    }

//    销毁,项目关闭时销毁
    @Override
    public void destroy() {
        System.out.println("*********************CharacterEncodingFilter销毁*********************");
    }
}

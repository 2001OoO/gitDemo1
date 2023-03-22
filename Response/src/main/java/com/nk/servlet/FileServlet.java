package com.nk.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Set;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取下载文件路径
//        String realPath = this.getServletContext().getRealPath("/牛.jpg");
        String realPath = "C:\\Users\\Niu Kai\\Desktop\\test\\java\\MavenDemo2\\Response\\src\\main\\resources\\牛.jpg";
        System.out.println("下载文件路径："+realPath);
//        截取文件名
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        System.out.println(fileName);
//        设置头信息让浏览器支持文件传输Content-disposition
        resp.setHeader("Content-disposition","attachment;filename=" + URLEncoder.encode(fileName,"UTF-8"));
//        获取下载文件的输入流
        FileInputStream fileInputStream = new FileInputStream(realPath);
//        创建buffer缓冲区
        int len=0;
        byte[] buffer = new byte[1024];
//        获取OutputStream对象
        ServletOutputStream outputStream = resp.getOutputStream();
//        将FileInputStream流写入到buffer缓冲区，使用OutputStream将缓冲区数据传输到客户端
        while((len=fileInputStream.read(buffer))>0){
            outputStream.write(buffer,0,len);
        }
        fileInputStream.close();
        outputStream.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

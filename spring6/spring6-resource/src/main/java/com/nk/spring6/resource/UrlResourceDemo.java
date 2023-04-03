package com.nk.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

//演示UrlResource访问网络资源
public class UrlResourceDemo {

    public static void main(String[] args) {
//        http前缀
//        loadUrlResource("http://www.baidu.com");

//        file前缀
        loadUrlResource("file:test.txt");

    }

//    访问前缀http、file资源
    public static void loadUrlResource(String path){
//        创建Resource实现类的对象UrlResource
        try {
            UrlResource urlResource = new UrlResource(path);
            //        获取资源信息
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

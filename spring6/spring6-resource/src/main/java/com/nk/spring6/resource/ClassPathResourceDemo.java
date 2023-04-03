package com.nk.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

//访问类路径下资源
public class ClassPathResourceDemo {

    public static void main(String[] args) {
        loadClassPathResource("test.txt");
    }

    public static void loadClassPathResource(String path){
//        创建ClassPathResource
        ClassPathResource classPathResource = new ClassPathResource(path);
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());

//        获取文件内容
        try {
            InputStream inputStream = classPathResource.getInputStream();

            System.out.println(new String(inputStream.readAllBytes()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

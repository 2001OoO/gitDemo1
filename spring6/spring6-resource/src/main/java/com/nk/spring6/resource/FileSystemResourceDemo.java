package com.nk.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

//访问系统资源
public class FileSystemResourceDemo {

    public static void main(String[] args) {
        loadFileResource("C:\\Users\\Niu Kai\\Desktop\\test\\java\\spring6\\test.txt");
        loadFileResource("./test.txt");
    }

    public static void loadFileResource(String path){
        FileSystemResource fileSystemResource = new FileSystemResource(path);
        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());

        try {
            InputStream inputStream = fileSystemResource.getInputStream();
            System.out.println(new String(inputStream.readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

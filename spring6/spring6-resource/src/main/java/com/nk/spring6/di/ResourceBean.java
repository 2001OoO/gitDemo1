package com.nk.spring6.di;


import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void parse(){
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        try {
            InputStream inputStream = resource.getInputStream();
            System.out.println(new String(inputStream.readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

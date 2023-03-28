package com.nk;

public class User {

    private String name;

    private Person person;

    public void add(){
        System.out.println("进入add方法");
    }

    public User() {
        System.out.println("进入无参构造");
    }
}

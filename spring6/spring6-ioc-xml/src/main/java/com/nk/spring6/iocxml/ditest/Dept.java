package com.nk.spring6.iocxml.ditest;

public class Dept {
    private String dname;

    public void info(){
        System.out.println("dname "+ dname);
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}

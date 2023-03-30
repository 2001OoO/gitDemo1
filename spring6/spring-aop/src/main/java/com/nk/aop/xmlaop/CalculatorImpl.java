package com.nk.aop.xmlaop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int r = i+j;
        System.out.println("方法内部result:" + r);
        return r;
    }

    @Override
    public int sub(int i, int j) {
        int r = i-j;
        System.out.println("方法内部result:" + r);
        return r;
    }

    @Override
    public int mul(int i, int j) {
        int r = i*j;
        System.out.println("方法内部result:" + r);
        return r;
    }

    @Override
    public int div(int i, int j) {
        int r = i/j;
        System.out.println("方法内部result:" + r);
        return r;
    }
}

package com.nk.aop.example;

public class CalculatorLogImpl implements Calculator{

    @Override
    public int add(int i, int j) {
        System.out.println("[日志]add方法开始，参数i=" + i + "  j=" + j);
        int r = i+j;
        System.out.println("方法内部result:" + r);
        System.out.println("[日志]add方法结束，result=" + r);
        return r;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[日志]sub方法开始，参数i=" + i + "  j=" + j);
        int r = i-j;
        System.out.println("方法内部result:" + r);
        System.out.println("[日志]sub方法结束，result=" + r);
        return r;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[日志]mul方法开始，参数i=" + i + "  j=" + j);
        int r = i*j;
        System.out.println("方法内部result:" + r);
        System.out.println("[日志]mul方法结束，result=" + r);
        return r;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[日志]div方法开始，参数i=" + i + "  j=" + j);
        int r = i/j;
        System.out.println("方法内部result:" + r);
        System.out.println("[日志]div方法结束，result=" + r);
        return r;
    }
}

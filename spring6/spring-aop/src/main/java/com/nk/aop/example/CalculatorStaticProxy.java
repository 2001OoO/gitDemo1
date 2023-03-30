package com.nk.aop.example;

public class CalculatorStaticProxy implements Calculator{

//    静态代理，通过构造函数把接口对象传进来
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("[日志]add方法开始，参数i=" + i + "  j=" + j);

        int r = calculator.add(i, j);

        System.out.println("[日志]add方法结束，result=" + r);
        return r;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}

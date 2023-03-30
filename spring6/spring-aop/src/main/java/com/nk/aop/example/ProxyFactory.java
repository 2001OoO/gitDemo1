package com.nk.aop.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
//    动态代理实现
//    传入代理对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

//    返回代理对象
    public Object getProxy(){

//        通过动态生成的代理类的加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
//        目标对象实现的所有接口的class类型数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
//        设置代理对象实现目标对象方法的过程
        InvocationHandler invocationHandler = new InvocationHandler(){
            /*
            Object proxy    代理对象
            Method method   需要重写目标的方法
            Object[] args   method方法里的参数
             */
            @Override
            public Object invoke(Object proxy,
                                 Method method,
                                 Object[] args) throws Throwable {
//                方法调用前输出
                System.out.println("[动态代理][日志]"+method.getName()+"，参数："+ Arrays.toString(args));
//                调用目标方法
                Object result = method.invoke(target, args);
//                方法调用后输出
                System.out.println("[动态代理][日志]"+method.getName()+"，结果："+ result);
                return result;
            }
        };

        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }


}

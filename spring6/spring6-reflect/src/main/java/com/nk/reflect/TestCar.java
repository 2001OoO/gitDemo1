package com.nk.reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCar {
//    获取类
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        获取类的方法
        Class class1 = Car.class;

        Class class2 = new Car().getClass();

        Class class3 = Class.forName("com.nk.reflect.Car");

//        实例化
        Car o = (Car) class3.getDeclaredConstructor().newInstance();
        System.out.println(o);
    }

//    获取构造
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class carClass = Car.class;
//        获取所有构造
        for (Constructor constructor : carClass.getConstructors()) {
            System.out.println(constructor.getName()+constructor.getParameterCount());
        }

//        构造public
//        Constructor constructor = carClass.getConstructor(String.class, int.class, String.class);
//        Car o = (Car) constructor.newInstance("奔驰", 2, "紫色");
//        System.out.println(o);

//        构造private
        Constructor constructor = carClass.getDeclaredConstructor(String.class, int.class, String.class);
        constructor.setAccessible(true);
        Car o = (Car) constructor.newInstance("奔驰", 2, "紫色");
        System.out.println(o.getColor());

    }

//    获取属性
    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class carClass = Car.class;
        Car o = (Car) carClass.getDeclaredConstructor().newInstance();
//        获取public属性
        Field[] field = carClass.getFields();

//        获取所有属性(包括私有属性)
        Field[] declaredFields = carClass.getDeclaredFields();
        for(Field field1:declaredFields){
            if(field1.getName().equals("name")){
                field1.setAccessible(true);
                field1.set(o,"傻狗车");
            }

            System.out.println(field1.getName());
            System.out.println(o);
        }
    }

//    获取方法
    @Test
    public void test4() throws InvocationTargetException, IllegalAccessException {
        Car car = new Car("奥迪",4,"蓝色");
        Class aClass = car.getClass();

//        获取public方法
        Method[] methods = aClass.getMethods();
        for(Method method:methods){
//            System.out.println(method.getName());
            if(method.getName().equals("toString")){
                String invoke = (String) method.invoke(car);
                System.out.println("invoke running = "+invoke);
            }
        }

//        获取private方法
        for (Method declaredMethod : aClass.getDeclaredMethods()) {
            if(declaredMethod.getName().equals("run")){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(car);
            }
        }


    }



}

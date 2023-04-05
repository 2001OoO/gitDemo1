package com.nk.spring6.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

//校验测试
public class TestPerson {
    public static void main(String[] args) {
//        创建Person对象
        Person person = new Person();
        person.setName("小黄狗");
        person.setAge(201);

//        创建Person对应DataBinder
        DataBinder dataBinder = new DataBinder(person);

//        设置校验器
        dataBinder.setValidator(new PersonValidator());

//        调用方法校验
        dataBinder.validate();

//        输出校验结果
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult.getAllErrors());

    }
}

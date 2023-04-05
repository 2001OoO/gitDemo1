package com.nk.spring6.validator.four;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

//自定义校验注解
public class CannotBlankValidator implements ConstraintValidator<CannotBlank,String> {
//    实现校验规则
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s!=null && s.contains(" ")){
//            获取默认提示信息
            String defaultConstraintMessageTemplate = constraintValidatorContext.getDefaultConstraintMessageTemplate();
            System.out.println("default message:"+defaultConstraintMessageTemplate);
//            禁用默认提示信息
            constraintValidatorContext.disableDefaultConstraintViolation();
//            设置提示语
            constraintValidatorContext.buildConstraintViolationWithTemplate("can not contains blank").addConstraintViolation();
            return false;
        }
        return true;
    }
}

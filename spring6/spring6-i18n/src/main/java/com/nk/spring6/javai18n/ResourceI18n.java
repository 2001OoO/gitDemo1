package com.nk.spring6.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("zh", "CN"));
        ResourceBundle bundle1 = ResourceBundle.getBundle("message", new Locale("en", "GB"));
        String test = bundle.getString("test");
        System.out.println(test);
        String test1 = bundle1.getString("test");
        System.out.println(test1);
    }
}

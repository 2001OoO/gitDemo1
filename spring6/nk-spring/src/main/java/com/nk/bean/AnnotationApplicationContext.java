package com.nk.bean;

import com.nk.anno.Bean;
import com.nk.anno.Di;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnnotationApplicationContext implements ApplicationContext{

//    创建map集合，放bean对象
    private Map<Class,Object> beanFactory = new HashMap<>();
    private static String rootPath;
//    返回对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

//    设置包扫描
    public AnnotationApplicationContext(String basePackage) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//    public static void test(){
//        String basePackage = "com.nk";
        try {
//        1.把.替换为/
//            String packagePath = basePackage.replaceAll("\\.", "\\\\");
            String packagePath = basePackage.replace(".", "/");
//            System.out.println(packagePath);
//        2.获取包的绝对路径
            Enumeration<URL> resources = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (resources.hasMoreElements()){
                URL url = resources.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
//                System.out.println(filePath);
//                System.out.println(rootPath);
                loadBean(new File(filePath));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        loadDi();
    }


    //    包扫描，实例化
    private void loadBean(File file) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        1.判断是否是文件夹
        if(file.isDirectory()){
//        2.获取文件夹的内容
            File[] files = file.listFiles();

//        3.判断文件夹是否为空，为空直接返回
            if(files == null || files.length == 0){
                return;
            }

//        4.如果不为空，遍历文件夹所有内容
            for(File f:files){
//        4.1遍历得到每个file对象，继续判断，如果还是文件夹，递归
                if(f.isDirectory()){
                    loadBean(f);
                }else {
//        4.2遍历得到file不是文件夹，是文件
//        4.3得到包路径+类名称部分，字符串截取
                    String pathWithPath = f.getAbsolutePath().substring(rootPath.length() - 1);

//        4.4当前文件类型是否是.class类型
                    if(pathWithPath.endsWith(".class")){

//        4.5如果是.class类型，把路径\替换成.  把.class去掉
                        String allName = pathWithPath.replace("\\", ".").replace(".class","");
//        4.6判断类上面是否有@bean注解，如果有实例化
//                        4.6.1获取类的Class
                        Class<?> aClass = Class.forName(allName);

//                        4.6.2判断是不是接口
                        if(!aClass.isInterface()){
//                            4.6.3不是接口，判断有没有注解
                            Bean annotation = aClass.getAnnotation(Bean.class);

                            if(annotation != null){
//                                4.6.4实例化
                                Object instance = aClass.getConstructor().newInstance();

//        4.7实例化后放入到map集合beanFactory
//                                4.7.1判断当前类如果有接口，让接口class作为map的key
                                if(aClass.getInterfaces().length>0){
                                    beanFactory.put(aClass.getInterfaces()[0],instance);
                                }else {
                                    beanFactory.put(aClass,instance);
                                }
                            }
                        }
                    }
                }
            }
        }



    }


//    public static void main(String[] args) {
//        test();
//    }

//属性注入
    private void loadDi() throws IllegalAccessException {
//        实例化对象在beanFactory的map集合里
//        1.遍历map集合
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        for(Map.Entry<Class, Object> entry:entries){
            //        2.获取map集合每个对象（value），每个对象属性获取到
            Object value = entry.getValue();
//            获取对象Class
            Class<?> aClass = value.getClass();
//            获取属性
            Field[] declaredFields = aClass.getDeclaredFields();
            //        3.遍历得到每个对象属性数组，得到每个属性
            for(Field field:declaredFields){
//        4.判断是否有@Di注解
                Di annotation = field.getAnnotation(Di.class);
                if(annotation!=null){
                    //        如果私有属性，设置可以设置值
                    field.setAccessible(true);
                    //        5.如果有@Di，对对象进行注入
                    field.set(value,beanFactory.get(field.getType()));
                }

            }
        }


    }
}

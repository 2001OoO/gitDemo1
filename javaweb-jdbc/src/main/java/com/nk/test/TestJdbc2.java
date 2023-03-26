package com.nk.test;

import javax.swing.*;
import java.sql.*;

public class TestJdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //        jdbc配置信息
        String url = "jdbc:mysql://localhost:3306/demo1db?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";

//        通过反射加载
//        加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);
        //编写sql
        String sql = "insert into users(id,name,password,email,birthday) values (?,?,?,?,?);";
//        向数据库发送sql的预编译对象prepareStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,3);
        preparedStatement.setString(2,"小李");
        preparedStatement.setString(3,"9999999");
        preparedStatement.setString(4,"9989@136.com");
        preparedStatement.setDate(5,new Date(new java.util.Date().getTime()));

//        执行查询sql,返回一个结果集
        int i = preparedStatement.executeUpdate();

        if(i>0){
            System.out.println("插入成功");
        }

//        关闭连接
        preparedStatement.close();
        connection.close();
    }
}

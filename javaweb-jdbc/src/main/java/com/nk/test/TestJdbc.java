package com.nk.test;

import java.sql.*;

public class TestJdbc {
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
//        向数据库发送sql的对象Statement
        Statement statement = connection.createStatement();
//        编写sql
        String sql = "select * from users";
//        执行查询sql,返回一个结果集
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.print("id:"+resultSet.getObject("id"));
            System.out.print("  name:"+resultSet.getObject("name"));
            System.out.print("  password:"+resultSet.getObject("password"));
            System.out.print("  email:"+resultSet.getObject("email"));
            System.out.println("  birthday:"+resultSet.getObject("birthday"));
        }

//        关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}

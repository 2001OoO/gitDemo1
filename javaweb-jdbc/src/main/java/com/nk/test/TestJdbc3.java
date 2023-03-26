package com.nk.test;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class TestJdbc3 {
    @Test
    public void Test() {
//        jdbc配置信息
        String url = "jdbc:mysql://localhost:3306/demo1db?useSSL=false&serverTimezone=UTC&useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";

        Connection connection = null;
    //        通过反射加载
    //        加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

    //        连接数据库
            connection = DriverManager.getConnection(url, username, password);

//            开启事务，关闭自动提交
            connection.setAutoCommit(false);

    //        sql语句
            String sql = "update account set money = money - 1 where name = '傻狗';";

    //        向数据库发送sql的预编译对象prepareStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

    //        制造错误
            int i = 1/0;

            //        sql语句2
            String sql2 = "update account set money = money + 100 where name = '傻猫';";
    //        第二条语句的提交
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            connection.commit();

    //        关闭连接
            preparedStatement.close();
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

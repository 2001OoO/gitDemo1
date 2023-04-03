package com.nk.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void jdbcTest(){
//        1.添加操作
//        编写sql     此处为预编译sql
        String sql = "insert into t_emp values(null,'bbbb',10,'母')";
        Object[] params = {};
//        int update = jdbcTemplate.update(sql, "傻o", 5, "公");
        int update = jdbcTemplate.update(sql);
        System.out.println(update);
    }
}

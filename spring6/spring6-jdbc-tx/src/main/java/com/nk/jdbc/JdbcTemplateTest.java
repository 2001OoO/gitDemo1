package com.nk.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;
import java.util.Map;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    查询    返回单个对象
    @Test
    public void jdbcDefine(){
        String sql = "select * from t_emp where id=?";
//        写法一
//        Emp emp1 = jdbcTemplate.queryForObject(sql,
//                (rs, rowNum) -> {
//                    Emp emp = new Emp();
//                    emp.setName(rs.getString("name"));
//                    emp.setAge(rs.getInt("age"));
//                    emp.setId(rs.getInt("id"));
//                    emp.setSex(rs.getString("sex"));
//                    return emp;
//                }
//                , 1);
//        写法二
        Emp emp1 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 3);
        System.out.println(emp1);

    }


//    查询  返回List集合
    @Test
    public void jdbcSelectList(){
        String sql = "select * from t_emp";
        List<Emp> maps = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(maps);
    }

//    查询  返回单个值
    @Test
    public void jdbcSelectValue(){
        String sql = "select count(*) from t_emp";
        int integer = jdbcTemplate.queryForObject(sql, int.class);
        System.out.println(integer);
    }



//    添加  修改  删除
    @Test
    public void jdbcTest(){
//        1.添加操作
//        编写sql     此处为预编译sql
//        String sql = "insert into t_emp values(null,?,?,?)";
//        int update = jdbcTemplate.update(sql, "yes", 5, "公");
//        System.out.println(update);

//        2.修改
//        String sql = "update t_emp set name=? where id=?";
//        int s = jdbcTemplate.update(sql, "小狗狗", 1);
//        System.out.println(s);

//        3.删除
        String sql = "delete from t_emp where id=?";
        int s = jdbcTemplate.update(sql, 2);
        System.out.println(s);

    }
}

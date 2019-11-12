package com.qf;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//JdbcTemplate最基本的用法
public class JdbcImpl1 {
    public static void main(String[] args) {

        DriverManagerDataSource dm = new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.jdbc.Driver");
        dm.setUrl("jdbc:mysql://localhost:3306/0906a");
        dm.setUsername("root");
        dm.setPassword("root");

        //创建JdbcTemplate
        JdbcTemplate jt = new JdbcTemplate();
        //设置数据源
        jt.setDataSource(dm);

        jt.execute("insert into cs values (5,55,555)");


    }
}

package com.qf;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserImpl implements User {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public  void  setUser(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate=jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Cs fingId(String username) {

        List<Cs> query = jdbcTemplate.query("select*from cs where cj=?", new BeanPropertyRowMapper<Cs>(Cs.class), username);
//        for (Cs cs : query) {
//            System.out.println(cs);
//        }

        return query.get(0);
    }

    @Override
    public Cs fingSno(Integer sno) {

        List<Cs> query = jdbcTemplate.query("select*from cs where sno>?", new BeanPropertyRowMapper<Cs>(Cs.class), sno);
//        for (Cs cs : query) {
//            System.out.println(cs);
//        }

        return query.isEmpty()?null:query.get(0);
    }
}

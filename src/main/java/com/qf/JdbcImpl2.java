package com.qf;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcImpl2 {
    public static void main(String[] args) {

        ApplicationContext cps = new ClassPathXmlApplicationContext("Jdbc.xml");

        JdbcTemplate jt = cps.getBean("JdbcTemplate", JdbcTemplate.class);

//        jt.execute("update cs set cno=88 where sno=3");
//
//        jt.execute("delete from cs where sno=8");

//        jt.update("update cs set cno=88 where sno=?",5);

        //得到返回数据
//        List<Cs> query = jt.query("select*from cs where cj> ?", new BeanPropertyRowMapper<Cs>(Cs.class), 100);
//        for (Cs cs : query) {
//            System.out.println(cs);
//        }

        Long aLong = jt.queryForObject("select  count(*) from cs where cj>?", Long.class, 100);
        System.out.println(aLong);


    }
}

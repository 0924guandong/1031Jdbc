package com.qf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {

        ApplicationContext cps = new ClassPathXmlApplicationContext("Jdbc.xml");

        User user = cps.getBean("user", User.class);
        Cs cs = user.fingId("2");
        System.out.println(cs);

        System.out.println("----------");

        User user1 = cps.getBean("user", User.class);
        Cs cs1 = user1.fingSno(3);
        System.out.println(cs1);

    }
}

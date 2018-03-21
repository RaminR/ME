package ru.ya.rrmstu.me.beans;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by RRM on 21/03/2018.
 */

@Component
public class TestBean {

    @Autowired
    private SessionFactory sessionFactory;

    public void test() {
        System.out.println("SessionFactory: " + sessionFactory);
    }
}
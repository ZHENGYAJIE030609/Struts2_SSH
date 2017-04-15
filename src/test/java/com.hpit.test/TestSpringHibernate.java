package com.hpit.test;

import com.hpit.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class TestSpringHibernate {
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Test
    public void getUser(){
       User user= hibernateTemplate.get(User.class,1);
        System.out.println(user.toString());
    }
}

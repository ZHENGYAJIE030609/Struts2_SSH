package com.hpit.test;

import com.hpit.entity.User;
import com.hpit.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class TestUserService {
    @Autowired
    private IUserService iUserService;

    public void setiUserService(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @Test
    public void getUser(){
        User user=iUserService.getModle(User.class,2);
        System.out.println(user.toString());
    }
}

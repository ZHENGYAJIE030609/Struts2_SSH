package com.hpit.web;

import com.hpit.entity.User;
import com.hpit.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Yegz on 2017/2/23.
 */
public class UserActionJson extends ActionSupport {
    private String uid;
    private IUserService userService;
    private User user;

    @Override
    public String execute() throws Exception {
        user = userService.getUserByUid(uid);
        System.out.println(user.toString());
        return SUCCESS;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}

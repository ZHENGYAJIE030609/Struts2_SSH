package com.hpit.service;

import com.hpit.entity.User;

import java.io.Serializable;

/**
 * Created by Yegz on 2017/2/23.
 */
public interface IUserService extends IBaseService<User, Serializable> {
    public User getUserByUid(String uid);
}

package com.hpit.dao;

import com.hpit.entity.User;

import java.io.Serializable;

/**
 * Created by Yegz on 2017/2/23.
 */
public interface IUserDao extends IBaseDao<User, Serializable> {
    public User getUserByUid(String uid);
}

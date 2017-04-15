package com.hpit.service.impl;

import com.hpit.dao.IUserDao;
import com.hpit.entity.User;
import com.hpit.service.IUserService;

import java.io.Serializable;

/**
 * Created by Yegz on 2017/2/23.
 */
public class UserService extends BaseService<User, Serializable> implements IUserService {
    private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserByUid(String uid) {
        return userDao.getUserByUid(uid);
    }
}

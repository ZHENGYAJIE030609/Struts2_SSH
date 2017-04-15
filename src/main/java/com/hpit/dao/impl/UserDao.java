package com.hpit.dao.impl;

import com.hpit.dao.IUserDao;
import com.hpit.entity.User;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;

/**
 * Created by Yegz on 2017/2/23.
 */
public class UserDao extends BaseDao<User, Serializable> implements IUserDao {
    private HibernateTemplate hibernateTemplate;

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public User getUserByUid(String uid) {
        return hibernateTemplate.get(User.class, uid);
    }
}

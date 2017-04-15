package com.hpit.service.impl;

import com.hpit.dao.IBaseDao;
import com.hpit.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yegz on 2017/2/23.
 */
public class BaseService<Model, Serialzable extends Serializable> implements IBaseService<Model, Serializable> {
    private IBaseDao baseDao;

    public void setBaseDao(IBaseDao baseDao) {
        this.baseDao = baseDao;
    }

    public Serializable addModel(Model model) {
        return baseDao.addModel(model);
    }

    public void delModel(Model model) {
        baseDao.delModel(model);
    }

    public void updateModel(Model model) {
        baseDao.updateModel(model);
    }

    public void saveOrUpdateModel(Model model) {
        baseDao.saveOrUpdateModel(model);
    }

    public Model getModle(Class<Model> modelClass, Serializable serializable) {
        return (Model) baseDao.getModle(modelClass, serializable);
    }

    public List<Model> listModel(Class<Model> modelClass) {
        return baseDao.listModel(modelClass);
    }
}

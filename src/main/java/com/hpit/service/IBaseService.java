package com.hpit.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yegz on 2017/2/23.
 */
public interface IBaseService<Model, PrimaryKey extends Serializable> {
    public Serializable addModel(Model model);

    public void delModel(Model model);

    public void updateModel(Model model);

    public void saveOrUpdateModel(Model model);

    public Model getModle(Class<Model> modelClass, PrimaryKey primaryKey);

    public List<Model> listModel(Class<Model> modelClass);
}

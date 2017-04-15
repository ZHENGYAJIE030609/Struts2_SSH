package com.hpit.dao.impl;

import com.hpit.dao.IBaseDao;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yegz on 2017/2/23.
 */
public class BaseDao<Model, Serialzable extends Serializable> implements IBaseDao<Model, Serializable>{

    private HibernateTemplate hibernateTemplate;

    public Serializable addModel(Model model) {return hibernateTemplate.save(model);}

    public void delModel(Model model) {hibernateTemplate.delete(model);}

    public void updateModel(Model model) {
        hibernateTemplate.update(model);
    }

    public void saveOrUpdateModel(Model model) {
        hibernateTemplate.saveOrUpdate(model);
    }

    public Model getModle(Class<Model> modelClass, Serializable serializable) {
        return hibernateTemplate.get(modelClass,serializable);
    }

    public List<Model> listModel(Class<Model> modelClass) {
        return hibernateTemplate.loadAll(modelClass);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

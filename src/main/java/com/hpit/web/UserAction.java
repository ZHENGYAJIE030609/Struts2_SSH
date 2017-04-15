package com.hpit.web;

import com.hpit.entity.User;
import com.hpit.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * Created by Yegz on 2017/2/23.
 */
public class UserAction extends ActionSupport {
    private String uid;

    private IUserService userService;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        User user = userService.getUserByUid(uid);
        System.out.println(user.toString());

        /*将获取到的user对象存到值栈中/作用域*/
        ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> request = (Map) actionContext.get("request");
        Map<String, Object> session = actionContext.getSession();
        Map<String, Object> application = actionContext.getApplication();
        request.put("user", user);
        session.put("user", user);
        application.put("user", user);
        return SUCCESS;
    }

}

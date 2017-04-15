package com.hpit.entity;

/**
 * Created by Administrator on 2017/2/25 0025.
 */
public class User {
    private int id;
    private String username;
    private String password;
    private int tel;
    private int email;

    public User() {
    }

    public User(int id, String username, String password, int tel, int email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", tel=" + tel +
                ", email=" + email +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }
}

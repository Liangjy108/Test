package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User实体类
 */
@Table(name = "t_user")
@Entity
public class User extends AbstractEntity{
    //用户id
    @Id
    public Integer id;
    //用户名
    @Column(name = "user_userName")
    private String userName;
    //用户密码
    @Column(name = "user_password")
    private int password;
    //用户手机号
    @Column(name = "user_phone")
    private int phone;
    //用户QQ
    @Column(name = "user_qq")
    private int qq;
    //用户email
    @Column(name = "user_email")
    private String email;

    //生成get方法

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }

    public int getPhone() {
        return phone;
    }

    public int getQq() {
        return qq;
    }

    public String getEmail() {
        return email;
    }

    //生成set方法

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //生成toString方法

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", phone=" + phone +
                ", qq=" + qq +
                ", email='" + email + '\'' +
                '}';
    }
}

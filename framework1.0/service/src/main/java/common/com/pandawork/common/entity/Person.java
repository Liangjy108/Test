package com.pandawork.common.entity;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * person实体类
 * Created by ljy on 2018/7/28.
 **/
//当前实体类对应的数据库 表的名字
@Table(name = "t_person")
@Entity
public class Person extends AbstractEntity{
    //主键设置
    @Id
    public Integer id;
    //人物姓名
    @Column(name = "person_name")
    private String name;
    //人物生日
    @Column(name = "person_birthday")
    private int birthday;
    //人物司职
    @Column(name = "person_department")
    private String department;
    //球队
    @Column(name = "person_team")
    private String team;
    //人物评价
    @Column(name = "person_cpmment")
    private String comment;

    //生成get方法
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getDepartment() {
        return department;
    }

    public String getTeam() {
        return team;
    }

    public String getComment() {
        return comment;
    }

    //生成set方法
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    //toString

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", department='" + department + '\'' +
                ", team='" + team + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

package com.chinasofti.supermark.domain;

import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 3L;
    //设置员工属性
    private Integer id;
    private String ename;
    private String account;
    private String password;
    private Integer job;
    //编写构造方法   Alt +insert
    public Employee() {
        super();
    }
    public Employee(Integer id, String ename, String account, String password, Integer job) {
        super();
        this.id = id;
        this.ename = ename;
        this.account = account;
        this.password = password;
        this.job = job;
    }
    public Employee(String ename, String account, String password, Integer job) {
        super();
        this.ename = ename;
        this.account = account;
        this.password = password;
        this.job = job;
    }
    //编写get|set	Shift+Alt+S
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getJob() {
        return job;
    }
    public void setJob(Integer job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return id + "\t" + ename + "\t" + account + "\t" + password + "\t"+ job;
    }
}

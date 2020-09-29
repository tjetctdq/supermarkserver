package com.chinasofti.supermark.service.impl;

import com.chinasofti.supermark.dao.EmployeeDao;
import com.chinasofti.supermark.dao.impl.EmployeeDaoImpl;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    //创建数据链路层对象
    private EmployeeDao dao;

    public EmployeeServiceImpl() {
        this.dao = new EmployeeDaoImpl();
    }
    @Override
    public Employee login(String account, String password) {
        return this.dao.selectByAccountAndPassword(account,password);
    }

    @Override
    public String addEmployee(String name, String account, String password, int job) {
        //进行验证  判断账号是否已经存在
        if(this.dao.selectByAccount(account)!=null){
            return "对不起，账号已经存在添加失败!";
        }
        return this.dao.insert(new Employee(name,account,password,job))>0?"添加成功":"添加失败！";
    }
}

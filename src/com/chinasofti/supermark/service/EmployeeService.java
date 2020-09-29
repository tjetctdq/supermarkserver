package com.chinasofti.supermark.service;

import com.chinasofti.supermark.domain.Employee;

public interface EmployeeService {
    //员工登陆
    Employee login(String account,String password);
    //员工插入
    String addEmployee(String name,String account,String password,int job);
}

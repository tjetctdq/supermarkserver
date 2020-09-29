package com.chinasofti.supermark.dao;

import com.chinasofti.supermark.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    //定义用的方法
    //新增员工的方法
    int insert(Employee e);
    //删除员工的方法
    int delete(int id);
    //修改员工 信息的方法
    int update(Employee e);
    //查询所有员工信息的方法
    List<Employee> selectAll();
    //根据名称查询员工信息的方法
    List<Employee> selectByName(String name);
    //根据id查询员工信息的方法
    Employee selectById(int id);
    //创建一个根据账号查询员工的方法
    Employee selectByAccount(String account);
    //根据账号和密码查询员工的方法
    Employee selectByAccountAndPassword(String account,String password);
}

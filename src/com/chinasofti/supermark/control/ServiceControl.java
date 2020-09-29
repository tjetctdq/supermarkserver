package com.chinasofti.supermark.control;

import com.chinasofti.supermark.domain.Category;
import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.domain.Orders;
import com.chinasofti.supermark.service.DishService;
import com.chinasofti.supermark.service.EmployeeService;

import java.util.List;
import java.util.Map;

//创建一个被代理的service将所有的serivce方法都在此进行融入

public interface ServiceControl {
    //员工登陆
    Employee login(String account, String password);
    //员工插入
    String addEmployee(String name,String account,String password,int job);

    Dish findDishById(int id);

    List<Dish> findDishByCid(int cid);
    //查询所有的方法
    List<Category> findAllCategory();
    //提交订单的方法
    Orders commit(Map<Dish, Integer> map, Employee emp);
}

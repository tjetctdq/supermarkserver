package com.chinasofti.supermark.control.impl;

import com.chinasofti.supermark.control.ServiceControl;
import com.chinasofti.supermark.domain.Category;
import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.domain.Orders;
import com.chinasofti.supermark.service.CategoryService;
import com.chinasofti.supermark.service.DishService;
import com.chinasofti.supermark.service.EmployeeService;
import com.chinasofti.supermark.service.OrderItemSerivce;
import com.chinasofti.supermark.service.impl.CategoryServiceImpl;
import com.chinasofti.supermark.service.impl.DishServiceImpl;
import com.chinasofti.supermark.service.impl.EmployeeServiceImpl;
import com.chinasofti.supermark.service.impl.OrderItemSerivceImpl;

import java.util.List;
import java.util.Map;

public class ServiceControlImpl  implements ServiceControl {
       //创建service对象
    private EmployeeService empService;
    private DishService dishService;
    private CategoryService cateService;
    private OrderItemSerivce orderItemSerivce;
    public ServiceControlImpl() {
        this.empService = new EmployeeServiceImpl();
        this.dishService = new DishServiceImpl();
        this.cateService = new CategoryServiceImpl();
        this.orderItemSerivce=new OrderItemSerivceImpl();
    }

    @Override
    public Employee login(String account, String password) {
        return this.empService.login(account, password);
    }

    @Override
    public String addEmployee(String name, String account, String password, int job) {
        return this.empService.addEmployee(name, account, password, job);
    }

    @Override
    public Dish findDishById(int id) {
        return this.dishService.findById(id);
    }

    @Override
    public List<Dish> findDishByCid(int cid) {
        return this.dishService.findByCid(cid);
    }

    @Override
    public List<Category> findAllCategory() {
        return this.cateService.findAll();
    }

    @Override
    public Orders commit(Map<Dish, Integer> map, Employee emp) {
        return this.orderItemSerivce.commit(map,emp);
    }
}

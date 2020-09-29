package com.chinasofti.supermark.service;

import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.domain.Orders;

import java.util.Map;

public interface OrderItemSerivce {
    Orders commit(Map<Dish,Integer> map, Employee emp);
}

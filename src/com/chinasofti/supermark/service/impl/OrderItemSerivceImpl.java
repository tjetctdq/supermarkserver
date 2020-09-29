package com.chinasofti.supermark.service.impl;

import com.chinasofti.supermark.dao.OrderItemDao;
import com.chinasofti.supermark.dao.impl.OrderItemDaoImpl;
import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.domain.Items;
import com.chinasofti.supermark.domain.Orders;
import com.chinasofti.supermark.service.OrderItemSerivce;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class OrderItemSerivceImpl implements OrderItemSerivce {
    private OrderItemDao dao;

    public OrderItemSerivceImpl() {
        this.dao = new OrderItemDaoImpl();
    }

    @Override
    public Orders commit(Map<Dish, Integer> map,Employee emp) {
        //创建orders对象进行dao层方法的调用
        Orders o=new Orders();
        o.setEid(emp.getId());
        o.setId(UUID.randomUUID().toString().//利用UUid进行生成
                replaceAll("-","").toUpperCase());
        o.setTime(new Date(System.currentTimeMillis()));
        List<Items> list=new ArrayList<Items>();
        //将购物车中添加的数据遍历存储到list中
        for (Dish d:map.keySet()) {
            list.add(new Items(d.getId(),map.get(d),o.getId()));
        }
        o.setList(list);
        this.dao.addOrder(o);
        return o;
    }
}

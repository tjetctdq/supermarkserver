package com.chinasofti.supermark.dao;

import com.chinasofti.supermark.domain.Items;
import com.chinasofti.supermark.domain.Orders;

import java.util.List;

public interface OrderItemDao {
    //添加订单
    int addOrder(Orders o);
    //添加订单详情
    int addItems(Items i);
    //查询订单详情根据oid
    List<Items> selectByOid(int oid);
    //查询订单的方法
    Orders selectById(int id);
    //。。。。。
}

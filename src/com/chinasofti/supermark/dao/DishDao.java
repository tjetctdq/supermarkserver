package com.chinasofti.supermark.dao;

import com.chinasofti.supermark.domain.Dish;

import java.util.List;

public interface DishDao {
    //根据id进行菜品查询
    Dish selectById(int id);
    //根据菜品类别进行查询
    List<Dish> selectByCateId(int cid);
    //查询所有菜品

    //新增菜品
    int insert(Dish dish);
    //修改菜品

    //删除菜品

    //根据菜品名称进行搜索
}

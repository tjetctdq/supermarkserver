package com.chinasofti.supermark.service.impl;

import com.chinasofti.supermark.dao.DishDao;
import com.chinasofti.supermark.dao.impl.DishDaoImpl;
import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.service.DishService;

import java.util.List;

public class DishServiceImpl implements DishService {
    //创建dao层对象
    private DishDao dao;

    public DishServiceImpl() {
        this.dao = new DishDaoImpl();
    }

    @Override
    public Dish findById(int id) {
        return this.dao.selectById(id);
    }

    @Override
    public List<Dish> findByCid(int cid) {
        return this.dao.selectByCateId(cid);
    }
}

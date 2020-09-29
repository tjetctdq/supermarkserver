package com.chinasofti.supermark.service;

import com.chinasofti.supermark.domain.Category;
import com.chinasofti.supermark.domain.Dish;

import java.util.List;

public interface DishService {
    Dish findById(int id);
    List<Dish> findByCid(int cid);
}

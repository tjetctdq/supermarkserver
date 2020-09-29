package com.chinasofti.supermark.dao;

import com.chinasofti.supermark.domain.Category;

import java.util.List;

public interface CategoryDao {
    //增加类别的方法

    //删除指定类别的方法

    //修改指定类别的方法

    //根据id查询类别

    //查询所有类别
    List<Category> selectAll();

}

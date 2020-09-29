package com.chinasofti.supermark.service.impl;

import com.chinasofti.supermark.dao.CategoryDao;
import com.chinasofti.supermark.dao.impl.CategoryDaoImpl;
import com.chinasofti.supermark.domain.Category;
import com.chinasofti.supermark.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao dao;

    public CategoryServiceImpl() {
        this.dao = new CategoryDaoImpl();
    }

    @Override
    public List<Category> findAll() {
        return this.dao.selectAll();
    }
}

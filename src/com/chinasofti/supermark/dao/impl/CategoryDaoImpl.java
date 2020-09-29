package com.chinasofti.supermark.dao.impl;

import com.chinasofti.supermark.dao.CategoryDao;
import com.chinasofti.supermark.domain.Category;
import com.chinasofti.supermark.util.DButil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {
    @Override
    public List<Category> selectAll() {
        //创建连接对象
        try {
            Connection conn = DButil.getConnection();
            return DButil.queryList(Category.class,
                    conn,
                    "select * from category");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

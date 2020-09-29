package com.chinasofti.supermark.dao.impl;

import com.chinasofti.supermark.dao.DishDao;
import com.chinasofti.supermark.domain.Category;
import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.util.DButil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DishDaoImpl implements DishDao {
    @Override
    public Dish selectById(int id) {
        //创建连接对象
        try {
            Connection conn = DButil.getConnection();
            return DButil.query(Dish.class,
                    conn,
                    "select * from dish where id = ?",
                    id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Dish> selectByCateId(int cid) {
        //创建连接对象
        try {
            Connection conn = DButil.getConnection();
            return DButil.queryList(Dish.class,
                    conn,
                    "select * from dish where cateId=?",
                    cid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int insert(Dish dish) {
        try {
            Connection conn = DButil.getConnection();
            return DButil.update(conn,
                    "insert into dish(dname,price,count,cateId) values(?,?,?,?)",
                    dish.getDname(),dish.getPrice(),dish.getCount(),dish.getCateId());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

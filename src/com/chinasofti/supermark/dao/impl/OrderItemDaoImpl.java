package com.chinasofti.supermark.dao.impl;

import com.chinasofti.supermark.dao.OrderItemDao;
import com.chinasofti.supermark.domain.Items;
import com.chinasofti.supermark.domain.Orders;
import com.chinasofti.supermark.util.DButil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OrderItemDaoImpl implements OrderItemDao {
    @Override
    public int addOrder(Orders o) {
        try {
            Connection conn = DButil.getConnection();
            int i= DButil.update(conn,
                    "insert into orders values(?,?,?)",
                    o.getId(),o.getTime(),o.getEid());
            for (Items it:o.getList()) {
                i=this.addItems(it);
            }

            return i;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public int addItems(Items i) {
        try {
            Connection conn = DButil.getConnection();
           return DButil.update(conn,
                    "insert into items(did,num,oid) values(?,?,?)",
                    i.getDid(),i.getNum(),i.getOid());
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Items> selectByOid(int oid) {
        try {
            Connection conn = DButil.getConnection();
            return DButil.queryList(Items.class,conn,
                    "select * from items where oid=?",oid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Orders selectById(int id) {
        try {
            Connection conn = DButil.getConnection();
            Orders o = DButil.query(Orders.class, conn,
                    "select * from orders where id =?", id);
            o.setList(this.selectByOid(id));
            return o;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

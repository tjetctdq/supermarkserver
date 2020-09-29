package com.chinasofti.supermark.dao.impl;

import com.chinasofti.supermark.dao.EmployeeDao;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.util.DButil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public int insert(Employee e) {
        //获取conn
        try {
            Connection conn = DButil.getConnection();
            return DButil.update(conn,
                    "insert into employee (ename,account,password,job) values(?,?,?,?)",
                    e.getEname(),e.getAccount(),e.getPassword(),e.getJob());
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }

    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public int update(Employee e) {
        return 0;
    }

    @Override
    public List<Employee> selectAll() {
        return null;
    }

    @Override
    public List<Employee> selectByName(String name) {
        return null;
    }

    @Override
    public Employee selectById(int id) {
        return null;
    }

    @Override
    public Employee selectByAccount(String account) {
        try {
            Connection conn = DButil.getConnection();
            return DButil.query(Employee.class,
                    conn,"select * from employee where account=?" ,
                    account);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Employee selectByAccountAndPassword(String account, String password) {
        try {
            Connection conn = DButil.getConnection();
            return DButil.query(Employee.class,conn,"select * from employee where account=? and password=?" ,
                    account,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

package com.chinasofti.supermark.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chinasofti.supermark.dao.impl.CategoryDaoImpl;
import com.chinasofti.supermark.dao.impl.DishDaoImpl;
import com.chinasofti.supermark.domain.Dish;
import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.service.EmployeeService;
import com.chinasofti.supermark.service.impl.EmployeeServiceImpl;
import com.chinasofti.supermark.util.DButil;
import org.junit.Test;

public class MyTest {


	public static void main(String[] args) throws SQLException{
		DishDaoImpl d=new DishDaoImpl();
	/*	String[] arr={"老村长","二锅头","农夫山泉","江小白","雪花"};
		for (int i = 0; i <arr.length ; i++) {
			d.insert(new Dish(arr[i],(i+1)*5.0,50,5));
		}*/

		d.selectByCateId(4).forEach(System.out::println);

		/*Connection conn = DButil.getConnection();
		 DButil.queryList(Employee.class, conn, "select * from employee").forEach(System.out::println);
*/
		//EmployeeService service=new EmployeeServiceImpl();
	/*	Employee e = service.login("admin123", "111111");
		System.out.println(e);*/


		//System.out.println(service.addEmployee("铁蛋","TR1001","123456",2));
		/*Employee emp = DButil.query(Employee.class, conn, "select * from employee where id=?", 2);

		System.out.println(emp);*/
		/*for (int i = 0; i <20 ; i++) {
			Connection conn = DButil.getConnection();
			DButil.update(conn, "insert into employee (ename,account,password,job) values(?,?,?,?)",
					"张"+i, "admin12"+i, "12345"+i, 1);
		}*/

/*		 int i = DButil.update(conn, "update employee set ename = ? ,password=? where id =?",
				"张美丽", "111111", 2);*/
		/*int i=DButil.update(conn,"delete from employee where id =?",1);
		System.out.println(i);*/
		//
		// DButil.query(Employee.class,conn,"select * from employee");
		//System.out.println(conn);  ctrl+alt+V  调用方法返回值自动填充
		/*PreparedStatement pstmt = DButil.getPstmt(conn,
				"insert into employee (ename,account,password,job) values(?,?,?,?)",
				"王刚蛋", "admin123", "123456", 0
		);*/
		//执行

	}
}

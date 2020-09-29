package com.chinasofti.supermark.test;

import com.chinasofti.supermark.domain.Employee;
import com.chinasofti.supermark.service.EmployeeService;
import com.chinasofti.supermark.service.impl.EmployeeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {
        //创建一个要去代理的对象
        EmployeeService service=new EmployeeServiceImpl();
        //创建代理对象
        EmployeeService proxyService=(EmployeeService) Proxy.newProxyInstance(
                EmployeeService.class.getClassLoader(),
                new Class[]{EmployeeService.class}, new InvocationHandler() {
                    @Override
         public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName());
                        for (Object o:args) {
                            System.out.println(o);
                        }
                        return method.invoke(service,args);
                    }
                });
        Employee emp = proxyService.login("admin123", "111111");
        System.out.println(emp);
    }
}

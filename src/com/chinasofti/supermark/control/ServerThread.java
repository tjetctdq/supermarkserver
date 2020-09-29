package com.chinasofti.supermark.control;

import com.chinasofti.supermark.control.impl.ServiceControlImpl;
import com.chinasofti.supermark.service.EmployeeService;
import com.chinasofti.supermark.service.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

public class ServerThread implements  Runnable{
    //需要客户端对象
    private Socket client;
    //创建被代理对象 当前案例是一个service
    // 可以将三个service融在一起
    private ServiceControl service;
    public ServerThread(Socket client) {
        this.client = client;
        this.service=new ServiceControlImpl();
    }

    @Override
    public void run() {
        //获取对象输入流
        try {
            ObjectInputStream ois=new ObjectInputStream(client.getInputStream());
            //读取客户端发送过来的方法名称
            String methodName =(String) ois.readObject();
            //读取客户端发送过来的方法参数类型
            Class<?>[] parameterTypes = (Class<?>[])ois.readObject();
            //获取客户端发送过来的具体的参数
            Object[] params =( Object[]) ois.readObject();
            //获取方法对象
            Method method = service.getClass().getMethod(methodName, parameterTypes);
            System.out.println(methodName);
            //执行方法获取结果
            Object o = method.invoke(service, params);
            //获取对象输出流
            ObjectOutputStream oos=new ObjectOutputStream(client.getOutputStream());
            //将方法执行的结果返回给客户端
            oos.writeObject(o);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("对象执行方法失败！");
        }
    }
}

package com.chinasofti.supermark.control;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//服务器的控制类 接受客户端信息  处理将结果发送给客户端
public class Control {
    //创建ServerSocket
    private ServerSocket server;
    //线程池
    private ExecutorService pool;
    //创建构造方法

    public Control() {
        try {
            this.server = new ServerSocket(7788);
            //实例化线程池
            this.pool= Executors.newCachedThreadPool();
            System.out.println("服务器已经开启,等待客户端连接");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器创建失败");
        }
    }
    public void start(){
        //创建一个while循环保证服务器可以一直接受客户端请求
        while(true){
            try {
                Socket client = this.server.accept();
                //创建runable实现类 交给线程池进行处理
                this.pool.execute(new ServerThread(client));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("客户端失联了！");
            }
        }
    }
}

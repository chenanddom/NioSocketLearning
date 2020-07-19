package com.itdom.backlogparameter;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BacklogServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(8088, 3);
        Thread.sleep(5000);

        System.out.println("accept1 begin");
        Socket socket1 = serverSocket.accept();
        System.out.println("accept1 end");

        System.out.println("accept2 begin");
        Socket socket2 = serverSocket.accept();
        System.out.println("accept2 end");


        System.out.println("accept3 begin");
        Socket socket3= serverSocket.accept();
        System.out.println("accept3 end");


        System.out.println("accept4 begin");
        Socket socket4= serverSocket.accept();
        System.out.println("accept4 end");


        System.out.println("accept5 begin");
        Socket socket5= serverSocket.accept();
        System.out.println("accept5 end");

        socket1.close();
        socket2.close();
        socket3.close();
        socket4.close();
        socket5.close();
        serverSocket.close();
    }
}

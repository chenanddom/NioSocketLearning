package com.itdom.portandlocalport;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class PortServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            System.out.println("服务端输出：");
            System.out.println("服务端的端口号socket.getLocalPort():"+socket.getLocalPort());
            System.out.println("客户端的端的端口号socket.getPort():"+socket.getPort());
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

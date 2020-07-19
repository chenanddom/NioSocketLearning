package com.itdom.bindstatus;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class BindServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            System.out.println("bind begin "+serverSocket.isBound());
            serverSocket.bind(new InetSocketAddress("127.0.0.1",8088));
            System.out.println("begin end "+serverSocket.isBound());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

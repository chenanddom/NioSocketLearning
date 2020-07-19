package com.itdom.gethostaddressmethod;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class GetHostServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("127.0.0.1",8088));
            System.out.println(serverSocket.getInetAddress().getHostAddress());
            System.out.println(serverSocket.getInetAddress().isLoopbackAddress());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

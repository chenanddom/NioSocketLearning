package com.itdom.closesocket;

import java.io.IOException;
import java.net.ServerSocket;

public class CloseSocketServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println(serverSocket.isClosed());
            serverSocket.close();
            System.out.println(serverSocket.isClosed());
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

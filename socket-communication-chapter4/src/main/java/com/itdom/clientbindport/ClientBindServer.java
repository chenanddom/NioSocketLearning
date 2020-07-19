package com.itdom.clientbindport;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientBindServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            socket.close();
            serverSocket.close();
            System.out.println("server end");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

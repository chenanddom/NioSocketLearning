package com.itdom.socketstatuscheck;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class StatusCheckServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

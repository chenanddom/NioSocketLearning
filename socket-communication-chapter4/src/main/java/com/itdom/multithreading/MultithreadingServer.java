package com.itdom.multithreading;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        int runTag = 1;
        while (runTag==1){
            Socket socket = serverSocket.accept();
            Multithreading multithreading = new Multithreading(socket);
            multithreading.start();
        }
        serverSocket.close();
    }
}

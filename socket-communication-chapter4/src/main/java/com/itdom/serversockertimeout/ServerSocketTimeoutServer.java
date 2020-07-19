package com.itdom.serversockertimeout;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTimeoutServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8088);
            System.out.println(serverSocket.getSoTimeout());
            serverSocket.setSoTimeout(4000);
            System.out.println();
            System.out.println("begin:"+System.currentTimeMillis());
            serverSocket.accept();
            System.out.println("end:"+System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("catch"+System.currentTimeMillis());
            try {
                Socket accept = serverSocket.accept();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}

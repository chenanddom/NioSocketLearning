package com.itdom.bindinetaddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class BindInetAddressServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        InetAddress localHost = InetAddress.getLocalHost();
        ServerSocket serverSocket = new ServerSocket(8088, 50, localHost);
        Thread.sleep(50000);
        for (int i = 0; i < 100; i++) {
            System.out.println("accept1 begin:"+(i+1));
            Socket socket = serverSocket.accept();
            System.out.println("accept1 end:"+(i+1));
        }
    }
}

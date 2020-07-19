package com.itdom.clientsetconnecttimeout;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ConnectTimeoutClient {
    public static void main(String[] args) {
        try {
        Socket socket = new Socket();
        socket.bind(new InetSocketAddress("127.0.0.1",7777));
        socket.connect(new InetSocketAddress("localhost",8088),2000);
        socket.close();
            System.out.println("client end!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

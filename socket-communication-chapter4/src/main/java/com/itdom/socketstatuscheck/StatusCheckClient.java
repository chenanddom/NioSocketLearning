package com.itdom.socketstatuscheck;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class StatusCheckClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        System.out.println("1 socket.isBound()="+socket.isBound());
        socket.bind(new InetSocketAddress("localhost",8000));
        System.out.println("2 socket.isBound()="+socket.isBound());

        System.out.println("3 socket.isConnected()="+socket.isConnected());
        socket.connect(new InetSocketAddress("localhost",8088));
        System.out.println("4 socket.isBound()="+socket.isConnected());



        System.out.println("5 socket.isClosed()="+socket.isClosed());
        socket.close();
        System.out.println("6 socket.isClosed()="+socket.isClosed());


    }
}

package com.itdom.clientbindport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientBindClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.bind(new InetSocketAddress("localhost",9000));
        socket.connect(new InetSocketAddress("localhost",8088));
        socket.close();
        System.out.println("client end!");
    }
}

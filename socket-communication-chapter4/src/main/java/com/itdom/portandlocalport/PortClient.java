package com.itdom.portandlocalport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class PortClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.bind(new InetSocketAddress("127.0.0.1",8080));
        socket.connect(new InetSocketAddress("localhost",8088));
        System.out.println("客户端的端口号socket.getLocalPort():"+socket.getLocalPort());
        System.out.println("服务端的端口号socket.getPort():"+socket.getPort());


    }
}

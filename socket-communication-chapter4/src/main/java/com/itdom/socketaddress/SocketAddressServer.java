package com.itdom.socketaddress;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;

public class SocketAddressServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        System.out.println("new ServerSocket()无参构造的端口是:" + serverSocket.getLocalPort());

        serverSocket.bind(new InetSocketAddress("127.0.0.1", 8088));

        System.out.println("调用完bind:" + serverSocket.getLocalPort());

        InetSocketAddress inetSocketAddress = (InetSocketAddress) serverSocket.getLocalSocketAddress();

        System.out.println("inetSocketAddress.getHostName=" + inetSocketAddress.getHostName());
        System.out.println("inetSocketAddress.getHostString=" + inetSocketAddress.getHostString());
        System.out.println("inetSocketAddress.getPort=" + inetSocketAddress.getPort());
        serverSocket.close();

    }
}

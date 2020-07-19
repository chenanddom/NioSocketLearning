package com.itdom.getlocalinetaddressandaddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class AddressServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            InetAddress inetAddress = socket.getLocalAddress();
            InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getLocalSocketAddress();
            byte[] address = inetAddress.getAddress();
            System.out.println("服务端的IP地址为:");
            for (int i = 0; i < address.length; i++) {
                System.out.print(address[i]+" ");
            }
            System.out.println();
            System.out.println("服务端的端口号："+inetSocketAddress.getPort());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

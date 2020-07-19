package com.itdom.getremoteaddressandsocketaddress;

import java.io.IOException;
import java.net.*;

public class RemoteaddressandsocketaddressServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();
        InetAddress inetAddress = socket.getInetAddress();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
        byte[] address = inetAddress.getAddress();
        System.out.println("客户端的IP地址为:");
        for (int i = 0; i < address.length; i++) {
            System.out.print(address[i]+" ");
        }
        System.out.println();
        System.out.println("客户端的端口为:"+inetSocketAddress.getPort());
        socket.close();
        serverSocket.close();
    }

}

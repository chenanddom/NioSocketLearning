package com.itdom.bindinetaddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class BindInetAddressClient {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();
        for (int i = 0; i < 100; i++) {
            Socket socket = new Socket(localHost, 8088);
            System.out.println("client端发起连接次数:"+(i+1));
        }
    }
}

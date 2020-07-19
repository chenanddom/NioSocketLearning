package com.itdom.getinetaddress;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class AddressServer {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8088);
        InetAddress address = inetSocketAddress.getAddress();
        byte[] ipAddress = address.getAddress();
        for (int i = 0; i < ipAddress.length; i++) {
            System.out.print((byte)ipAddress[i]+" ");
        }
    }
}

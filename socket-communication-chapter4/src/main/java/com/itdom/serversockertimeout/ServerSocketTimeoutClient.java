package com.itdom.serversockertimeout;

import java.io.IOException;
import java.net.Socket;

public class ServerSocketTimeoutClient {
    public static void main(String[] args) {
        try {
        System.out.println("client begin "+System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("client end:"+System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("catch:"+System.currentTimeMillis());

        }
    }
}

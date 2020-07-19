package com.itdom;

import java.io.IOException;
import java.net.Socket;

public class Client_1 {
    public static void main(String[] args) {
        try {
            System.out.println("client连接准备="+System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            System.out.println("client连接结束="+System.currentTimeMillis());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

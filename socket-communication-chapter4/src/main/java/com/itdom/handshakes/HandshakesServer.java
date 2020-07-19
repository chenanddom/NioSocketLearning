package com.itdom.handshakes;

import java.io.IOException;
import java.net.ServerSocket;

public class HandshakesServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("server 阻塞开始="+System.currentTimeMillis());
            serverSocket.accept();
            System.out.println("server 阻塞结束="+System.currentTimeMillis());
            Thread.sleep(Integer.MAX_VALUE);
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

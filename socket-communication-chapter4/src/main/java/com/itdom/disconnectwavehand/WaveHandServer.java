package com.itdom.disconnectwavehand;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WaveHandServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("server阻塞开始="+System.currentTimeMillis());
            Socket socket = serverSocket.accept();
            socket.close();
            serverSocket.close();
            Thread.sleep(20000);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

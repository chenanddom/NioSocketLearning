package com.itdom.disconnectwavehand;

import java.io.IOException;
import java.net.Socket;

public class WaveHandClient {
    public static void main(String[] args) {
        try {
            System.out.println("client连接准备="+System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("client端连接结束="+System.currentTimeMillis());
            socket.close();
            Thread.sleep(2000);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.itdom.handshakes;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class HandshakesClient {
    public static void main(String[] args) {
        try {
            System.out.println("client连接准备="+System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("client连接结束="+System.currentTimeMillis());
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("111".getBytes());
            outputStream.write("11111".getBytes());
            outputStream.write("1111111111".getBytes());
            Thread.sleep(500000000);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

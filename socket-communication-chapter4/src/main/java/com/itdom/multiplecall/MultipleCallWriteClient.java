package com.itdom.multiplecall;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MultipleCallWriteClient {
    public static void main(String[] args) {

        try {
            System.out.println("client Connection preparation="+System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("client connection end="+System.currentTimeMillis());
            Thread.sleep(2000);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("my name is chendom 1".getBytes());
            Thread.sleep(3000);
            outputStream.write("my name is chendom 2".getBytes());
            Thread.sleep(3000);
            outputStream.write("my name is chendom 3".getBytes());
            Thread.sleep(3000);
            outputStream.write("my name is chendom 4".getBytes());
            Thread.sleep(3000);
            outputStream.write("my name is chendom 5".getBytes());
            outputStream.close();
            socket.close();
            System.out.println("client close end="+System.currentTimeMillis());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package com.itdom.multithreading;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadingClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 8088);
        OutputStream outputStream = socket.getOutputStream();

        int readLength = -1;
        byte[] bytesArray = new byte[1024];
        for (int i = 0; i < 3000; i++) {
            outputStream.write("test multiThreading demo\n".getBytes());
            outputStream.flush();
        }
        InputStream inputStream = socket.getInputStream();
        while ((readLength = inputStream.read(bytesArray)) != -1) {
            String s = new String(bytesArray, 0, readLength);
            System.out.println(s);
        }
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}

package com.itdom;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptBlockServer {

    public static void main(String[] args) {
       byte[] byteArray = new byte[1024];
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("accept begin "+System.currentTimeMillis());
            Socket accept = serverSocket.accept();
            System.out.println("accept end "+System.currentTimeMillis());
            InputStream inputStream = accept.getInputStream();
            System.out.println("read begin "+System.currentTimeMillis());
            int readLength = inputStream.read(byteArray);
            System.out.println("read end "+System.currentTimeMillis());
            inputStream.close();
            accept.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

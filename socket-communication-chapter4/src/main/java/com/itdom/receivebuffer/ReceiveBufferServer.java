package com.itdom.receivebuffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveBufferServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            System.out.println("A server serverSocket.getReceiveBufferSize()="+serverSocket.getReceiveBufferSize());
            serverSocket.setReceiveBufferSize(66);
            System.out.println("B server serverSocket.getReceiveBufferSize()="+serverSocket.getReceiveBufferSize());
            serverSocket.bind(new InetSocketAddress("localhost",8088));
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            char[] charArray = new char[1024];
            int readLength = inputStreamReader.read(charArray);
            while (readLength!=-1){
                String s = new String(charArray, 0, readLength);
                System.out.print(s);
                readLength = inputStreamReader.read(charArray);
            }
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.itdom.closestreamerror;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CloseStreamServer {
    public static void main(String[] args) {
        try {
        byte[] charArray = new byte[10];
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            int readLength = inputStream.read(charArray);
            while (readLength!=-1){
                String newString = new String(charArray, 0, readLength);
                System.out.println(newString+" "+System.currentTimeMillis());
                readLength = inputStream.read(charArray);
            }
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

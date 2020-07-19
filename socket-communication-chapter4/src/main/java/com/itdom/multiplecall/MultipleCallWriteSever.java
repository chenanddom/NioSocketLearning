package com.itdom.multiplecall;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultipleCallWriteSever {
    public static void main(String[] args) {
        try {
            char[] charBuffer = new char[20];
            ServerSocket serverSocket = new ServerSocket(8088);
            System.out.println("server block begin=" + System.currentTimeMillis());
            Socket socket = serverSocket.accept();
            System.out.println("server block end=" + System.currentTimeMillis());
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            System.out.println("ServerB begin " + System.currentTimeMillis());
            int readLength = inputStreamReader.read(charBuffer);
            while (readLength != -1) {
                System.out.println(new String(charBuffer, 0, readLength));
                readLength = inputStreamReader.read(charBuffer);
            }
            inputStream.close();
            socket.close();
            serverSocket.close();
            System.out.println("server端运行结束=" + System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

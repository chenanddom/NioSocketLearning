package com.itdom;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class SendCharacterClient {
    public static void main(String[] args) {

        try {
            System.out.println("client端准备连接="+System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            System.out.println("client端连接结束="+System.currentTimeMillis());
            char[] charBuffer = new char[3];
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            System.out.println("serverB begin="+System.currentTimeMillis());
            int readLength = inputStreamReader.read(charBuffer);
            System.out.println("serverB end="+System.currentTimeMillis());
            while (readLength!=-1){
                System.out.println(new String(charBuffer,0,readLength));
                readLength = inputStreamReader.read(charBuffer);
            }
            System.out.println();
            inputStream.close();
            socket.close();
            System.out.println("client运行结束="+System.currentTimeMillis());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

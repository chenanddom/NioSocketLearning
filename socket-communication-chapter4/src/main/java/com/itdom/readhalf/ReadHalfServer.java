package com.itdom.readhalf;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReadHalfServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        System.out.println("A="+inputStream.available());
        byte[] bytes = new byte[2];
        int readLength = inputStream.read(bytes);
        System.out.println("server取得的数据："+new String(bytes,0,readLength));
        //服务端关闭读取
        socket.shutdownInput();
        System.out.println("B="+inputStream.available());
        readLength = inputStream.read(bytes);
        System.out.println("readLength="+readLength);
        socket.getInputStream();
        socket.close();
        serverSocket.close();

    }
}

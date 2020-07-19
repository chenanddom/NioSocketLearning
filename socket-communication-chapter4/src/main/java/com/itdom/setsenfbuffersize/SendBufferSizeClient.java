package com.itdom.setsenfbuffersize;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class SendBufferSizeClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        System.out.println("A client socket.getSendBuffetSize()=" + socket.getSendBufferSize());
        socket.setSendBufferSize(1);
        System.out.println("B client socket.getSendBuffetSize()=" + socket.getSendBufferSize());


        socket.connect(new InetSocketAddress("localhost", 8088));
        OutputStream outputStream = socket.getOutputStream();
        for (int i = 0; i < 5000000; i++) {
            outputStream.write("23721847128378213721846781231289371289372189".getBytes());
            System.out.println(i + 1);
        }
        outputStream.write("end!".getBytes());
        outputStream.close();
        socket.close();
    }
}

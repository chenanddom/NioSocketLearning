package com.itdom.readhalf;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ReadHalfClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8088);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("adhajdsadas".getBytes());
        socket.close();
    }
}

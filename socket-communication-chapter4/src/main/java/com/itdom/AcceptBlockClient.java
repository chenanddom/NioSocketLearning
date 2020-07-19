package com.itdom;

import java.io.IOException;
import java.net.Socket;

public class AcceptBlockClient {

    public static void main(String[] args) {
        try {
            System.out.println("socket begin "+System.currentTimeMillis());
            Socket socket = new Socket("localhost", 8088);
            System.out.println("socket end "+System.currentTimeMillis());
            Thread.sleep(Integer.MAX_VALUE);
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.itdom.clientsetconnecttimeout;

import java.io.IOException;
import java.net.ServerSocket;

public class ConnectTimeoutServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);

            Thread.sleep(Integer.MAX_VALUE);
            serverSocket.accept();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

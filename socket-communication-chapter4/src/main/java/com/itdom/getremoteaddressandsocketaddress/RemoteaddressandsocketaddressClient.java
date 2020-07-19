package com.itdom.getremoteaddressandsocketaddress;

import java.io.IOException;
import java.net.Socket;

public class RemoteaddressandsocketaddressClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8088);
        socket.close();
    }
}

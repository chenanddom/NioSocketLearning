package com.itdom.getlocalinetaddressandaddress;

import java.io.IOException;
import java.net.Socket;

public class AddressClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8088);
        socket.close();
    }
}

package com.itdom.backlogparameter;

import java.io.IOException;
import java.net.Socket;

public class BacklogClient {
    public static void main(String[] args) throws IOException {
        Socket socket1 = new Socket("127.0.0.1", 8088);
        Socket socket2 = new Socket("127.0.0.1", 8088);
        Socket socke3 = new Socket("127.0.0.1", 8088);
        Socket socke4 = new Socket("127.0.0.1", 8088);
        Socket socke5 = new Socket("127.0.0.1", 8088);
    }
}

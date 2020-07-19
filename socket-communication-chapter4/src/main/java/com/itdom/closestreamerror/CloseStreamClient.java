package com.itdom.closestreamerror;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class CloseStreamClient {
    public static void main(String[] args) throws IOException, InterruptedException {

            Socket socket = new Socket("127.0.0.1", 8088);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("just test".getBytes());
            outputStream.close();
            Thread.sleep(Integer.MAX_VALUE);

    }
}

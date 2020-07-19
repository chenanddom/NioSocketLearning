package com.itdom.transferpictures;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class TransferPicturesServer {
    public static void main(String[] args) {
        try {
            byte[] byteArray = new byte[1024 * 2];
            ServerSocket serverSocket = new ServerSocket( 8088);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            int readLeangth = inputStream.read(byteArray);
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\images\\pictures" + "\\" + UUID.randomUUID().toString() + ".PNG");
            while (readLeangth!=-1){
                fileOutputStream.write(byteArray,0,readLeangth);
                readLeangth = inputStream.read(byteArray);
            }
            fileOutputStream.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

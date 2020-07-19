package com.itdom.transferpictures;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TransferPicturesClient {
    public static void main(String[] args) {

        try {
            String pictureFile = "E:\\images\\0f578908-9d4a-40ef-82d5-bdbfc3ecd8f6.png";
            FileInputStream fileInputStream = new FileInputStream(pictureFile);
            byte[] byteArray = new byte[2048];
            System.out.println("socket begin "+System.currentTimeMillis());
            Socket socket = new Socket("127.0.0.1", 8088);
            System.out.println("socket begin "+System.currentTimeMillis());
            OutputStream outputStream = socket.getOutputStream();
            int readLength = fileInputStream.read(byteArray);
            while (readLength!=-1){
                outputStream.write(byteArray,0,readLength);
                readLength = fileInputStream.read(byteArray);
            }
            outputStream.close();
            fileInputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

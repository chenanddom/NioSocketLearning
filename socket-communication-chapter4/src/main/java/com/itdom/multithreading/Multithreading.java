package com.itdom.multithreading;

import java.io.*;
import java.net.Socket;

public class Multithreading extends Thread {

    private Socket socket;

    public Multithreading(Socket socket) {
        super();
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytesBuffer = new byte[1024];


            int readLength = inputStream.available();
            double doubleCount = (double) readLength/bytesBuffer.length;
            int intCount = (int) readLength/bytesBuffer.length;
            int count = doubleCount>intCount?intCount+1:intCount;
             int i=0;
             while (i<count){
                 i++;
                 int length = inputStream.read(bytesBuffer);
                 String newString = new String(bytesBuffer, 0, length);
                 System.out.println(newString);
             }
            outputStream.write("accepted....".getBytes());
            Thread.sleep(2000L);
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

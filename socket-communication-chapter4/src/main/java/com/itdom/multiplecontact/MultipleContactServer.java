package com.itdom.multiplecontact;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultipleContactServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            //开始输入
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new MyObjectInputStream(inputStream);
            int byteLength = objectInputStream.readInt();
            byte[] byteArray = new byte[byteLength];
            objectInputStream.readFully(byteArray);
            String newString = new String(byteArray);
            System.out.println(newString);
            //开始输出
            OutputStream outputStream = socket.getOutputStream();
            String strA = "Hello clientA\n";
            String strB = "Hello clientB\n";
            String strC = "Hello clientC\n";
            int allStrByteLength = (strA+strB+strC).getBytes().length;
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeInt(allStrByteLength);
            objectOutputStream.flush();
            objectOutputStream.write(strA.getBytes());
            objectOutputStream.write(strB.getBytes());
            objectOutputStream.write(strC.getBytes());
            objectOutputStream.flush();
            //输出结束
            //输入开始
            byteLength = objectInputStream.readInt();
            byteArray = new byte[byteLength];
            objectInputStream.readFully(byteArray);
            newString = new String(byteArray);
            System.out.println(newString);
             strA = "Hello clientD\n";
             strB = "Hello clientE\n";
             strC = "Hello clientF\n";
             objectOutputStream = new MyObjectOuputStream(outputStream);
            allStrByteLength = (strA+strB+strC).getBytes().length;
            objectOutputStream.writeInt(allStrByteLength);
            objectOutputStream.flush();
            objectOutputStream.write(strA.getBytes());
            objectOutputStream.write(strB.getBytes());
            objectOutputStream.write(strC.getBytes());
            objectOutputStream.flush();
            //输出结束
            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

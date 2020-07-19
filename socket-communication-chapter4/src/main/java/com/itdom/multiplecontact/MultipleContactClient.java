package com.itdom.multiplecontact;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultipleContactClient {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 8088);
            OutputStream outputStream = socket.getOutputStream();
            InputStream inputStream = socket.getInputStream();
            //输出开始
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            String strA = "Hello ServerA\n";
            String strB = "Hello ServerB\n";
            String strC = "Hello ServerC\n";
            int allStrByteLength = (strA + strB + strC).getBytes().length;
            objectOutputStream.writeInt(allStrByteLength);
            objectOutputStream.flush();
            objectOutputStream.write(strA.getBytes());
            objectOutputStream.write(strB.getBytes());
            objectOutputStream.write(strC.getBytes());
            objectOutputStream.flush();
            //输出结束

            //输入开始
            ObjectInputStream objectInputStream = new MyObjectInputStream(inputStream);
            int byteLength = objectInputStream.readInt();
            byte[] byteArray = new byte[byteLength];
            objectInputStream.readFully(byteArray);
            String newString = new String(byteArray);
            System.out.println(newString);
            //输入结束
            //输出开始
            String strD = "Hello ServerD\n";
            String strE = "Hello ServerE\n";
            String strF = "Hello ServerF\n";
            allStrByteLength = (strD + strE + strF).getBytes().length;
            objectOutputStream.writeInt(allStrByteLength);
            objectOutputStream.flush();
            objectOutputStream.write(strD.getBytes());
            objectOutputStream.write(strE.getBytes());
            objectOutputStream.write(strF.getBytes());
            objectOutputStream.flush();
            //输出结束

            //开始输出
            byteLength = objectInputStream.readInt();
            byteArray = new byte[byteLength];
            objectInputStream.readFully(byteArray);
            newString = new String(byteArray);
            System.out.println(newString);
            //结束输入
            objectOutputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

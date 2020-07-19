package com.itdom.objectorder;

import java.io.*;
import java.net.Socket;

public class ObjectOrderClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8088);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            for (int i = 0; i < 5; i++) {
                UserInfo userInfo = new UserInfo();
                userInfo.setId((long) (i + 1));
                userInfo.setUsername("clientUsername:" + (i + 1));
                userInfo.setPassword("clientPassword:" + (i + 1));
                objectOutputStream.writeObject(userInfo);
                UserInfo acceptUserInfo = (UserInfo) objectInputStream.readObject();
                System.out.println("在客户端" + (i + 1) + ":" + userInfo.getId() + "-" + userInfo.getUsername() + "-" + userInfo.getPassword());
            }
            objectOutputStream.close();
            objectInputStream.close();
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

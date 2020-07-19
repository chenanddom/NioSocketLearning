package com.itdom.objectorder;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectOrderServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (int i = 0; i < 5; i++) {
                UserInfo userInfo = (UserInfo)objectInputStream.readObject();
                System.out.println("在服务端接收的对象="+(i+1)+":"+userInfo.getId()+"-"+userInfo.getUsername()+"-"+userInfo.getPassword());

                UserInfo newUserInfo = new UserInfo();
                userInfo.setId((long) (i+1));
                userInfo.setUsername("serverUsername:"+userInfo.getUsername());
                userInfo.setPassword("serverPassword:"+userInfo.getPassword());
                objectOutputStream.writeObject(newUserInfo);
            }
            objectOutputStream.close();
            objectInputStream.close();
            outputStream.close();
            inputStream.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

        }
    }
}

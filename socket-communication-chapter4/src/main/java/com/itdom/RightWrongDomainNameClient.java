package com.itdom;

import java.net.Socket;

public class RightWrongDomainNameClient {
    public static void main(String[] args) {
        Socket socket = null;
        try {
        socket =  new Socket("www.csdn.net...", 80);
            System.out.println("连接成功");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

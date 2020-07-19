package com.itdom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CreateWebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader reader = new BufferedReader(inputStreamReader);
        String getString = "";
        while (!"".equals(getString = reader.readLine())){
            System.out.println(getString);
        }
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("HTTTP/1.1 200 OK\r\n\r\n".getBytes());
        new String();
        String s = new String("百度".getBytes("UTF-8"), "UTF-8");
        String content = "<html><body><a href='http://www.baidu.com'>"+s+"</a></body></html>";
        outputStream.write(content.getBytes());
        outputStream.flush();
        inputStream.close();
        outputStream.close();
        accept.close();
        serverSocket.close();

    }
}

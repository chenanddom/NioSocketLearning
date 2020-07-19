package com.itdom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.FileChannel;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("abc");
        FileChannel channel = fileInputStream.getChannel();

    }
}

package com.itdom;

import java.nio.ByteBuffer;

/**
 * 判断此缓冲区是否具有可访问的底层实现数组
 */
public class Test11 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        byteBuffer.put((byte)1);
        byteBuffer.put((byte)2);
        System.out.println(byteBuffer.hasArray());
    }
}

package com.itdom;

import java.nio.ByteBuffer;

public class Test5_1 {
    public static void main(String[] args) {
    byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println();
        byteBuffer.position(3);
        System.out.println("bytebuffer limit(2)之前的位置:"+byteBuffer.position());

        System.out.println();

        byteBuffer.limit(2);

        System.out.println("bytebuffer limit(2)之前的位置:"+byteBuffer.position());

    }
}

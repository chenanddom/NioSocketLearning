package com.itdom;

import java.nio.ByteBuffer;

/**
 * 2) position 不能大于其limit 。
 */
public class Test2_1 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.limit(2);
        byteBuffer.position(2);
        byteBuffer.put(new Byte("4"));
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
    }
}

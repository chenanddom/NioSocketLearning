package com.itdom;

import java.nio.ByteBuffer;

/**
 3) limit 不能大于其capac ity 。
 */
public class Test3_1 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("ByteBuffer capacity()="+byteBuffer.capacity());
        byteBuffer.limit(100);

    }
}

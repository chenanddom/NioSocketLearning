package com.itdom;

import java.nio.ByteBuffer;

/**
 * 在slice方法之后调用arrayOffset会出现非0的情况
 */
public class ArrayOffsetDemo {
    public static void main(String[] args) {
    byte[] byteArrayIn1 = {1,2,3,4,5,6,7,8};
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArrayIn1);
        byteBuffer1.position(5);
        ByteBuffer byteBuffer2 = byteBuffer1.slice();
        System.out.println(byteBuffer1.arrayOffset());
        System.out.println(byteBuffer2.arrayOffset());

    }
}

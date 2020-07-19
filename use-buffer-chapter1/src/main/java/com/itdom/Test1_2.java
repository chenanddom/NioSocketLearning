package com.itdom;

import java.nio.ByteBuffer;

/**
 * 1)缓冲区的l imit 不能为负数，缓冲区的position 不能
 为负数。
 */
public class Test1_2 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

        byteBuffer.limit(-1);

    }
}

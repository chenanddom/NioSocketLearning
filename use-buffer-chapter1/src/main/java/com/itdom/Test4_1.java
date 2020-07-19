package com.itdom;

import java.nio.ByteBuffer;

/**
 如果定义了mark ，则在将pos ition 或l imit 调整为小于该mark 的值时，该mark 被
 丢弃。
 */
public class Test4_1 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(1);
        byteBuffer.mark();
        System.out.println("bytebuffer 在="+byteBuffer.position()+" 位置设置mark 标记");
        byteBuffer.position(2);
        byteBuffer.reset();
        System.out.println();
        System.out.println("bytebuffer回到"+byteBuffer.position());
    }
}

package com.itdom;

import java.nio.ByteBuffer;

/**
 2 ）如果定义了mark ， 则在将limit 调整为不小于该mark 的值时，该mark
 不丢弃
 */
public class Test4_4 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(2);
        byteBuffer.mark();
        System.out.println("bytebuffer 在="+byteBuffer.position()+" 位置设置mark 标记");
       byteBuffer.limit(0);
        byteBuffer.position();
        byteBuffer.reset();
        System.out.println();
        System.out.println("bytebuffer回到"+byteBuffer.position());
    }
}

package com.itdom;

import java.nio.ByteBuffer;

public class Test5 {
    public static void main(String[] args) {
    byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("bytebuffer.capacity()="+byteBuffer.capacity());
        System.out.println();
        byteBuffer.position(1);
        //在1位置设置mark
        //没有设置时mark默认为-1
        byteBuffer.mark();
        System.out.println("bytebuffer.position()="+byteBuffer.position());
        //该表缓冲区的位置
        byteBuffer.position(2);
        //缓冲区位置重置,如果前面没有设置mark调用了reset()，那么会抛出InvalidMarkException
        byteBuffer.reset();
        System.out.println();
        System.out.println("bytebuffer.position()="+byteBuffer.position());

        byteBuffer.limit(2);
        byteBuffer.position(2);
        byteBuffer.putInt(4);

    }
}

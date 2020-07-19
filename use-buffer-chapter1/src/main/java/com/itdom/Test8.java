package com.itdom;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * 还原缓冲区的状态
 */
public class Test8 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(2);
        byteBuffer.limit(3);
        byteBuffer.mark();
        byteBuffer.clear();
        System.out.println("bytebuffer.position()="+byteBuffer.position());
        System.out.println();
        System.out.println("bytebuffer.limit()="+byteBuffer.limit());
        System.out.println();
        try {
            byteBuffer.reset();
        }catch (InvalidMarkException e){
            System.out.println("bytebuffer mark 丢失");
        }
    }
}

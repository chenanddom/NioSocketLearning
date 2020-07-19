package com.itdom;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * 对缓冲区进行反转:首先将限制设置为当前位置，然后将位置设置为0，如果已经定义了标记，则丢弃白标记
 *
 */
public class Test9 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        byteBuffer.position(2);
        byteBuffer.mark();
        byteBuffer.flip();
        System.out.println("bytebuffer.position()="+byteBuffer.position());
        System.out.println();
        System.out.println("bytebuffer.limit()="+byteBuffer.limit());
        System.out.println();

        try {
        byteBuffer.reset();
        }catch (InvalidMarkException e){
            System.out.println("bytebuffer mark丢失");
        }



    }

}

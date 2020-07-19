package com.itdom;

import java.nio.ByteBuffer;

/**
 * 判断当前位置与限制之间是否有剩余的元素
 */
public class Test12 {
    public static void main(String[] args) {

        byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer wrap = ByteBuffer.wrap(byteArray);
        wrap.limit(5);
        while (wrap.hasRemaining()){
            System.out.print(wrap.get());
        }

        wrap.position(3);
        System.out.println("byteBuffer.hasRemaining()="+wrap.hasRemaining()+" bytebuffer.remaining()="+wrap.remaining());



    }
}

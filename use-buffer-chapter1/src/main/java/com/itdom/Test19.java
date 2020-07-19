package com.itdom;

import java.nio.ByteBuffer;

/**
 * put(ByteBuffer src）方法的作用：相对批量put 方法，此方法将给定源缓冲区中的剩余
 字节传输到此缓冲区的当前位置中。如果源缓冲区中的剩余字节多于此缓冲区中的剩余字
 节，即src.remaining() > remaining（），则不传输字节且抛出BufferOverflow Exception 异常。
 否则，此方法将给定缓冲区中的n = src.remaining（）个字节复制到此缓冲区中，从每个缓冲
 区的当前位置开始复制。然后，这两个缓冲区的位置都增加n 。
 */
public class Test19 {

    public static void main(String[] args) {
        byte[] byteArrayIn1={1,2,3,4,5,6,7,8};

        ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArrayIn1);

        byte[] byteArrayIn2={55,66,77};

        ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteArrayIn2);

        byteBuffer1.position(4);
        byteBuffer2.position(1);

        byteBuffer1.put(byteBuffer2);

        System.out.println("byteBuffer1 被改变: "+byteBuffer1.position());
        System.out.println("byteBuffer2 被改变: "+byteBuffer1.position());

        byte[] array = byteBuffer1.array();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}

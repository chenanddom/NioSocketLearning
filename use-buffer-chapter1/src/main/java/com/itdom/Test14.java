package com.itdom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * final int arrayOffset():返回此缓冲区区底层数组中第一个缓冲区的元素的偏移量，这个之
 * 是可选操作。
 *2. 使用List.toArray(T[])转成数组类型
 */
public class Test14 {
    public static void main(String[] args) {
    byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("arrayOffset()="+byteBuffer.arrayOffset());
        System.out.println("----------------------------------------");

        ByteBuffer byteBuffer1 = ByteBuffer.wrap(new byte[]{'a','b','c'});
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(new byte[]{'x','y','z'});
        ByteBuffer byteBuffer3 = ByteBuffer.wrap(new byte[]{'1','2','3'});

        List<ByteBuffer> list = new ArrayList<ByteBuffer>();
        list.add(byteBuffer1);
        list.add(byteBuffer2);
        list.add(byteBuffer3);
        ByteBuffer[] byteBuffersArray = list.toArray(new ByteBuffer[list.size()]);
        System.out.println(byteBuffersArray.length);
        for (int i = 0; i < byteBuffersArray.length; i++) {
            ByteBuffer buffer = byteBuffersArray[i];
        while (buffer.hasRemaining()){
            System.out.print((char) buffer.get());
        }
            System.out.println();
        }
    }
}

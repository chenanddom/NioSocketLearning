package com.itdom;

import java.nio.ByteBuffer;

/**
 * slice()主要是创建心得字节缓冲区，其内容是此缓冲区内容得共享得子序列.新缓冲区得内容将重此缓区得当前位置开始
 * 此缓冲区得内容的更改在新缓冲区中是可见的，反之亦然。
 */
public class SliceDemo {
    public static void main(String[] args) {
        byte[] byteArrayIn1 = {1,2,3,4,5,6,7,8};
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArrayIn1);
        byteBuffer1.position(5);
        ByteBuffer byteBuffer2 = byteBuffer1.slice();
        System.out.println("byteBuffer1.position()="+byteBuffer1.position()+"byteBuffer1.capacity()="
                +byteBuffer1.capacity()+"byteBuffer1.limit()="+byteBuffer1.limit());
        System.out.println("byteBuffer2.position()="+byteBuffer2.position()+"byteBuffer2.capacity()="
                +byteBuffer2.capacity()+"byteBuffer2.limit()="+byteBuffer2.limit());

        byteBuffer2.put(0,(byte)111);
        byte[] byteArray1 = byteBuffer1.array();
        byte[] byteArray2 = byteBuffer1.array();
        for (int i = 0; i < byteArray1.length; i++) {
            System.out.print(byteArray1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < byteArray2.length; i++) {
            System.out.print(byteArray2[i]+" ");
        }
    }

}

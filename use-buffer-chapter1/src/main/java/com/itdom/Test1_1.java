package com.itdom;

import java.nio.ByteBuffer;

/**
 * 缓冲区的capacity 不能为负数，缓冲区的l imit 不能为负数，缓冲区的position 不能
 为负数。
 */
public class Test1_1 {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(-1);
        }catch (IllegalArgumentException e){
            System.out.println("Bytebuffer容量capacity大小不能为负数");
            e.printStackTrace();
        }
    }
}

package com.itdom;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * 当limit 和position 值一样时， 在指定的position 写人数据时会出现异常， 因为
 此位置是被限制的。
 */
public class Test6_1 {
    public static void main(String[] args) {
        char[] charArray = new char[]{'a','b','c','d'};
        CharBuffer charBuffer = CharBuffer . wrap(charArray);
        System.out.println("A capacity()="+charBuffer.capacity()+" limit()="+charBuffer.limit()+" position()="+charBuffer.position());

        System.out.println("--------------------------------------");
        charBuffer.position(1);
        charBuffer.limit(1);
        charBuffer.put('z');
    }
}

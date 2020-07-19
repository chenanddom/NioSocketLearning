package com.itdom;

import java.nio.CharBuffer;

/**
 * remaining()返回当前位置与元素之间的元素数
 */
public class Test4 {
    public static void main(String[] args) {

        char[] charArray = new char[]{'a','b','c','d','e'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("A capacity()="+charBuffer.capacity()+" limit()="+charBuffer.limit()+" position()="+charBuffer.position());
charBuffer.position(2);
        System.out.println("A capacity()="+charBuffer.capacity()+" limit()="+charBuffer.limit()+" position()="+charBuffer.position());
        System.out.println("C remaining()="+charBuffer.remaining());
    }
}

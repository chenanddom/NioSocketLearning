package com.itdom;

import java.nio.CharBuffer;

public class Test2 {

    public static void main(String[] args) {
        char[] charArray = new char[]{'a','b','c','d','e'};
        CharBuffer buffer = CharBuffer.wrap(charArray);
        System.out.println("capacity()="+buffer.capacity()+" limit()="+buffer.limit());
        //返回此缓冲区的最大限制,此处是3，标识只有0，1，2的位置可以操作.
        buffer.limit(3);
        System.out.println();
        //capacity()标识的是缓冲区的容量，它是从1开始计算的。
        System.out.println("capacity()="+buffer.capacity()+" limit()="+buffer.limit());

        buffer.put(0,'1');
        buffer.put(1,'2');
//此处如果操作就会出现Exception in thread "main" java.lang.IndexOutOfBoundsException
//        buffer.put(3,'4');
//        buffer.put(4,'5');
        System.out.println(buffer.position());


    }
}

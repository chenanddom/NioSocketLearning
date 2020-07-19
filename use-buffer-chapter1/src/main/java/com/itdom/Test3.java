package com.itdom;

import java.nio.CharBuffer;

public class Test3 {
    public static void main(String[] args) {

        char[] charArray = new char[]{'a','b','c','d'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("A capacity()="+charBuffer.capacity()+
                " limit()="+charBuffer.limit()+" position()="+charBuffer.position());
        //返回此缓冲区的位置(代表了下一个要读取或者写入的元素的index),缓冲区的posItion(位置)不能为负，
        //并且posistion不能大于其的limit
        charBuffer.position(2);
        System.out.println("A capacity()="+charBuffer.capacity()+
                " limit()="+charBuffer.limit()+" position()="+charBuffer.position());
        charBuffer.put('z');
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]+" ");
        }

    }

}

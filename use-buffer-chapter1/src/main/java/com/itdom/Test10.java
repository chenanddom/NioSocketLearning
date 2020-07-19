package com.itdom;

import java.nio.CharBuffer;

/**
 * flip()常用在缓冲区中写入一下数据后，下一步读取缓冲区中的数据之前调用。
 */
public class Test10 {
    public static void main(String[] args) {
        CharBuffer charBuffe = CharBuffer.allocate(20);
        System.out.println("A posiition()="+charBuffe.position()+" limit()="+charBuffe.limit());
        //一共写入14个字符
        charBuffe.put("我时中国人我在中华人民共和国");
        System.out.println("B position()="+charBuffe.position()+" limit()="+charBuffe.limit());
        //位置postion还原成0
        charBuffe.position(0);
        System.out.println("C position()="+charBuffe.position()+" limit()="+charBuffe.limit());

        for (int i = 0; i <charBuffe.limit() ; i++) {
            System.out.print(charBuffe.get());
        }
        System.out.println();
        System.out.println("D position()="+charBuffe.position()+" limit()="+charBuffe.limit());
        //还原缓冲区
        charBuffe.clear();
        System.out.println("E position()="+charBuffe.position()+" limit()="+charBuffe.limit());
        //接着写入数据
        charBuffe.put("我是机器人");
        System.out.println("F position()="+charBuffe.position()+" limit()="+charBuffe.limit());
        //设置for循环的结束位置，也就是新的limit,此处可以使用flip()代替
//        charBuffe.limit(charBuffe.position());
//        charBuffe.position(0);
        charBuffe.flip();
        System.out.println("G position()="+charBuffe.position()+" limit()="+charBuffe.limit());
        for (int i = 0; i <charBuffe.limit() ; i++) {
            System.out.print(charBuffe.get());
        }










    }
}

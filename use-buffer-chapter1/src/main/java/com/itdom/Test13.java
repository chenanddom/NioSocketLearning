package com.itdom;

import java.nio.ByteBuffer;

/**
 * rewind（）：使缓冲区为“重新读取”已包含的数据做好准备，它使限制保持不变，将
 位置设置为0 。

 口rewind（）：使缓冲区为“重新读取”已包含的数据做好准备，它使限制保持不变，将
 位置设置为0 。
 仅供非商业用途或交流学习使用
 32 •!• NIO 与Socket 编程技术指南
 口clear（）：使缓冲区为一系列新的通道读取或相对put(value）操作做好准备，即它将限
 制设置为容量大小，将位置设置为0 。
 0 flip （） ： 使缓冲区为－系列新的通道写入或相对get(value）操作做好准备，即它将限制
 设置为当前位置，然后将位置设置为0 。

 */
public class Test13 {

    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        System.out.println("capacity()="+byteBuffer.capacity()+" limit()="+byteBuffer.limit()+" position()="+byteBuffer.position());

        byteBuffer.position(1);
        byteBuffer.limit(3);
        byteBuffer.mark();

        System.out.println("capacity()="+byteBuffer.capacity()+" limit()="+byteBuffer.limit()+" position()="+byteBuffer.position());

        byteBuffer.rewind();

        System.out.println("capacity()="+byteBuffer.capacity()+" limit()="+byteBuffer.limit()+" position()="+byteBuffer.position());

        byteBuffer.reset();




    }

}

package com.itdom;

import java.nio.ByteBuffer;

public class Test6 {
    public static void main(String[] args) {
        byte[] byteArray = new byte[]{1,2,3,4,5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        //告知缓冲区是不是只读缓冲区
        System.out.println("bytebuffer.isReadOnly="+byteBuffer.isReadOnly());
       // ByteBuffer.allocateDirect(1000)创建直接缓冲区(不需要将数据暂存在JVM中间缓冲区)
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(1000);
        System.out.println(byteBuffer.isDirect()+"---"+byteBuffer1.isDirect());

    }
}

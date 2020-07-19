package com.itdom;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * asCharBuffer()方法的作用:创建此字节缓冲区的视图，作为char缓冲区。新缓冲区的内容将从此缓冲区的当前位置开始.
 * 此缓冲区的内容的更改在新缓冲区中是可见的，反之亦然。这两个缓冲区的位置，限制和标记值是相互独立。新蝗虫去的位置为0
 * 其容量和限制将为此蝗虫去的剩余字节的1/2，其标记是不确定的，
 */
public class CharBufferDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
    byte[] byteArrayIn1 = "我是中国人".getBytes("UTF-16BE");
        System.out.println(Charset.defaultCharset().name());

        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayIn1);
        System.out.println("bytebuffer()="+byteBuffer.getClass().getName());
        //这一句会将编码格式变为UTF-16BE,可以使用  CharBuffer charBuffer = Charset.forName("utf-8").decode(byteBuffer);
        //来处理
        CharBuffer charBuffer = byteBuffer.asCharBuffer();

        System.out.println("charBuffer()="+charBuffer.getClass().getName());

        System.out.println("bytebuffer.position()="+byteBuffer.position()
                +" bytebuffer.capacity()="+byteBuffer.capacity()
                +" bytebuffer.limit()="+byteBuffer.limit());

        System.out.println("charBuffer.position()="+charBuffer.position()
                +" charBuffer.capacity()="+charBuffer.capacity()
                +" charBuffer.limit()="+charBuffer.limit());

        System.out.println(charBuffer.capacity());
        charBuffer.position(0);

        for (int i = 0; i <charBuffer.capacity() ; i++) {
        //get()方法使用的编码为UTF-16BE
        //UTF-8 与UTF-16BE并不是同一种编码
            //所有这是会出现乱码
            System.out.print(charBuffer.get()+" ");
        }





    }
}

package com.itdom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/**
 * 字节缓冲区和直接缓冲区
 *
 * 如果字节缓冲区为直接字节缓冲区，那么JVM会尽量在直接的字节缓冲区上执行
 * 本机的I/O操作，也就是直接对内核空间进行访问，可以提高访问的效率。
 * 使用allocateDirect()方法创建出来的缓冲区类型为DirectByteBuffer,使用
 * allocate()方法创建出来的缓冲区是HeapByteBuffer。
 * 使用allocateDirect()创建出来的缓冲区是如何释放内存的呢?有两种内存，一种是手动释放，另一种是交给JVM进行处理。
 */
public class Test15 {
    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("A");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1000000000);
        System.out.println("B");
        byte[] byteArray = new byte[]{1};
        System.out.println(Integer.MAX_VALUE);
        for (int i = 0; i < 10000; i++) {
            byteBuffer.put(byteArray);
        }
        System.out.println("put end!");
        Thread.sleep(1000L);
        Method clearMethod = byteBuffer.getClass().getMethod("cleaner");
        clearMethod.setAccessible(true);
        Object retValue = clearMethod.invoke(byteBuffer);
        Method cleanMethod = retValue.getClass().getMethod("clean");
        cleanMethod.setAccessible(true);
        cleanMethod.invoke(retValue);
        //此处运行的效果是1s在之后立即回收内存
        //也就是回收"直接缓冲区的"所占用的内存
    }
}

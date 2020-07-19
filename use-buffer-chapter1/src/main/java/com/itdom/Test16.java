package com.itdom;

import java.nio.ByteBuffer;

/**
 * 直接缓冲区（ DirectByteBuffer ）在内部使用sun.misc.Unsafe 类进行值的处理。Unsafe
 类的作用是JVM 与操作系统进行直接通信，提高程序运行的效率，但正如其类的名称
 Unsafe 一样，该类在使用上并不是安全的，如果程序员使用不当，那么极有可能出现处理
 数据上的错误，因此，该类并没有公开化（ public ），仅由JDK 内部使用。
 */
public class Test16 {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        ByteBuffer buffer = ByteBuffer.allocateDirect(190000000);
//        ByteBuffer buffer = ByteBuffer.allocate(190000000);
        for (int i = 0; i <190000000 ; i++) {
            buffer.put((byte) 123);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-beginTime);
    }
}

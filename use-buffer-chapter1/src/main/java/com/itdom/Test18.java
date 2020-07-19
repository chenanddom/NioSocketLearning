package com.itdom;

import java.nio.ByteBuffer;

/**
 * 在调用get(byte[] dst , int offset, int length ）方法时，如果遇到这种从缓冲区中获得数据
 时有可能取多或取少的情况，那么可以使用如下的示例代码进行解决：
 */
public class Test18 {
    public static void main(String[] args) {

        byte[] byteArrayIn={1,2,3,4,5,6,7,8,9,10,11,12};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayIn);
        final byte[] byteArrayOut = new byte[5];
        while (byteBuffer.hasRemaining()){
            int readLength = Math.min(byteBuffer.remaining(), byteArrayOut.length);
            byteBuffer.get(byteArrayOut,0,readLength);
            for (int i = 0; i <readLength ; i++) {
                System.out.print(byteArrayOut[i]+" ");
            }
            System.out.println();
        }
    }
}

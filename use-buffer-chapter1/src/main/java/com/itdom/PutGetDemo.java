package com.itdom;

import java.nio.ByteBuffer;

public class PutGetDemo {

    public static void main(String[] args) {
        byte[] byteArrayIn1 = {1,2,3,4,5,6,7,8};
        byte[] byteArrayIn2 = {55,66,77,88};
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put(byteArrayIn1);
        byteBuffer.position(2);
        byteBuffer.put(byteArrayIn2,1,3);
        System.out.print("A=");
        byte[] getByte = byteBuffer.array();
        for (int i = 0; i < getByte.length; i++) {
            System.out.print(getByte[i]+" ");
        }
        System.out.println();

        byteBuffer.position(1);
        System.out.println("byteBuffer position="+byteBuffer.position());
//／／使用get （）方法从缓冲区position 值为1 的位置开始，向byteArrayOut 数组的
//／／索引为3 处一共复制4 个字节
//／／说明方法get (byte [ J dst ， 工nt offset , int le口gth ）获得数据的位置参考
//／／ 的是Buff er 当前的posit 工on 位置
        byte[] byteArrayOut = new byte[byteBuffer.capacity()];
        byteBuffer.get(byteArrayOut,3,4);
        System.out.print("A=");
        for (int i = 0; i < byteArrayOut.length; i++) {
            System.out.print(byteArrayOut[i]+" ");
        }
    }

}

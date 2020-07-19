package com.itdom;

import java.nio.ByteBuffer;

/**
 * put(byte[] src, int offset, int length）
 * 1 ) src ： 缓冲区中当前位置的数据来自于src 数组。
 2) offset ： 要读取的第一个字节在“数组中的偏移量” ，并“不是缓冲区的偏移”， 必须
 为非负且不大于src.length 。
 3) length ：要从给定数组读取的字节的数量，必须为非负且不大于src.length-offset
 */
public class Test17 {

    public static void main(String[] args) {
        byte[] byteArrayIn1 = {1,2,3,4,5,6,7,8};
        byte[] byteArrayIn2={55,66,77,88};
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        //将1,2,3,4,5,6,7,8放入缓冲区的前面8个位置中。
        byteBuffer.put(byteArrayIn1);
        byteBuffer.position(2);
        /*
        ／／ 将数组55,66 , 77 , 88 中的66 , 77 , 88 放入缓冲区的第3 位
／／ 值变成1 , 2' 66 ' 77 ' 88 ' 6' 7 ' 8
／／ 说明方法put (byte [ l src ， 工nt offs e t , int length ）放入的位置参考
／／ 的是Buffer 当前的p ositi on 位置
         */
        byteBuffer.put(byteArrayIn2,1,3);
        System.out.print("A=");
        byte[] array = byteBuffer.array();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        byteBuffer.position(1);
        byte[] byteArrayout = new byte[byteBuffer.capacity()];
        /*

        ／／使用get （）方法从缓冲区position 值为1 的位置开始，向byteArrayOut 数组的
／／索引为3 处一共复制4 个字节
／／说明方法get (byte [ J dst ， 工nt offset , int le口gth ）获得数据的位置参考
／／ 的是Buff er 当前的posit 工on 位置
         */
        byteBuffer.get(byteArrayout,3,4);
        System.out.print("B=");
        for (int i = 0; i < byteArrayout.length; i++) {
            System.out.print(byteArrayout[i]+" ");
        }

    }

}

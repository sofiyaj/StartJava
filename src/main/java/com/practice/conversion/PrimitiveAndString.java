package com.practice.conversion;

public class PrimitiveAndString {
    public static void main(String[] args) {

        //下面代码是错误的，5是一个整数，不能赋值给字符串。
        //String str1 = 5;

        //一个基本类型的值和字符串进行运算的时候，基本运算的值会主动转换为字符串
        String str2 = 3.5f + "";
        System.out.println(str2);

    }
}

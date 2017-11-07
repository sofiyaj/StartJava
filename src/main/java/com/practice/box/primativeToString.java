package com.practice.box;

public class primativeToString {
    public static void main(String[] args) {
        String insStr = "123";
        int it1 = Integer.parseInt(insStr);
        int it2 = new Integer(insStr);
        System.out.println(it2);

        String floatStr = "4.56";
        float ft1 = Float.parseFloat(floatStr);
        System.out.println(ft1);

        String ftStr = String.valueOf(2.34f);
        System.out.println(ftStr);

        String dbStr = String.valueOf(3.3332);
        System.out.println(dbStr);

        String boolStr = String.valueOf(true);
        System.out.println(boolStr);

        //将基本类型转化为字符串的简便方法
        String intStr = 5 + "";
        System.out.println(insStr);


    }
}

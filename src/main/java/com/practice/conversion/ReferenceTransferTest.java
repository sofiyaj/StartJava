package com.practice.conversion;

public class ReferenceTransferTest {
    public static void swap(DataWrap dw) {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("Swap方法里，a的成员变量的值是 " + dw.a + ",b的成员变量的值是 " + dw.b);
    }
        public static void main(String[] args){
            DataWrap dw = new DataWrap();
            dw.a = 6;
            dw.b = 9;
            swap(dw);
            System.out.println("交换结果后，a的成员变量的值是 " + dw.a + ",b的成员变量的值是 " + dw.b);


    }
}

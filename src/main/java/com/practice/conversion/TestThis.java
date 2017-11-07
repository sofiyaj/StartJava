package com.practice.conversion;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.net.SocketPermission;

public class TestThis {
    public int age;
    public TestThis grow(){
        age++;
        return this;
    }

    public static void main(String[] args) {
        TestThis tt = new TestThis();
        tt.grow()
          .grow().grow();
        System.out.println("tt的age成员变量值是：" + tt.age);

    }
}

package com.practice.polymorphism;

public class SubClass extends BaseClass {
    public String book = "重新定义的book变量";

    public void test(){
        System.out.println("子类的覆盖父类的方法！");
    }

    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);

        bc.base();
        bc.test();

        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base();
        sc.test();

        //下面编译时类型和运行类型不一样，多态发生
        BaseClass polymophicBc = new BaseClass();
        System.out.println(polymophicBc.book);
        polymophicBc.base();
        polymophicBc.test();

        //因为polymophicBc的编译类型为BaseClass，没有sub方法，所以下面代码编译时报错

        //polymophicBc.sub();

        //instanceof方法判断是否可以转化成功
        if(polymophicBc instanceof SubClass) {
            SubClass a = (SubClass) polymophicBc;
            a.sub();
        }
    }
}

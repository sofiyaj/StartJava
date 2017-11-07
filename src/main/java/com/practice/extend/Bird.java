package com.practice.extend;

import com.practice.polymorphism.BaseClass;

public class Bird extends Animal {
    private Animal a;
    public Bird(Animal a){
        this.a = a;
    }
    public void breath(){
        a.breath();
    }
    public void fly(){
        System.out.println("我在天空中自由飞翔···");
    }
}

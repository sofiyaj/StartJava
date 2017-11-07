package com.practice.extend;

public class Animal {
    private void beat(){
        System.out.println("心脏跳动···");
    }
    public void breath(){
        beat();
        System.out.println("吸一口气，呼一口气，呼吸中···");
    }
}

package com.practice.extend;

public class CompositionTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();

        Animal a2 = new Animal();
        Wolf w = new Wolf(a2);
        w.breath();
        w.run();

    }
}

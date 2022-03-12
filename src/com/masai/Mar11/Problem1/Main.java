package com.masai.Mar11.Problem1;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();

        for(Animal el:animals){
            el.eat();
            el.walk();
            el.makeNoise();
        }

    }
}

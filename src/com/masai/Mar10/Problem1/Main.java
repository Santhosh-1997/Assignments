package com.masai.Mar10.Problem1;

public class Main {

    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly();
       // b1.sing();
        Parrot p1 = (Parrot) b1;
        p1.sing();
    }
}

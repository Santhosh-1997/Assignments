package com.masai.Mar10.Problem2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static String reverseString(String given){

        int length = given.length();
        String reverse = "";
        char ch;
        for(int i=length-1; i>=0; i--){

            ch = given.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String");
        String originalString = input.next();

        String result = reverseString(originalString);
        System.out.println(result);
    }
}

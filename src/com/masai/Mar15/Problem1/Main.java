package com.masai.Mar15.Problem1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start of Main");

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter first number");
            int num1 = input.nextInt();

            System.out.println("Enter second number");
            int num2 = input.nextInt();

            int num3 = num1/num2;

            String message = "";

            message = checkGreater.check(num3);

            System.out.println("Message is " + message.toUpperCase(Locale.ROOT));


        }catch (InputMismatchException i1){
            System.out.println("Please enter valid number");
        }catch (ArithmeticException ae){
            System.out.println("Num2 should not be zero");
        }catch (StringValue e){
            //System.out.println("hi");
            System.out.println(e.getMessage());
        }


        System.out.println("End of Main");
    }

}

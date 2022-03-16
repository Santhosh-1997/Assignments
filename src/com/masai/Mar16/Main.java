package com.masai.Mar16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the joining date in the form of dd-mm-yyyy");
        Scanner input = new Scanner(System.in);
        String joiningDate = input.next();

        EmployeeBonus e1 = new EmployeeBonus();
        try {
            double bonus = e1.getBonus(joiningDate);
            System.out.println("Bonus is " + bonus);
        }catch (InvalidAgeException obj){
            System.out.println(obj.getMessage());
        }
    }


}

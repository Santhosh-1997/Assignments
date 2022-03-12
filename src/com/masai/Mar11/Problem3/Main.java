package com.masai.Mar11.Problem3;

import java.util.Scanner;

public class Main {

    public Hotel provideFood(int amount){

        if(amount>1000){
            return new TajHotel();
        }
        if(amount>200 && amount<1000){
            return new RoadSideHotel();
        }

        return null;
    }

    public static void main(String[] args) {

        Main obj = new Main();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount");
        int amount = input.nextInt();

        Hotel hotel = obj.provideFood(amount);

        if(hotel instanceof RoadSideHotel){
            hotel.chickenBriyani();
            hotel.masalaDosa();
        }

        if(hotel instanceof TajHotel){
            //((TajHotel) hotel).welcomeDrink();
            TajHotel tajHotel = (TajHotel) hotel;
            tajHotel.welcomeDrink();
            hotel.chickenBriyani();;
            hotel.masalaDosa();
        }

    }
}

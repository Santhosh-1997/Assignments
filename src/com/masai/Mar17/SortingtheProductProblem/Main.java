package com.masai.Mar17.SortingtheProductProblem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //ArrayList<Product> al = new ArrayList<>(new sortProductId());
        TreeSet<Product> al = new TreeSet<>(new sortProductId());
        int i=1;

        while(true){

            System.out.println("Enter the product " + i++ + " detail");

            System.out.println("Enter the productid");
            int productId = input.nextInt();

            System.out.println("Enter the productname");
            String pName = input.next();

            System.out.println("Entet the productPrice");
            double price = input.nextDouble();

            al.add(new Product(productId,pName,price));

            if(i==5)
                break;
        }

        System.out.println("Enter 1 to sort Price or 2 to sort Name or 3 to sort Id");
        int choice = input.nextInt();

        if(choice == 1){
            al = new TreeSet<>(new SortProductPrice());
        }else if(choice == 2){
            al = new TreeSet<>(new SortProductName());
        }

        for(Product el : al){
            System.out.println(el);
        }

    }
}

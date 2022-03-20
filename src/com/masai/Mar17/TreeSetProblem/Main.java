package com.masai.Mar17.TreeSetProblem;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TreeSet<Employee> ts = new TreeSet<>(new EmpSalaryComp());
        int i=1;

        while(true){

            System.out.println("Enter the details of employee "+i++);
            System.out.println("Enter Employee id");
            int empId = input.nextInt();

            System.out.println("Enter Employee name");
            String name = input.next();

            System.out.println("Enter Employee salary");
            double salary = input.nextDouble();

            ts.add(new Employee(empId,name,salary));

            if(i==5)
                break;

        }

        for(Employee el:ts){
            System.out.println(el);
        }

    }

}

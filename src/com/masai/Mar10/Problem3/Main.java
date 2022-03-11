package com.masai.Mar10.Problem3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Roll Number");
        int rollNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter the Name");
        String name = input.nextLine();


        System.out.println("Enter the marks");
        int marks = input.nextInt();

        //System.out.println(rollNumber+" "+name+" "+marks);
        Student s1 = new Student(rollNumber,name,marks);
        System.out.println(s1.getMarks());
        System.out.println(s1.getRollNumber());
        System.out.println(s1.getStudentName());
    }
}

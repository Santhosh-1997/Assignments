package com.masai.Mar22.MapStudentToEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(7,"Rajini",1000));
        studentList.add(new Student(2,"Kamal",900));
        studentList.add(new Student(3,"Vijay",795));
        studentList.add(new Student(4,"Ajith",550));
        studentList.add(new Student(5,"Surya",900));

        for(Student el : studentList){
            System.out.println(el);
        }
        System.out.println();

        List<Employee> employeeList = studentList
                .stream()
                .map(student -> new Employee(student.getRoll(), student.getName(),student.getMark()*1000))
                .collect(Collectors.toList());

        for(Employee el : employeeList){
            System.out.println(el);
        }
    }

}

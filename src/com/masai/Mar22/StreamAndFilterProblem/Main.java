package com.masai.Mar22.StreamAndFilterProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(7,"Rajini",1000));
        studentList.add(new Student(2,"Kamal",900));
        studentList.add(new Student(3,"Vijay",795));
        studentList.add(new Student(4,"Ajith",550));
        studentList.add(new Student(5,"Surya",900));

        List<Student> studentLessMark =  studentList
                .stream()
                .filter(student -> student.getMark()<800)
                .collect(Collectors.toList());

        for(Student el : studentLessMark){
            System.out.println(el);
        }

    }
}

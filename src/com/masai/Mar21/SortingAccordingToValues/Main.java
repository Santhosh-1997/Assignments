package com.masai.Mar21.SortingAccordingToValues;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String,Student> studentDetails = new HashMap<>();

        studentDetails.put("Chennai",new Student(7,"Dhoni",100));
        studentDetails.put("Bangalore",new Student(14,"Kohli",90));
        studentDetails.put("Jaipur",new Student(7,"Ashwin",80));
        studentDetails.put("Ahmedabad",new Student(7,"Hardik",40));

        Set<Map.Entry<String,Student>> set = studentDetails.entrySet();

        List<Map.Entry<String,Student>> list = new LinkedList<>(set);


        Collections.sort(list, new Comparator<Map.Entry<String, Student>>() {
            @Override
            public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
                Student s1 = o1.getValue();
                Student s2 = o2.getValue();

                return s1.getMark()>s2.getMark() ? +1 : -1;
            }
        });

        for(Map.Entry<String,Student> el : list){
            System.out.println(el.getKey());
            System.out.println(el.getValue());
        }







        /*Map<String,Student> sorted = new HashMap<>();
        for(Map.Entry<String,Student> el : list){
            sorted.put(el.getKey(),el.getValue());
        }
        System.out.println(sorted);


        Set <Map.Entry<String,Student>> finalSet = sorted.entrySet();
        for(Map.Entry<String,Student> el : finalSet){
            System.out.println(el.getKey());
            System.out.println(el.getValue());
        }*/

    }

}

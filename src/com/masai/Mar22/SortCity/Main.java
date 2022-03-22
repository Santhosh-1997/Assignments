package com.masai.Mar22.SortCity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Chennai");
        cities.add("Vellore");
        cities.add("Madurai");
        cities.add("Pondy");

        System.out.println(cities);

        Collections.sort(cities,(s1,s2)->s2.compareTo(s1));

        System.out.println(cities);

    }

}

package com.masai.Mar21.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,String> states = new LinkedHashMap<>();

        states.put("Tamil Nadu","Chennai");
        states.put("Karnataka","Banglore");
        states.put("Kerala","Thiruvananthapuram");
        states.put("Andhara Pradesh","Hyderabad");

        Set<Map.Entry<String,String>> statesSet =  states.entrySet();

        for(Map.Entry<String,String> el : statesSet){
            System.out.println(el.getKey() + " - " + el.getValue());
        }

    }
}

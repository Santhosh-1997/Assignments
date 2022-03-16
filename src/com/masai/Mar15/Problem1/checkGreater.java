package com.masai.Mar15.Problem1;

public class checkGreater {

    public static String check (int num) throws StringValue {
        if(num<10) {
            throw new StringValue("String Value is Null");
        }

        return "Welcome to Exception Handling";
    }
}

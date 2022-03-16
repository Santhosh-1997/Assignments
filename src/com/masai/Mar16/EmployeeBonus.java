package com.masai.Mar16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

public class EmployeeBonus {

    public double getBonus(String date) throws InvalidAgeException{

            boolean rightDate = date.matches("^\\d{2}-\\d{2}-\\d{4}");
            if(!rightDate)
                throw new InvalidAgeException("Please pass the date in correct format");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dateEnteredInFormat = LocalDate.parse(date, dtf);
            LocalDate today = LocalDate.now();

            long experience = ChronoUnit.MONTHS.between(dateEnteredInFormat,today);
            if(experience<0)
                throw new InvalidAgeException("Age should not be in Future");

           if(experience<=12){
               return 5000;
           }
           if(experience>12 && experience<=24){
               return 8000;
           }

        return 10000;

    }

}

package com.thoughtworks.practice;

public class Fizzbuzz {
    public String getFizzOrBuzz(String s) {
        int parsedNumber = Integer.parseInt(s);
        if (parsedNumber % 3 == 0) {
            return "fizz";
        }
        
        return "not fizzy or buzzy";
    }
}

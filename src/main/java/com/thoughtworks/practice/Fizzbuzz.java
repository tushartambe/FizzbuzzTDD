package com.thoughtworks.practice;

public class Fizzbuzz {
    public String getFizzOrBuzz(String s) {
        int parsedNumber = Integer.parseInt(s);
        if (parsedNumber % 3 == 0) {
            return "fizz";
        }

        if (parsedNumber % 5 == 0) {
            return "buzz";
        }
        
        return "not fizzy or buzzy";
    }
}

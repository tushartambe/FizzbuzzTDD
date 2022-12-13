package com.thoughtworks.practice;

public class Fizzbuzz {
    public String getFizzOrBuzz(String s) {
        int parsedNumber;
        try {
            parsedNumber = Integer.parseInt(s);
        } catch (Exception e) {
            return s;
        }

        String result = "";
        if (parsedNumber % 3 == 0) {
            result += "fizz";
        }

        if (parsedNumber % 5 == 0) {
            result += "buzz";
        }

        if (result.isEmpty()) {
            return "not fizzy or buzzy";
        }

        return result;
    }
}

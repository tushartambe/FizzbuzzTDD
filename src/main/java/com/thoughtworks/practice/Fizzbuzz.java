package com.thoughtworks.practice;

public class Fizzbuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String NOT_FIZZY_OR_BUZZY = "not fizzy or buzzy";

    public String getFizzOrBuzz(String s) {
        int parsedNumber;
        try {
            parsedNumber = Integer.parseInt(s);
        } catch (Exception e) {
            return s;
        }

        var result = getFizzOrBuzz(parsedNumber);

        if (result.isEmpty()) {
            return NOT_FIZZY_OR_BUZZY;
        }

        return result;
    }

    private String getFizzOrBuzz(int parsedNumber) {
        var result = "";
        if (parsedNumber % 3 == 0) {
            result += FIZZ;
        }

        if (parsedNumber % 5 == 0) {
            result += BUZZ;
        }
        return result;
    }
}

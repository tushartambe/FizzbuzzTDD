package com.thoughtworks.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    private Fizzbuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    void shouldReturnFizzForNumberDivisibleBy3() {
        String expected = "fizz";
        String actual = fizzbuzz.getFizzOrBuzz("3");

        assertEquals(expected, actual);
    }
}
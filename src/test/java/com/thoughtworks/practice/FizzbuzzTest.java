package com.thoughtworks.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {
    private Fizzbuzz fizzbuzz;

    @BeforeEach
    void setUp() {
        fizzbuzz = new Fizzbuzz();
    }

    @ParameterizedTest
    @ValueSource(strings = {"3", "9"})
    void shouldReturnFizzForNumberDivisibleBy3(String input) {
        String expected = "fizz";
        String actual = fizzbuzz.getFizzOrBuzz(input);

        assertEquals(expected, actual);
    }
}
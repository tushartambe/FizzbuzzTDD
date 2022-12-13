package com.thoughtworks.practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @ParameterizedTest
    @ValueSource(strings = {"5", "10"})
    void shouldReturnBuzzForNumberDivisibleBy5(String input) {
        String expected = "buzz";
        String actual = fizzbuzz.getFizzOrBuzz(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"15", "30"})
    void shouldReturnFizzBuzzForNumberDivisibleBy3And5(String input) {
        String expected = "fizzbuzz";
        String actual = fizzbuzz.getFizzOrBuzz(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"7", "13", "11"})
    void shouldReturnNotFizzyOrBuzzyForNumberNotDivisibleBy3Or5(String input) {
        String expected = "not fizzy or buzzy";
        String actual = fizzbuzz.getFizzOrBuzz(input);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    void shouldReturnInputIfNotANumber(String input) {
        String actual = fizzbuzz.getFizzOrBuzz(input);

        assertEquals(input, actual);
    }
}
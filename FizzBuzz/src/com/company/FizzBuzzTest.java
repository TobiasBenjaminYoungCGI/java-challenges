package com.company;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @org.junit.jupiter.api.Test
    void isMultipleOf3() {
        assertTrue(fizzBuzz.isBuzz(3));
        assertFalse(fizzBuzz.isBuzz(4));

    }

    @org.junit.jupiter.api.Test
    void isMultipleOf5() {
        assertTrue(fizzBuzz.isFizz(5));
        assertFalse(fizzBuzz.isFizz(6));
    }E
}
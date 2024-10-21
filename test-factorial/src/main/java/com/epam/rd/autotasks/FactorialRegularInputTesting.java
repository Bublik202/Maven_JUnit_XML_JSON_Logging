package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testFactorialOfZero() {
        assertEquals("1", factorial.factorial("0"));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals("1", factorial.factorial("1"));
    }

    @Test
    void testFactorialOfTwo() {
        assertEquals("2", factorial.factorial("2"));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals("120", factorial.factorial("5"));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals("3628800", factorial.factorial("10"));
    }

    @Test
    void testFactorialOfThirteen() {
        assertEquals("6227020800", factorial.factorial("13"));
    }

    @Test
    void testFactorialOfTwenty() {
        assertEquals("2432902008176640000", factorial.factorial("20"));
    }
}
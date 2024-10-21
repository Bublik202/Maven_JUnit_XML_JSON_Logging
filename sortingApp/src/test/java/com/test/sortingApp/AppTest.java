package com.test.sortingApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Unit tests for the {@link Sorter} class.
 */
@RunWith(Parameterized.class)
public class AppTest {
    private Sorter sorter = new Sorter();
    private int[] input;
    private int[] expected;

    /**
     * Constructor for parameterized tests.
     *
     * @param input the input array
     * @param expected the expected sorted array
     */
    public AppTest(int[] input, int[] expected) {
        this.input = input;
        this.expected = expected;
    }

    /**
     * Provides test data for parameterized tests.
     *
     * @return a collection of test data
     */
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Пустой массив
                {new int[]{}, new int[]{}},
                // Массив из одного элемента
                {new int[]{1}, new int[]{1}},
                // Массив из трех элементов
                {new int[]{3, 2, 1}, new int[]{1, 2, 3}},
                // Массив из пяти элементов
                {new int[]{9, 7, 5, 3, 1}, new int[]{1, 3, 5, 7, 9}},
                // Массив из десяти элементов
                {new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                // Массив с более чем десятью элементами
                {new int[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}}
        });
    }

    @Test
    public void testSort() {
        sorter.sort(input);
        assertArrayEquals(expected, input);
    }
}
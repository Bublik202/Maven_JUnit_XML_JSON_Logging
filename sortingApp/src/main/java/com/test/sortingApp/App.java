package com.test.sortingApp;

import java.util.Arrays;

/**
 * Main application class.
 */
public class App {
	
	/**
     * Default constructor.
     */
    public App() {
        // Default constructor
    }


    /**
     * Main method that runs the application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 9, 1};
        sorter(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Sorts the given array.
     * 
     * @param array the array to be sorted
     */
    public static void sorter(int[] array) {
        Arrays.sort(array);
    }
}
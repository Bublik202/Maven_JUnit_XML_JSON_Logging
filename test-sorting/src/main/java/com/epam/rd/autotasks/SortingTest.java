package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.Assert;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
    	sorting.sort(null); 
    	
    }

    @Test//(expected = ArrayIndexOutOfBoundsException.class)
    public void testEmptyCase(){
    	int[] array = {}; 
    	sorting.sort(array);	
    	Assert.assertArrayEquals(new int[] {}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
    	int[] array = {5};
    	sorting.sort(array);
    	Assert.assertArrayEquals(new int[] {5}, array);
    }

    @Test
    public void testSortedArraysCase() {
    	int[] array = {1,2,3,4,5};
    	sorting.sort(array);
    	Assert.assertArrayEquals(new int[] {1,2,3,4,5}, array);
    }

    @Test
    public void testOtherCases() {
    	int[] array = {5,4,3,2,1};
    	sorting.sort(array);
    	Assert.assertArrayEquals(new int[] {1,2,3,4,5}, array);

    }

}
package com.epam.rd.autotasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    
    private double a;
    private double b;
    private double c;
    private String expected;
    
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}
    
    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {
    		{1, 2, -3, "1.0 -3.0"},
    		{2, -5, -3, "3.0 -0.5"},
    		{2, -7, 3, "3.0 0.5"},
    		{4, 0, -16, "2.0 -2.0"}
    	});
    }
    
    @Test
    public void testTwoRootsCases() {
    	String vals = quadraticEquation.solve(a, b, c);
    	if(!vals.contains(" ") || vals == "no roots") {
    		throw new AssertionError();
    	}
    	
    	String[] array = vals.split(" ");
    	assertTrue(expected.contains(array[0]));
    	assertTrue(expected.contains(array[1]));
	}   

}

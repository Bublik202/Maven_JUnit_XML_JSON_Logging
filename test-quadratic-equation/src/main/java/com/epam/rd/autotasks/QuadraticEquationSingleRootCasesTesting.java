package com.epam.rd.autotasks;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    
    private double a;
    private double b;
    private double c;
    private double expected;
    
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.expected = expected;
	}

	@Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {
    		{1, 0, 0, -0.0},    
            {1, -2, 1, 1.0},    
            {1, 2, 1, -1.0},    
            {4, -8, 4, 1.0}     
    	});
    }
    
    @Test
    public void testSingleRootCases() {
		assertEquals(String.valueOf(expected), quadraticEquation.solve(a, b, c));
	}
    
    @BeforeClass
    public static void setUp() {
    	Locale.setDefault(Locale.ENGLISH);
    }
    
	
}
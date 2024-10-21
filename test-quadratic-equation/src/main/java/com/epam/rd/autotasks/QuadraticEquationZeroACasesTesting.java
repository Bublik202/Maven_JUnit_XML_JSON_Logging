package com.epam.rd.autotasks;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    
    private double a;
    private double b;
    private double c;
    
    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
    	super();
		this.a = a;
		this.b = b;
		this.c = c;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
    	return Arrays.asList(new Object[][] {
    		{0, 1, 2},
            {0, -3, 5},
            {0, 0, 1},
            {0, 0, 0}
    	});
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ZeroACases() {
    	quadraticEquation.solve(a, b, c);
    }


}

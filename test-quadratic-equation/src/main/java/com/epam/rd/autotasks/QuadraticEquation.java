package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {   	  		
    	if(a == 0) {
        	throw new IllegalArgumentException();
        }
		
		final Double D = b * b - 4 * a * c;
		if(D > 0) {
			double x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = (-b - Math.sqrt(D)) / (2 * a);			
			return String.format("%.1f %.1f", x1, x2);						
		}
		if(D == 0) {
			double root = -b / (2 * a);
			return String.format("%.1f", root);
		}			 					        
		return "no roots";
    }
}
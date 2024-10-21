package com.epam.rd.autotasks;

import java.math.BigInteger;

public class Factorial {
    public String factorial(String n) {        
        if(n == null) {
        	throw new IllegalArgumentException();
        }
        
        if (!n.matches("\\d+")) {
            throw new IllegalArgumentException();
        }
        
        long val = 0;
        try {
			val = Integer.valueOf(n);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException();
		}
        
        if(val < 0) {
        	throw new IllegalArgumentException();
        }
        	
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= val; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result.toString();
    }
}

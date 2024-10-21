package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
    	Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial(null));
    }

    @Test
    void testNegativeInput(){    	
    	Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial("-1"));
    }

    @Test
    void testFractionalInput(){
    	Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial("3.5"));
    }

    @Test
    void testNonDigitalInput(){
    	Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial("abc"));
    }


}

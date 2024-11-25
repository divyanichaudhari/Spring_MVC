package org.sample.Testing1;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Calculatortest {
    private final Calculator calculator = new Calculator(); 

	
	 @Test
	    public void testAdd() {
	        assertEquals(5, calculator.add(2, 3)); 
	        assertEquals(0, calculator.add(2, -1));
	        assertEquals(4, calculator.add(2, 21));
	        assertNotEquals(5, calculator.add(2, 2));
	        assertTrue(calculator.add(2, 3) > 0);
	        assertFalse(calculator.add(6, 9) >=0);
	        
	    }
	    
	    @Test
	    public void testSub() {
	        assertEquals(1, calculator.sub(3, 2));
	        assertEquals(-1, calculator.sub(2, 3));
	        assertNotNull("not null", calculator);
	        
	        assertThrows(ArithmeticException.class, () -> {
	            calculator.div(1, 0);
	        });
	    }

	    @Test
	    public void testMul() {
	        assertEquals(6, calculator.mul(2, 3));
	        assertEquals(0, calculator.mul(2, 0));
	    }

	    @Test
	    public void testDiv() {
	        assertEquals(2.0, calculator.div(4, 2));
	        assertDoesNotThrow(() -> calculator.add(1, 1));

	    }

	    @Test
	    public void testDivByZero() {
	        Exception exception = assertThrows(ArithmeticException.class, () -> {
	            calculator.div(1, 0);
	            fail("It is an divide by zero error");
	        });
	        assertEquals("/ by zero", exception.getMessage());
	    }

	    @Nested
	    class SubtractionTests {
	        @Test
	        void testSubtractPositiveNumbers() {
	            assertEquals(1, calculator.sub(3, 2));
	        }

	        @Test
	        void testSubtractNegativeNumbers() {
	            assertEquals(1, calculator.sub(-2, -3));
	        }

	        @Test
	        void testSubtractMixedNumbers() {
	            assertEquals(-5, calculator.sub(-2, 3));
	        }
	    }

}

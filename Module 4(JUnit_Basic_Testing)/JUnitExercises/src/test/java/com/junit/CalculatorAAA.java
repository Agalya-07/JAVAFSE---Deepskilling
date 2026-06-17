package com.junit;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorAAA {
    Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup done");
    }
    @After
    public void tearDown() {
        calc = null;
        System.out.println("Cleanup done");
    }
    @Test
    public void testAdd() {
        int a = 4;
        int b = 6;
        int result = calc.add(a, b);
        assertEquals(10, result);
    }
    @Test
    public void testSubtract() {
        int a = 10;
        int b = 5;
        int result = calc.subtract(a, b);
        assertEquals(5, result);
    }
}
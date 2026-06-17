package com.example;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorAAA {
    Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup Executed");
    }
    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown Executed");
    }
    @Test
    public void testAdd() {
        int a = 4;
        int b = 6;
        int result = calc.add(a, b);
        assertEquals(10, result);
    }
}
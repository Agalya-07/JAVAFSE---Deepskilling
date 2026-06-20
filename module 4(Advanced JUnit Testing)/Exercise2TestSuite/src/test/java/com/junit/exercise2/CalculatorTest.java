package com.junit.exercise2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }
}
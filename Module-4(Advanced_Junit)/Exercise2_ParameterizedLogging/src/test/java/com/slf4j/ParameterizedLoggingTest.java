package com.slf4j;
import org.junit.Test;
import static org.junit.Assert.*;
public class ParameterizedLoggingTest {
    @Test
    public void testLoggingClassExists() {
        ParameterizedLoggingExample example =
                new ParameterizedLoggingExample();
        assertNotNull(example);
    }
    @Test
    public void testSimpleMath() {
        int a = 10;
        int b = 20;
        int result = a + b;
        assertEquals(30, result);
    }
}
package com.junit.exercise2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class StringTest {
    @Test
    void testLength() {
        assertEquals(5, "Hello".length());
    }
}
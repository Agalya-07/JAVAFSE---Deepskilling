package com.slf4j;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoggingWithAppendersTest {

    @Test
    public void testLoggerObjectCreation() {

        LoggingWithAppenders obj =
                new LoggingWithAppenders();

        assertNotNull(obj);
    }

    @Test
    public void testMainMethodExecution() {

        try {
            LoggingWithAppenders.main(null);
            assertTrue(true);
        } catch (Exception e) {
            fail("Execution failed: " + e.getMessage());
        }
    }
}
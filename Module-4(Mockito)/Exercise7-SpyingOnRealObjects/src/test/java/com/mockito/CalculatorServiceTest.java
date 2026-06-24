package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorServiceTest {

    @Test
    public void testSpyObject() {

        Calculator realCalculator = new Calculator();

        Calculator spyCalculator = Mockito.spy(realCalculator);

        CalculatorService service =
                new CalculatorService(spyCalculator);

        int result = service.performAddition(10, 20);

        assertEquals(30, result);

        Mockito.verify(spyCalculator).add(10, 20);
    }
}
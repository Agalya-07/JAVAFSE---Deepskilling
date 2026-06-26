package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class StockAnalyzerTest {

    @Test
    public void testMultipleReturnValues() {

        StockService mockService = mock(StockService.class);

        when(mockService.getStockPrice())
                .thenReturn(100)
                .thenReturn(150)
                .thenReturn(200);

        StockAnalyzer analyzer = new StockAnalyzer(mockService);

        assertEquals(100, analyzer.getLatestPrice());
        assertEquals(150, analyzer.getLatestPrice());
        assertEquals(200, analyzer.getLatestPrice());
    }

}
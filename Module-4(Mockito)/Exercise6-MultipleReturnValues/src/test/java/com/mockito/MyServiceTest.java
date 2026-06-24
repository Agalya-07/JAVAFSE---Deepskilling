package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testMultipleReturnValues() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call");

        MyService service = new MyService(mockApi);

        assertEquals("First Call", service.fetchData());
        assertEquals("Second Call", service.fetchData());
    }
}
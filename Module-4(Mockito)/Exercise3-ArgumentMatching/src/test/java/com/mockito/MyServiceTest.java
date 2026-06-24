package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData(anyString()))
                .thenReturn("Mock Data");

        MyService service = new MyService(mockApi);

        String result = service.fetchData("Books");

        assertEquals("Mock Data", result);
    }
}
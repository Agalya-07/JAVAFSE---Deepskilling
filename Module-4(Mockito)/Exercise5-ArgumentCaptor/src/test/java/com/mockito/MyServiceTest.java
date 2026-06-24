package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class MyServiceTest {

    @Test
    public void testArgumentCaptor() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData("Mockito Test");

        ArgumentCaptor<String> captor =
                ArgumentCaptor.forClass(String.class);

        verify(mockApi).sendData(captor.capture());

        assertEquals("Mockito Test", captor.getValue());
    }
}
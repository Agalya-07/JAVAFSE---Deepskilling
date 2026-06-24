package com.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.processData("Hello Mockito");

        verify(mockApi).sendData("Hello Mockito");
    }
}
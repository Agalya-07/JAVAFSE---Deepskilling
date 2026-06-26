package com.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class NetworkServiceTest {

    @Test
    public void testNetworkConnection() {

        NetworkClient mockClient = mock(NetworkClient.class);

        when(mockClient.connect()).thenReturn("Mock Server");

        NetworkService service = new NetworkService(mockClient);

        String result = service.connectToServer();

        assertEquals("Connected to Mock Server", result);
    }
}
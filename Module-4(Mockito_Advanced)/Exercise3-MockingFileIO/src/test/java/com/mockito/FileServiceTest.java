package com.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class FileServiceTest {

    @Test
    public void testFileProcessing() {

        FileReader mockReader = mock(FileReader.class);

        FileWriter mockWriter = mock(FileWriter.class);

        when(mockReader.read()).thenReturn("hello");

        FileService service = new FileService(mockReader, mockWriter);

        service.processFile();

        verify(mockWriter).write("HELLO");

    }

}
package com.mockito;

public class FileService {

    private FileReader fileReader;
    private FileWriter fileWriter;

    public FileService(FileReader fileReader, FileWriter fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public void processFile() {

        String data = fileReader.read();

        fileWriter.write(data.toUpperCase());

    }

}
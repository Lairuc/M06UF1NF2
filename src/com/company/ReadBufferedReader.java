package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadBufferedReader {
    public ReadBufferedReader() throws Exception {
        String line = "";
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("treballadors.txt")));
        while ( (line = inputStream.readLine()) != null) {
            System.out.println(line);
        }
        inputStream.close();
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CharsFileReader {
    public CharsFileReader() throws Exception {
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("alphabeta.txt")));
        //String line = "";
        int c = inputStream.read();

        while ( c != -1 ) {
            System.out.println( (char) c );
            c = inputStream.read();
        }
        inputStream.close();
    }
}

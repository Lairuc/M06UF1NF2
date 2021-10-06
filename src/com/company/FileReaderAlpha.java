package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Locale;

public class FileReaderAlpha {
    public FileReaderAlpha() throws Exception {
        String line = "";
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("treballadors.txt")));
        while ( (line = inputStream.readLine()) != null) {

            for (int i=0; i<line.length(); i++) {
                System.out.print( line.toUpperCase().charAt(i) + " " );
            }
            //System.out.println(line);
        }
        inputStream.close();
    }
}

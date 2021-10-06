package com.company;

import java.io.File;
import java.io.PrintWriter;

public class CharsToFile1 {

    public CharsToFile1() throws Exception {
        File fitxer = new File("alphabeta.txt");
        PrintWriter pwInput = new PrintWriter(fitxer);

        for (char a = 'a'; a <= 'z' ; a++) {
            pwInput.println(a);
        }
        pwInput.close();
        System.out.println("FET!");
    }
}

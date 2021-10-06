package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NumsToFile1 {

    public NumsToFile1() throws FileNotFoundException {
        File fitxer = new File("Nums11001200.txt");
        PrintWriter pwInput = new PrintWriter(fitxer);

        for (int i = 1100; i <= 1200 ; i++) {
            pwInput.println(i);
        }
        pwInput.close();
        System.out.println("FET!");
    }
}

package com.company;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class CharsFileToScreen1 {

    public CharsFileToScreen1() throws Exception {
        File fitxer = new File("alphabeta.txt");
        Scanner scan = new Scanner(fitxer);

        while (scan.hasNext()) {
            System.out.print( scan.nextLine().toUpperCase() + " ");
        }
        scan.close();
    }
}

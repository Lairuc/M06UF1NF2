package com.company;

import java.io.*;

public class ComptaVocals {
    //public ComptaVocals() {}
    public ComptaVocals(String rutaIn, String rutaOut) throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(new File(rutaIn)));
        BufferedWriter outputStream= new BufferedWriter(new FileWriter(new File(rutaOut)));

        int[] occurVocals = {0,0,0,0,0};
        outputStream.write("a,e,i,o,u\n");
        String line;
        //char c;
        while ((line = inputStream.readLine()) != null ) {
            for (int i=0; i<line.length(); i++) {
                switch (line.charAt(i)) {
                    case 'a':
                        occurVocals[0]++;
                        break;
                    case 'e':
                        occurVocals[1]++;
                        break;
                    case 'i':
                        occurVocals[2]++;
                        break;
                    case 'o':
                        occurVocals[3]++;
                        break;
                    case 'u':
                        occurVocals[4]++;
                        break;
                } // end switch
            } // end for

            for (int n: occurVocals) {
                outputStream.write(n+",");
            }
            outputStream.write("\n");
            //outputStream.write(occurVocals.toString());

        } // end while
        outputStream.close();
        inputStream.close();
    }
}

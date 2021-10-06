package com.company;

import java.io.*;

public class CopyArrayToFile {

    void desarDades( String[] paraules, String ruta ) throws IOException {
        BufferedWriter outputStream = new BufferedWriter(new FileWriter(new File(ruta)));
        for(String paraula : paraules) {
            outputStream.write(paraula+"\n");
        }
        outputStream.close();
    }
    void mostrarDades(String ruta) throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(new File(ruta)));
        String line;
        while ( (line = inputStream.readLine()) != null) {
            System.out.println(line);
        }
        inputStream.close();
    }
}

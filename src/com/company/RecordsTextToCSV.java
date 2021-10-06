package com.company;

import java.io.*;

public class RecordsTextToCSV {

    //public RecordsTextToCSV() {}
    //String[][] dades;

    public static String[][] llegirFitxer(String rutaIn) throws IOException {
        String[][] dades = new String[99][3];
        String line;
        int regIndex=0, dataIndex=0;
        BufferedReader inputStream = new BufferedReader(new FileReader(new File(rutaIn)));
        while ( (line = inputStream.readLine()) != null ) {
            if (line != "***") {
                dades[regIndex][dataIndex] = line;
                dataIndex++;
            } else {
                regIndex++;
                dataIndex=0;
            }
        }
        return dades;
    }
    public void mostraPerPantalla() {}
    public void escriuSortidaCSV(String rutaOut) {}
}

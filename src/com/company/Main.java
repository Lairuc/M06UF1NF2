package com.company;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws Exception {
        //NumsToFile1 ntf1 = new NumsToFile1();
        //CharsToFile1 ctf1 = new CharsToFile1();
        //CharsFileToScreen1 cfts1 = new CharsFileToScreen1();
        //TreballadorToFile1 ttf1 = new TreballadorToFile1();
        //TreballadorsToScreen1 tts1 = new TreballadorsToScreen1();
        //ReadBufferedReader rbr = new ReadBufferedReader();
        //FileReaderAlpha fra = new FileReaderAlpha();
        //CharsFileReader cfr = new CharsFileReader();

        /*String[] params = new String[2];
        params[0] = "treballadors.txt";
        params[1] = "alphabeta.txt";
        CopyFilesFRFW cfrfw = new CopyFilesFRFW( params );

        // Copy Array to File
        CopyArrayToFile catf = new CopyArrayToFile();
        String[] paraules = {"hola", "adeu", "goodbye", "hastaluegín", "chao"};
        catf.desarDades(paraules, "noufitcher.txt");
        catf.mostrarDades("noufitcher.txt");


        // Compta Vocals
        ComptaVocals covo = new ComptaVocals("treballadors.txt", "nouFitxerComptaVocals02.txt");


        // RecordsTextToCSV
        String[][] dades = RecordsTextToCSV.llegirFitxer("registres.txt");
        dades.toString();


        // File Types
        FileTypes.writeData("tipusDeDades.txt");


        // e17 - Object Stream Example
        ObjectStreamExample ose = new ObjectStreamExample();
        ose.introDades();
        //sleep(1000);
        ArrayList<Persona> persons = ose.mostraDades();
        System.out.println( persons.toString() );


        // RandomAccessFile - Canvi de Lletra
        CanviLletra.canvi("registres.txt", 'e');
         */

        // RAF - intro dades
        RAFdata.introDades();
        RAFdata.afegirRegistre(7, "De Gea", 10, 1300.0);
        RAFdata.llegirDades();
    }
}

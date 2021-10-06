package com.company;

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
         */

        // RecordsTextToCSV
        String[][] dades = RecordsTextToCSV.llegirFitxer("registres.txt");
        dades.toString();
    }
}

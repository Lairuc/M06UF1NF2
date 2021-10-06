package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TreballadorToFile1 {
    public TreballadorToFile1() throws Exception {
        File fitxer = new File("treballadors.txt");
        PrintWriter pwInput = new PrintWriter(fitxer);
        Scanner scan = new Scanner(System.in);
        String seguim = "Y";
        String nom="", cognom = "";
        int salari = 0;
        boolean casat;

        while (seguim.equals("Y")) {
            System.out.println("Introdueix el NOM del treballador:");
            nom = scan.nextLine();
            System.out.println("Introdueix el COGNOM del treballador:");
            cognom = scan.nextLine();
            System.out.println("Introdueix el SALARI del treballador:");
            salari = scan.nextInt();
            System.out.println("El treballador està casat? true/false");
            casat = scan.nextBoolean();
            scan.nextLine();
            pwInput.println(nom +","+cognom+","+salari+","+casat);

            System.out.println("Vols introduïr dades d'un treballador?  Y/N");
            seguim=scan.nextLine();
        }
        pwInput.close();
        //System.out.println("SORTIDA!! " + nom + " " + cognom + "");
    }
}

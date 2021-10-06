package com.company;

import java.io.File;
import java.util.Scanner;

public class TreballadorsToScreen1 {
    String treballador;
    String[] dadesTreballador;
    int conta = 1;

    public TreballadorsToScreen1() throws Exception {
        File fitxer = new File("treballadors.txt");
        Scanner scan = new Scanner(fitxer);

        while (scan.hasNext()) {
            treballador = scan.nextLine();
            dadesTreballador = treballador.split(",");
            System.out.println("TREBALLADOR " + conta);
            for (String x: dadesTreballador) {
                System.out.println(x);
            }
            conta++;
        }
        scan.close();
    }
}

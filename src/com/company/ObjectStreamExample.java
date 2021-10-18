package com.company;

import java.io.*;
import java.util.ArrayList;

public class ObjectStreamExample {

    public void introDades() throws IOException {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("object.data"));

        Persona p1 = new Persona("Antonio Chanco", 23, false);
        Persona p2 = new Persona("Antonia Chanca", 55, true);
        Persona p3 = new Persona("John Doe", 99, true);
        Persona p4 = new Persona("Joseba Iriazabal", 41, false);

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);
        oos.writeObject(p4);
        oos.close();
    }

    public ArrayList<Persona> mostraDades() throws IOException, ClassNotFoundException {
        ArrayList<Persona> persones = new ArrayList<>();

        Persona p;
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream("object.data"));
        while (( p = (Persona) ois.readObject() ) != null ) {
            persones.add(p);
        }
        System.out.println( "DINS: " + persones.toString() );
        return persones;
    }
}

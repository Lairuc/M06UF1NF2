package com.company;

import java.io.*;

public class FileTypes {

    public static void writeData(String ruta) throws IOException {
        int a = 3;
        boolean b = true;
        char c = 'c';
        double d = 22.222;
        float f = 3.f;
        String s = "stRIng";

        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(new File(ruta)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        dos.writeInt(a);
        dos.writeBoolean(b);
        dos.writeChar(c);
        dos.writeDouble(d);
        dos.writeFloat(f);
        dos.writeChars(s);

        dos.close();
    }
}

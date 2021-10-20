package com.company;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CanviLletra {

    public static void canvi(String path, char c) {
        char a;
        boolean eof = false;
        RandomAccessFile file = null;

        try {
            file = new RandomAccessFile(path, "rw");
            while (!eof) {
                try {
                    a = (char) file.readByte();
                    if (a == c) {
                        file.seek(file.getFilePointer() - 1);
                        file.writeByte(Character.toUpperCase(a));
                    }
                } catch (EOFException e) {
                    System.out.println("Hem acabat de llegir tots els bytes!");
                    eof = true;
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File Not Found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("ERROR: I/O Exception");
            e.printStackTrace();
        }
    }
}

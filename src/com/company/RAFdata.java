package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFdata {

    public static void introDades() {
        try (RandomAccessFile file = new RandomAccessFile("RAFTreballadors3", "rw")) {
            String cognoms[] = {"Álava", "Minguito", "Zarathustra", "Peche"};
            int depts[] = {10, 21, 10, 60};
            Double sou[] = {1200.0, 2500.0, 975.50, 1850.25};
            StringBuffer buff = null;

            for (int i = 0; i < cognoms.length; i++) {
                file.writeInt(i+1);
                buff = new StringBuffer( cognoms[i] );
                buff.setLength(10);
                file.writeChars(buff.toString());
                file.writeInt(depts[i]);
                file.writeDouble(sou[i]);
            }
            //file.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void afegirRegistre(int id, String cognom, int dpt, double sou) {
        try (RandomAccessFile file = new RandomAccessFile("RAFTreballadors3", "rw")) {
            StringBuffer buff = new StringBuffer(cognom);
            buff.setLength(10);
            file.seek((id-1) *36);
            file.writeInt(id);
            file.writeChars(buff.toString());
            file.writeInt(dpt);
            file.writeDouble(sou);
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void llegirDades() {
        boolean eof = false;
        int id, dpt;
        char[] cognom = new char[10];
        double sou;

        try (RandomAccessFile file = new RandomAccessFile("RAFTreballadors3", "rw")) {
            while (!eof) {
                id = file.readInt();
                for (int i = 0; i < cognom.length; i++) {
                    cognom[i]=file.readChar();
                }
                dpt = file.readInt();
                sou = file.readDouble();
                System.out.println("ID: "+id + " | COGNOM: " + cognom.toString() + " | DPT: " + dpt + " | Sou: " + sou);

                if ( file.getFilePointer() == file.length() ) {eof=true;}
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

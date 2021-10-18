package com.company;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nom;
    private int edat;
    private boolean casat;

    public Persona() {}

    public Persona(String nom, int edat, boolean casat) {
        this.nom = nom;
        this.edat = edat;
        this.casat = casat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public boolean isCasat() {
        return casat;
    }

    public void setCasat(boolean casat) {
        this.casat = casat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", casat=" + casat +
                '}';
    }

}

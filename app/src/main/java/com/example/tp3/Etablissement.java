package com.example.tp3;


public class Etablissement {

    private String label;
    private String name;
    private int imag;

    //Le constructeur
    public Etablissement(String label, String name, int img){
        this.label= label;
        this.name= name;
        this.imag=img;
    }

    public String getLabel() {
        return label;
    }

    public int getImage() {
        return imag;
    }

    public String getName() {
        return name;
    }
}

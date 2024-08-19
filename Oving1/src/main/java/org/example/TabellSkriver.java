package org.example;

public class TabellSkriver {

    public void skrivUtTallene(int[] tabell, Tallformat format){

        for(int tall : tabell){
            System.out.println(format.somStreng(tall));

        }
    }
}

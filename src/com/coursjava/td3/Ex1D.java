package com.coursjava.td3;

public class Ex1D {
    public static void main (String [] args){

        int h1 = Integer.parseInt(args[0]);
        int m1 = Integer.parseInt(args[1]);
        int h2 = Integer.parseInt(args[2]);
        int m2 = Integer.parseInt(args[3]);
        int duree;
        duree= calculerDuree(h1, m1, h2,m2);
        if (duree < 0)
            System.out.println("Erreur ");
        else
            System.out.println("La durée de l'activité est: " + duree);
    }

    static int calculerDuree(int h1, int m1, int  h2, int m2){
        final int MINUTE = 60;
        int d1, d2;
        d1= h1*MINUTE + m1;
        d2= h2*MINUTE + m2;
        return d2-d1;
    }
}

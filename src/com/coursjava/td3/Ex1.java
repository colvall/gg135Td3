package com.coursjava.td3;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex1 {
    public static void main (String [] args){

        int h1, h2, m1, m2;
        int duree;
        String activite;
        Scanner entree =new Scanner(System.in);

        System.out.print(" Entrer l'heure de début en heures et minutes : ");
        h1 = entree.nextInt();
        m1 = entree.nextInt();
       // entree.nextLine();

        System.out.print("Entrer l'heure de fin en heures et minutes : ");
        h2 = entree.nextInt();
        m2 = entree.nextInt();
        //entree.nextLine();

        //System.out.print(" Entrer le nom de l'activité : ");
        //activite = entree.nextLine();
        entree.close();
        duree= calculerDuree(h1, m1, h2,m2);
        if (duree < 0)
            System.out.println("Erreur ");
        else
            System.out.println("La durée de l'activité  est: " + duree +"mn");
    }
     static int calculerDuree(int h1, int m1, int  h2, int m2){
        final int MINUTE = 60;
        int d1, d2;
        d1= h1*MINUTE + m1;
        d2= h2*MINUTE + m2;
        return d2-d1;
    }
}

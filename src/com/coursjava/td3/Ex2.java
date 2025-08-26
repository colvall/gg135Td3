package com.coursjava.td3;

import java.util.Scanner;

public class Ex2 {
    public static void main (String [] arg){

        int d, f;
        Scanner entree =   new Scanner(System.in);
        System.out.println("Entrer l'année de début et l'année de fin de l'intervalle");
        d = entree.nextInt();
        f = entree.nextInt();

        entree.close();
        int nbAnneeBisxtile;
        nbAnneeBisxtile= calculertBisextile(d, f);
        System.out.println("Le nombre d'années bisextiles dans cet intervalle est: "+nbAnneeBisxtile);
    }

     static int calculertBisextile(int debut, int fin){
        int nb=0;
        for (int i=debut; i<= fin; i++){
            if (estBisextile(i)) nb++;
        }
        return nb;
    }
     static boolean estBisextile(int annee){
        final int C1= 4;
        final int C2= 100;
        final int C3= 400;

        if (((annee % C1 ==0) && (annee %C2!=0)) || (annee %C3==0))
            return true;
        else
            return false;
    }
}

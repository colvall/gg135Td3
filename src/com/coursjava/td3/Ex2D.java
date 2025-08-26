package com.coursjava.td3;

public class Ex2D {
    public static void main (String [] args){

        int d = Integer.parseInt(args[0]);
        int f = Integer.parseInt(args[1]);
        int nbAnneeBisxtile;
        nbAnneeBisxtile= calculertBisextile(d, f);
        System.out.println("Le nombre d'années bisextiles dans cet intervalle est: "+nbAnneeBisxtile);
    }
    public static int calculertBisextile(int debut, int fin){
        int nb=0;
        for (int i=debut; i<= fin; i++){
            if (estBisextile(i)) nb++;
        }
        return nb;
    }
    public static boolean estBisextile(int annee){
        final int C1=4;
        final int C2=100;
        final int C3=400;
        if (((annee % C1 ==0) && (annee %C2!=0))||(annee %C3==0))
            return true;
        else
            return false;
    }
}

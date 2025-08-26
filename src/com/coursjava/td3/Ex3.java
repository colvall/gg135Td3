package com.coursjava.td3;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien de prix souhaitez-vous saisir ? ");
        int taille = scanner.nextInt();
        double[] listePrix = new double[taille];

        saisirPrix(listePrix, scanner);

        int nbPrixValides = nbValides(listePrix);
        double somme = sommePrix(listePrix);
        double moyenne = moyennePrix(somme, nbPrixValides);

        System.out.println("Nombre de prix valides : " + nbPrixValides);
        System.out.println("Somme des prix : " + somme);
        System.out.println("Moyenne des prix : " + moyenne);

        scanner.close(); // fermer à la fin seulement
    }

    static double saisirValide(Scanner scanner) {
        double prix;
        do {
            System.out.print("Entrez un prix valide (entre 0 et 1000, 0 pour arrêter) : ");
            prix = scanner.nextDouble();
        } while (prix < 0 || prix > 1000);
        return prix;
    }

    static void saisirPrix(double[] listePrix, Scanner scanner) {
        double prix;
        System.out.println("Entrez les prix (0 pour arrêter) ");
        for (int i = 0; i < listePrix.length; i++) {
            prix = saisirValide(scanner);
            if (prix == 0) break;
            listePrix[i] = prix;
        }
    }

    public static int nbValides(double[] listePrix) {
        int count = 0;
        for (double prix : listePrix) {
            if (prix >= 0.1 && prix <= 1000) count++;
        }
        return count;
    }


    public static double sommePrix(double[] listePrix) {
        double somme = 0;
        for (double prix : listePrix) {
            somme += prix;
        }
        return somme;
    }

    public static double moyennePrix(double somme, int nbPrix) {
        if (nbPrix != 0) {   // Éviter la division par zéro
            return somme / nbPrix;
        }
        return 0;
    }
}

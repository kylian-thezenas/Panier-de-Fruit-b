package org.acme;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        GameLogic game = new GameLogic();
        for (int i = 0; i < 10; i++) {
            game.ajouterFruitSurTapisRoulant();
        }
        while (game.obtenirFruitsSurTapisRoulant().size() > 0) {
            game.printPremierFruit();
            String choix = scanner.nextLine();
            if (choix.equals("d")){
                game.placerFruitDansPanier("pomme");
            } else if (choix.equals("g")){
                game.placerFruitDansPanier("banane");
            } else if (choix.equals("f")){
                game.placerFruitDansPanier("caca");
            }
        }



    }
}

package org.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    @Test
    void ajouterFruitSurTapisRoulant() {
        GameLogic gameLogic = new GameLogic();
        gameLogic.ajouterFruitSurTapisRoulant();
        assertEquals(1, gameLogic.obtenirFruitsSurTapisRoulant().size());
    }

    @Test
    void placerFruitDansPanier() {
        GameLogic gameLogic = new GameLogic();
        gameLogic.ajouterFruitSurTapisRoulant("pomme");
        gameLogic.placerFruitDansPanier("pomme");
        assertEquals(0, gameLogic.obtenirFruitsSurTapisRoulant().size());
    }

    @Test
    void deplacerTapisRoulant() {
        GameLogic gameLogic = new GameLogic();
        gameLogic.ajouterFruitSurTapisRoulant();
        gameLogic.ajouterFruitSurTapisRoulant();
        gameLogic.deplacerTapisRoulant();
        assertEquals(1, gameLogic.obtenirFruitsSurTapisRoulant().size());
    }

    @Test
    void obtenirPremierFruitSurTapisRoulant() {
        GameLogic gameLogic = new GameLogic();
        gameLogic.ajouterFruitSurTapisRoulant("pomme");
        assertEquals(EnumFruit.APPLE, gameLogic.obtenirPremierFruitSurTapisRoulant().getType());
    }

    @Test
    void obtenirPremierFruitSurTapisRoulant2() {
        GameLogic gameLogic = new GameLogic();
        gameLogic.ajouterFruitSurTapisRoulant("banane");
        assertEquals(EnumFruit.BANANA, gameLogic.obtenirPremierFruitSurTapisRoulant().getType());
    }
}
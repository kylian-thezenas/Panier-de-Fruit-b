package org.acme;
import java.util.List;
import java.util.Random;

public class GameLogic {
    private TapisRoulant tapisRoulant;
    private Panier panierPomme;
    private Panier panierBanane;

    public GameLogic() {
        tapisRoulant = new TapisRoulant();
        panierPomme = new Panier(1, EnumFruit.APPLE);
        panierBanane = new Panier(2, EnumFruit.BANANA);
    }

    public void ajouterFruitSurTapisRoulant() {
        tapisRoulant.addRandomFruit();
    }

    public void ajouterFruitSurTapisRoulant(String fruit) {
        switch (fruit) {
            case "pomme":
                tapisRoulant.addFruit(new Fruit(EnumFruit.APPLE));
                break;
            case "banane":
                tapisRoulant.addFruit(new Fruit(EnumFruit.BANANA));
                break;
        }
    }

    public boolean placerFruitDansPanier(String panier) {
        Fruit fruit = obtenirPremierFruitSurTapisRoulant();
        switch (panier) {
            case "pomme":
                if (fruit.getType().equals(panierPomme.getType())) {
                    deplacerTapisRoulant();
                    System.out.println("Pomme ajouté au panier de pommes");
                    return true;
                } else {
                    System.out.println("Banane ajouté au panier de pommes");
                    return false;
                }
            case "banane":
                if (fruit.getType().equals(panierBanane.getType())) {
                    deplacerTapisRoulant();
                    System.out.println("Banane ajouté au panier de bananes");
                    return true;
                } else {
                    System.out.println("Pomme ajouté au panier de bananes");
                    return false;
                }
            case "caca":
                if (EnumEtat.POURRI == fruit.getEtat()) {
                    deplacerTapisRoulant();
                    System.out.println("fruit pourri jeté");
                    return true;
                } else {
                    System.out.println("Pomme frais jeté");
                    return false;
                }
        }
        return false;
    }

    public void deplacerTapisRoulant() {
        tapisRoulant.move();
    }

    public Fruit obtenirPremierFruitSurTapisRoulant() {
        return tapisRoulant.getFirstFruit();
    }

    public void viderTapisRoulant() {
        tapisRoulant.viderTapisRoulant();
    }

    public List<Fruit> obtenirFruitsSurTapisRoulant() {
        return tapisRoulant.getFruits();
    }

    public void printPremierFruit(){
        System.out.println(obtenirPremierFruitSurTapisRoulant().getType().toString());
    }
}

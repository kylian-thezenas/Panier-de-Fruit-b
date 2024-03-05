package org.acme;

import java.util.ArrayList;
import java.util.List;

public class TapisRoulant{
    private List<Fruit> fruits;

    public TapisRoulant() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void removeFruit(Fruit fruit) {
        fruits.remove(fruit);
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public String getFirstFruit(){
        if (!fruits.isEmpty()) {
            return fruits.get(0).getType().toString();
        }
        return "Aucun fruit";
    }

    public int move() {
        if (!fruits.isEmpty()) {
            fruits.remove(0); // Supprimer le premier fruit de la liste
            return 1;
        }
        return 0;
    }
}

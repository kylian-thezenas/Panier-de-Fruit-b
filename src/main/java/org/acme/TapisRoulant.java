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

    public Fruit getFirstFruit(){
        if (!fruits.isEmpty()) {
            return fruits.get(0);
        }
        return null;
    }

    public int move() {
        if (!fruits.isEmpty()) {
            fruits.remove(0); // Supprimer le premier fruit de la liste
            return 1;
        }
        return 0;
    }

    public void viderTapisRoulant(){
        fruits.clear();
    }

    public void addFruits(List<Fruit> fruits){
        this.fruits.addAll(fruits);
    }

    public void addRandomFruit(){
        int random = (int) (Math.random() * 2);
        switch (random){
            case 0:
                addFruit(new Fruit(EnumFruit.APPLE));
                break;
            case 1:
                addFruit(new Fruit(EnumFruit.BANANA));
                break;
        }
    }
}

package org.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapisRoulantTest {

    @Test
    void addFruit() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        assertEquals(1, tapisRoulant.getFruits().size());
    }

    @Test
    void addFruit2() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        assertEquals(2, tapisRoulant.getFruits().size());
    }

    @Test
    void removeFruit() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.removeFruit(fruit);
        assertEquals(0, tapisRoulant.getFruits().size());
    }

    @Test
    void removeFruit2() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        tapisRoulant.removeFruit(fruit);
        assertEquals(1, tapisRoulant.getFruits().size());
    }

    @Test
    void removeFruit3() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        Fruit fruit3 = new Fruit(EnumFruit.BANANA);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        tapisRoulant.removeFruit(fruit);
        tapisRoulant.addFruit(fruit3);
        assertEquals(2, tapisRoulant.getFruits().size());
    }

    @Test
    void getFruits() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        Fruit[] fruits = new Fruit[2];
        fruits[0] = fruit;
        fruits[1] = fruit2;
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        assertEquals(fruits[0], tapisRoulant.getFruits().get(0));
        assertEquals(fruits[1], tapisRoulant.getFruits().get(1));
    }

    @Test
    void getFruits2() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        Fruit[] fruits = new Fruit[2];
        fruits[0] = fruit;
        fruits[1] = fruit2;
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        assertEquals(fruit2, tapisRoulant.getFruits().get(1));
    }

    @Test
    void move() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        tapisRoulant.move();
        assertEquals(1, tapisRoulant.getFruits().size());
    }

    @Test
    void move2() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.move();
        assertEquals(0, tapisRoulant.getFruits().size());
    }

    @Test
    void move3() {
        TapisRoulant tapisRoulant = new TapisRoulant();
        assertEquals(0, tapisRoulant.move());
    }

    @Test
    void move4() {
        TapisRoulant tapisRoulant = new TapisRoulant();
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        tapisRoulant.addFruit(fruit);
        assertEquals(1, tapisRoulant.move());
    }

    @Test
    void move5(){
        TapisRoulant tapisRoulant = new TapisRoulant();
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        Fruit fruit3 = new Fruit(EnumFruit.BANANA);
        Fruit fruit4 = new Fruit(EnumFruit.APPLE);
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        tapisRoulant.addFruit(fruit3);
        tapisRoulant.addFruit(fruit4);
        tapisRoulant.move();
        assertEquals(fruit2, tapisRoulant.getFruits().get(0));
    }


    @Test
    void getFirstFruit() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        assertEquals(fruit, tapisRoulant.getFirstFruit());
    }

    @Test
    void getFirstFruit2() {
        TapisRoulant tapisRoulant = new TapisRoulant();
        assertEquals(null, tapisRoulant.getFirstFruit());
    }

    @Test
    void getFirstFruit3() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        assertEquals(fruit, tapisRoulant.getFirstFruit());
    }

    @Test
    void getFirstFruit4() {
        Fruit fruit = new Fruit(EnumFruit.APPLE);
        Fruit fruit2 = new Fruit(EnumFruit.BANANA);
        TapisRoulant tapisRoulant = new TapisRoulant();
        tapisRoulant.addFruit(fruit);
        tapisRoulant.addFruit(fruit2);
        tapisRoulant.move();
        assertEquals(fruit2, tapisRoulant.getFirstFruit());
    }

}
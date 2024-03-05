package org.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {

    @Test
    void testFruit() {
        Fruit fruit = new Fruit(1, EnumFruit.APPLE);
        assertEquals(1, fruit.getId());
        assertEquals(EnumFruit.APPLE, fruit.getType());
    }


    @Test
    void getEtat() {
        Fruit fruit = new Fruit(1, EnumFruit.APPLE);
        assertEquals(EnumEtat.FRAIS, fruit.getEtat());
    }

    @Test
    void getEtat2(){
        Fruit fruit = new Fruit(1, EnumFruit.APPLE, EnumEtat.POURRI);
        assertEquals(EnumEtat.POURRI, fruit.getEtat());
    }

    @Test
    void setEtat() {
        Fruit fruit = new Fruit(1, EnumFruit.APPLE);
        fruit.setEtat(EnumEtat.POURRI);
        assertEquals(EnumEtat.POURRI, fruit.getEtat());
    }

    @Test
    void setEtat2() {
        Fruit fruit = new Fruit(1, EnumFruit.APPLE);
        fruit.setEtat(EnumEtat.POURRI);
        fruit.setEtat(EnumEtat.FRAIS);
        assertEquals(EnumEtat.FRAIS, fruit.getEtat());
    }
}
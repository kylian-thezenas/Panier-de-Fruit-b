package org.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanierTest {

    @Test
    void getId() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        assertEquals(1, p.getId());
    }

    @Test
    void getType() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        assertEquals(EnumFruit.APPLE, p.getType());
    }

    @Test
    void setId() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        p.setId(2);
        assertEquals(2, p.getId());
    }

    @Test
    void verifieFruit() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        Fruit f = new Fruit(1, EnumFruit.APPLE);
        assertTrue(p.verifieFruit(f));
    }

    @Test
    void verifieFruit2() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        Fruit f = new Fruit(1, EnumFruit.BANANA);
        assertFalse(p.verifieFruit(f));
    }

    @Test
    void verifieFruit3() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        Fruit f = new Fruit(1, EnumFruit.BANANA);
        f.setEtat(EnumEtat.POURRI);
        assertFalse(p.verifieFruit(f));
    }

    @Test
    void verifieFruit4() {
        Panier p = new Panier(1, EnumFruit.APPLE);
        Fruit f = new Fruit(1, EnumFruit.APPLE);
        f.setEtat(EnumEtat.POURRI);
        assertFalse(p.verifieFruit(f));
    }
}
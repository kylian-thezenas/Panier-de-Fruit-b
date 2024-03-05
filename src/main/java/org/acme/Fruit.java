package org.acme;

public class Fruit {
    private int id;
    private EnumFruit type;
    private EnumEtat etat;

    public Fruit(int id, EnumFruit type) {
        this.id = id;
        this.type = type;
        this.etat = EnumEtat.FRAIS;
    }

    public Fruit(int id) {
        this.id = id;
        this.type = EnumFruit.APPLE;
        this.etat = EnumEtat.FRAIS;
    }

    public Fruit(int id, EnumFruit type, EnumEtat etat) {
        this.id = id;
        this.type = type;
        this.etat = etat;
    }
    public int getId() {
        return id;
    }

    public EnumFruit getType() {
        return type;
    }

    public EnumEtat getEtat() {
        return etat;
    }

    public void setEtat(EnumEtat etat) {
        this.etat = etat;
    }
}

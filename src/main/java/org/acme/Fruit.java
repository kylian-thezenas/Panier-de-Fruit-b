package org.acme;

public class Fruit {
    private EnumFruit type;
    private EnumEtat etat;

    public Fruit(EnumFruit type) {
        this.type = type;
        this.etat = EnumEtat.FRAIS;
    }

    public Fruit() {
        this.type = EnumFruit.APPLE;
        this.etat = EnumEtat.FRAIS;
    }

    public Fruit(EnumFruit type, EnumEtat etat) {
        this.type = type;
        this.etat = etat;
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

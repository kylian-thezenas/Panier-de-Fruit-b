package org.acme;

public class Panier {
    private int id;
    private EnumFruit type;

    public Panier(int id, EnumFruit type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public EnumFruit getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean verifieFruit(Fruit f){
        if (f.getEtat() == EnumEtat.POURRI){
            return false;
        }
        return f.getType() == this.type;
    }
}

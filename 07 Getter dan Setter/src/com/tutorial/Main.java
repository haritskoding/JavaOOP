package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double dblPrivate;

    public Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    void display() {
        System.out.println("public\t\t:" + this.intPublic);
        System.out.println("private int\t:" + this.intPrivate);
        System.out.println("private double\t:" + this.dblPrivate);
    }

    // getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value) {
        this.dblPrivate = value;
    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    // getter
    public double getJari2() {
        return this.diameter / 2;
    }

    // getter
    public double getLuas() {
        return 3.14 * diameter * diameter / 4;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Data object = new Data();
        // public
        // read and write dengan menggunakan public
        object.intPublic = 10;// Write
        System.out.println("public: " + object.intPublic);// Read

        // read only (kita bisa menggunakan GETTER)
        int angka = object.getIntPrivate();
        System.out.println("getter: " + angka);

        // write only ( Kita hanya bisa menulis saja)
        object.setDoublePrivate(0.05);
        System.out.println("--Print---");
        object.display();

        // gabungkan read and write dengan setter dan getter
        System.out.println("---Print Lingkaran---");
        Lingkaran object2 = new Lingkaran(7);
        System.out.println("Jari2: " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari2: " + object2.getJari2());
        System.out.println("Luas: " + object2.getLuas());
    }
}

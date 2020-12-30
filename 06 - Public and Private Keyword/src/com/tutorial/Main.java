package com.tutorial;

class Player {
    String name; // default , dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public , dia akan bisa dibaca dan di tulis dari luar class
    private int health;// private , hanya akan bisa dibaca dan di tulis dalam kelas saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display() {
        tambahExp();// contoh meng akses private method
        System.out.println("\nName\t: " + this.name);
        System.out.println("Exp\t: " + this.exp);
        System.out.println("health\t;" + this.health);
    }

    // public
    public void ubahNama(String namaBaru) {
        this.name = namaBaru;
    }

    // private
    private void tambahExp() {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Player player1 = new Player("Marni", 0, 120);

        // default
        System.out.println(player1.name);
        player1.name = "Surti";
        System.out.println(player1.name);

        // public
        System.out.println(player1.exp);
        player1.exp = 100;
        System.out.println(player1.exp);

        // private(tidak bisa di akses)
        // System.out.println(player1.health);
        // player1.health = 100;
        // System.out.println(player1.health);

        // default
        player1.display();

        // public
        player1.ubahNama("Tejo");
        player1.display();

        // private (Tidak bisa di akses dari luar)
        // player1.tambahExp();
    }
}

package com.tutorial;

import javax.swing.plaf.basic.BasicCheckBoxUI;

class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t:" + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Buku dataBuku1 = new Buku("Killing Commandantore", "Haruki Murakami");

        dataBuku1.display();
        // Menampilkan address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println(addressBuku1);

        // assignment object
        Buku buku2 = dataBuku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

        // Karena buku 1 dan buku 2 berada pada address atau referensi yang sama
        dataBuku1.judul = "Membunuh komandatur";
        dataBuku1.display();
        buku2.display();

        // kita akan memasukan object ke dalam method
        fungsi(buku2);
        buku2.display();
        dataBuku1.display();

    }

    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("address dalam fungsi: " + addressDataBuku);
        dataBuku.penulis = "Teguh Harits";

    }
}

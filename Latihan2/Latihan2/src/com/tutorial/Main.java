package com.tutorial;

//class tanpa constructor
class Polos {
    String nama;
    int harga;
}

// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // constructor di panggil saat objek pertama kali dibuat
    // Mahasiswa() {
    // System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputjurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputjurusan;
        System.out.println("Nama: " + nama + ", NIM: " + NIM + ", jurusan: " + jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Teguh", "121212", "IPA");

        // System.out.println("aris");
        // Polos objekPolos = new Polos();
        // objekPolos.nama = "Baju baru";
        // objekPolos.harga = 1000;
        // System.out.println(objekPolos.nama);
        // System.out.println(objekPolos.harga);
    }
}
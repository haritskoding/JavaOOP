package com.tutorial;

//membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Instansiasi /membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup";
        mahasiswa1.NIM = "122134345";
        mahasiswa1.jurusan = "Informatika Komputer";
        mahasiswa1.IPK = 4.8;
        mahasiswa1.umur = 21;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Otong";
        mahasiswa2.NIM = "122134345";
        mahasiswa2.jurusan = "Informatika Komputer";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 32;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);
    }
}

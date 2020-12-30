package com.tutorial;

class Mahasiswa {

    String nama = "nama asli";
    String NIM;

    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Nim: " + this.NIM);
    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tapi tidak ada parameternya
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // method dengan return dan juga parameter
    String sayHi(String message) {
        return message + " juga,nama saya adalah : " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "12091209209");
        System.out.println(mahasiswa1.nama);

        // method
        mahasiswa1.show();
        mahasiswa1.setNama("Teguh");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }

}
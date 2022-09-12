package com.dicoding.javafundamental.object;

public class Hewan {

    String nama;
    int berat;
    int jumlahKaki;
    
    //Ini merupakkan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object di ciptakan
    public Hewan(String namaHewan) {
        nama = namaHewan;
    }

    public void beratHewan(int beratHewan) {
        berat = beratHewan;
    }

    public void jumlahKaki(int jumlahKakiHewan) {
        jumlahKaki = jumlahKakiHewan;
    }

    public void cetakHewan() {
        System.out.println("Nama hewan : " + nama);
        System.out.println("Berat hewan : " + berat + "kg");
        System.out.println("Jumlah kaki : " + jumlahKaki);
    }
}


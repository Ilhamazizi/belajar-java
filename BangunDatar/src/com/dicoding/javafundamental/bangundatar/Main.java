package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Kamus
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran oLingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        oLingkaran = new Lingkaran();

        //Program
        //Panggil method
        mainMenu();

        //Kondisional untuk pilihan menu yang dimasukkan
        switch(pilihan) {

            case '1' : {         
                System.out.println("Masukkan panjang persegi : ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan lebar persegi : ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang : " + opersegi.luas(s1, s2));
                System.out.println("Keliling persegi panjang : " + opersegi.keliling(s1, s2));
                break;
            }

            case '2' : {
                System.out.println("Masukkan alas segitiga siku : ");
                s1 =  scanner.nextInt();
                System.out.println("Masukkan tinggi segitiga siku : ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang : " + osegitiga.luas(s1, s2));
                System.out.println("Keliling persegi panjang : " + osegitiga.keliling(s1, s2));
                break;
            }

            case '3' : {
                System.out.println("Masukkan jari-jari lingkarang : ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran : " + oLingkaran.luas(r));
                System.out.println("Keliling lingkaran : " + oLingkaran.keliling(r));
                break;
            }
        }

    }

    private static void mainMenu() {
        //Pilihan menu
        System.out.println("--------------------------------");
        System.out.println("Hitung Luas dan Keliling : ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Sihu");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan Menu : ");
        System.out.println("--------------------------------");
        pilihan = scanner.next().charAt(0);
    }
    
}

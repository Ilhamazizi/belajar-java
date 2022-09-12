package com.dicoding.javafundamental.inheritance;

import javax.management.ObjectName;

public class Main {
    public static void main(String[] args) {
        
        Hewan hewan = new Hewan(); //Memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing(); //Memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("------------------------");

        hewan.makan();
        kucing.makan(); //Kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan("daging ikan");

        System.out.println("------------------------");

        Kucing meow = new Kucing("Ocicat", "tropis");
        Kucing puss = new Kucing("Ocicat", "subtropis");
        Kucing popo = new Kucing("Anggora", "subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("meow equals puss ? " + meow.equals(puss));
        System.out.println("meow equals popo ? " + meow.equals(popo));

        System.out.println("------------------------");

        Object o = new Kucing(); //Kucing adalah object
        Hewan h = new Kucing(); //Kucing adalah hewan
        Kucing k = new Kucing(); //Kucing adalah kucing pastinya    

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        Object object = k; //Bisa langsung di assign
        Hewan hewanK = k; //Bisa langsung di assign

        //object.makan(); -> karna method makan tidak ada di class Object
        hewan.makan();

        Hewan harimau = new Hewan();
        Kucing anggora = (Kucing) harimau; //Compile OK tetapi runtime error ClassCastException
    }
}
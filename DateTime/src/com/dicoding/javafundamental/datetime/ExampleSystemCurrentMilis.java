package com.dicoding.javafundamental.datetime;

public class ExampleSystemCurrentMilis {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------");
        
        long timeNow = System.currentTimeMillis();
        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");

        System.out.println("-----------------------------------------------------");
    }
}

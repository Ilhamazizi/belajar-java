package com.dicoding.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {

        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas (p, l); //Memanggil fungsi
        System.out.println("Haislnya adalah = " + hasil);

    }
        //Fungsi dengan nilai balik
        public static double hitungLuas(double panjang, double lebar) {
            double luas = panjang * lebar;
            return luas;
    }
}
    


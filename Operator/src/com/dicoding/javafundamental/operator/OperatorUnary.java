package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {

        System.out.println("===========================");

        //Unary Plus
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = nilaiAwal;
        System.out.println("Hasil + 5 = " + hasil);
        System.out.println();

        //Unary Minus
        System.out.println("Operator Unary Minus");
        int nilaiAwal2 = 5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil - 5 = " + nilaiAwal2);
        System.out.println();

        //Operator Peningkatan 1 point
        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ = " + nilaiAwal3);
        System.out.println();

        //Operator Pengurangan 1 point
        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- = " + nilaiAwal4);
        System.out.println();

        //Operator Komplemen
        System.out.println("Operator komplemen logika");
        boolean sukses = false; //Nilai sukses yaitu false
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();

        System.out.println("===========================");
    }
    
}

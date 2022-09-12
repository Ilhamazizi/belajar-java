package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args) {

        int nilaUjian = 80;
        char IndexPrestasi;

        if (nilaUjian >= 90) {
            IndexPrestasi = 'A';

        } else if (nilaUjian >= 80) {
            IndexPrestasi = 'B';

        } else if (nilaUjian >= 70) {
            IndexPrestasi = 'C';

        } else if (nilaUjian >= 60) {
            IndexPrestasi = 'D';

        } else if (nilaUjian >= 50) {
            IndexPrestasi = 'E';

        } else {
            IndexPrestasi = 'F';

        }
        System.out.println("Nilai ujian akhir anda adalah " + IndexPrestasi);
    }
}

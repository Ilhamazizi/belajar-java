package com.dicoding.javafundamental.accessmodifier.Package2;

import com.dicoding.javafundamental.accessmodifier.Package1.KelasA;

public class Main {
    public static void main(String[] args) {
        
        //Kode ini pasti mengalami kompiler error

        KelasA kelasA = new KelasA();

        //System.out.println(kelasA.functionB());
        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
    
}

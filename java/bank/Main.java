// package com.company;

public class Main {

    public static void main(String[] args) {

        Nasabah n1 = new Nasabah("Andi", "Jakarta");
        n1.bukaRekening(new Rekening("Britama", 500000), 0);
        n1.bukaRekening(new Rekening("Hoe", 500000), 1);

        // n1.showListRekening();
        n1.tampilData(10000, 400);

    }
}
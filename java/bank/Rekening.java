// package com.company;

public class Rekening {
    
    private String noRekening;
    private double saldo;

    public Rekening(){}

    public Rekening(String noRekening, double saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jml){
        saldo = saldo + jml;
        System.out.println(saldo);
    }

    public void withdraw(double jml){
        saldo = saldo - jml;
        System.out.println(saldo);
    }
}
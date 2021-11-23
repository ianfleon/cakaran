// package com.company;

public class Nasabah {
    
    private String nama;
    private String alamat;
    private int jumlahRekening;
    private Rekening[] rek;

    public Nasabah(String nama, String alamat){
        rek = new Rekening[5];
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahRekening() {

        int i;
        
        for(i = 0; i < rek.length; i++) {
            if (rek[i] == null) {
                break;
            }
        }

        return i;
    }

    public Rekening getRekening(int no){
        return this.rek[no];
    }

    public void showListRekening() {
        for (int i = 0; i < getJumlahRekening(); i++) {
            System.out.println("[" + i + "]" + " : " + rek[i].getNoRekening());
        }
    }

    public void bukaRekening(Rekening rek, int no){
        this.rek[no] = rek;
    }

    public void tampilData(double jmlDeposit, double jmlWithdraw){
        System.out.println("Nama             : " + this.nama);
        System.out.println("Alamat           : " + this.alamat);
        System.out.println("Jumlah Rekening  : " + this.getJumlahRekening());
        System.out.println("Nomor Rekening   : ");
        this.showListRekening();
        // System.out.println("Jumlah Saldo     : " + rek.getSaldo());
        // System.out.println("\nMelakukan Deposit " + jmlDeposit);
        // System.out.print("Saldo setelah Deposit : ");
        // rek.deposit(jmlDeposit);
        // System.out.println("\nMelakukan Witdraw " + jmlWithdraw);
        // System.out.print("Saldo setelah Withdraw :");
        // rek.withdraw(jmlWithdraw);
    }
}

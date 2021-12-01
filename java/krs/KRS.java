// package com.company;
import java.util.Arrays;

public class KRS {
    
    private String[] matkul;
    private String semester;
    private String[] jadwal;

    public KRS(){}

    // public KRS(String matkul, String semester, String jadwal) {
    //     this.matkul = matkul;
    //     this.semester = semester;
    //     this.jadwal = jadwal;
    // }

    public void setTotal(int t) {
        this.matkul = new String[t];
        this.jadwal = new String[t];
    }

    public void getMatkul() {
        System.out.print(Arrays.toString(matkul));
    }

    public void setMatkul(String matkul, int i) {
        this.matkul[i] = matkul;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void getJadwal() {
        System.out.print(Arrays.toString(jadwal));
    }

    public void setJadwal(String jadwal, int i) {
        this.jadwal[i] = jadwal;
    }
}

class Waktu {

    public int jam, menit, detik;

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getJam() {
        return this.jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getMenit() {
        return this.menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public int getDetik() {
        return this.detik;
    }

    public String sekarang() {
        return this.jam + ":" + this.menit + ":" + this.detik;
    }

    public String lama(int jam, int menit, int detik) {
        
        jam = this.jam + jam;
        menit = this.menit + menit;
        detik = this.detik + detik;

        return jam + ":" + menit + ":" + detik;

    }

}
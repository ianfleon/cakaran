public class PriaWanita extends Manusia {

    private double Masatubuh;
    private double Berat;
    private double Tinggi;

    public PriaWanita(){}

    public PriaWanita(double Masatubuh, double Berat, double Tinggi){
        this.Masatubuh = Masatubuh;
        this.Berat = Berat;
        this.Tinggi = Tinggi;
    }
    public double getBerat() {
        return Berat;
    }

    public void setBerat(double Berat) {
        this.Berat = Berat;
    }

    public double getTinggi() {
        return Tinggi;
    }

    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }

    public void setMasatubuh(double Masatubuh) {
        this.Masatubuh = Masatubuh;
    }

    public double getMasatubuh() {
        return Math.floor(Berat/((Tinggi/100)*(Tinggi/100)));
    }
}
public class Manusia {
    private String Nama;
    private String Usia;
    private String Jenis_kelamin;


    public Manusia(){}

    public Manusia(String Nama, String Usia, String Jenis_kelamin){
        this.Nama = Nama;
        this.Usia = Usia;
        this.Jenis_kelamin = Jenis_kelamin;

    }
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUsia() {
        return Usia;
    }

    public void setUsia(String Usia) {
        this.Usia = Usia;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.Jenis_kelamin = jenis_kelamin;
    }
}
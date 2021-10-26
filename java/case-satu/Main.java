public class Main {

    public static void main(String[] args) {

	    PriaWanita pw = new PriaWanita();

        pw.setNama("Ani");
        pw.setUsia("20");
        pw.setJenis_kelamin("Perempuan");
        pw.setBerat(100);
        pw.setTinggi(160);

        System.out.println(pw.getNama());
        System.out.println(pw.getUsia());
        System.out.println(pw.getJenis_kelamin());
        System.out.println(pw.getMasatubuh());

    }
}
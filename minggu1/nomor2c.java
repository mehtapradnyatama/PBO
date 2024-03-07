package minggu1;

public class nomor2c {
    public static void main(String[] args) {
        // Menghitung volume tabung
        double diameter = 5;
        double tinggi = 10;
        double jariJari = diameter/2;
        double volumeTabung = Math.PI * Math.pow(jariJari, 2) * tinggi;

        // Menampilkan hasil
        System.out.println("=====================================");
        System.out.println("Program Menghitung Volume Tabung");
        System.out.println("=====================================");
        System.out.println("Volume Tabung dengan diameter " + diameter + " dan " + "tinggi " + tinggi + " adalah " + volumeTabung);
        System.out.println("");
    }
}

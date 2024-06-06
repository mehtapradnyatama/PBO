package week9;

// MEHTA PRADNYATAMA
// A11.2022.14183
// PBO

public class BangunDatar {

    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;
    private int alas;
    private int tinggi;
    private static final double pi = 3.14;

    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Luas Persegi
    public int luas(int sisi) {
        return sisi * sisi;
    }

    // Luas Persegi Panjang
    public int luas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // luas segitiga
    public double luas(double a, double b) {
        return (a * b) / 2;
    }

    // luas lingkaran
    public double luas(double jariJari) {
        return pi * jariJari * jariJari;
    }

    // keliling persegi
    public int keliling(int sisi) {
        return 4 * sisi;
    }

    // keliling persegi panjang
    public int keliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    // keliling lingkaran
    public double keliling(double jariJari) {
        return 2 * pi * jariJari;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getSisi() {
        return sisi;
    }

    public double getPi() {
        return pi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }
}

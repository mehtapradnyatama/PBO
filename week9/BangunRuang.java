package week9; 

// MEHTA PRADNYATAMA
// A11.2022.14183
// PBO

public class BangunRuang extends BangunDatar {

    public BangunRuang(int sisi) {
        super(sisi);
    }

    public BangunRuang(int panjang, int lebar) {
        super(panjang, lebar); 
    }

    // Volume Kubus
    public double volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    // Volume balok
    public double volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    // Volume balok (Double)
    public double volumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Volume Bola
    public double volumeBola(double radius) {
        return (4 / 3) * getPi() * Math.pow(radius, 3);
    }
}

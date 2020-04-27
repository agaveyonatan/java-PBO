

public class Tembereng3D extends Bola{
    double tinggi;
    private double luasPermukaan, volume; //encapsulation
    
    Tembereng3D(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public double volume() {
        volume = 1/3.0 * tinggi * tinggi * ((3 * super.jari_jari) - tinggi);
        return volume;
    }
    
    public double luasPermukaan() {
        luasPermukaan = 2 * super.pi * super.jari_jari * tinggi;
        return luasPermukaan;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Tembereng 3D Telah Selesai");
    }
}

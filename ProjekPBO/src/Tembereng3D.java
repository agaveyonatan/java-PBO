

public class Tembereng3D extends Bola{
    protected double luasPermukaanT3D, volumeT3D, tinggi; //encapsulation
    
    public Tembereng3D(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }
    
    public double hitungVolumeT3D() {
        volumeT3D = 1/3.0 *Math.PI * tinggi * tinggi * ((3 * super.jari_jari) - tinggi);
        return volumeT3D;
    }
    
    public double hitungLuasPermukaanT3D() {
        luasPermukaanT3D =  Lingkaran.kelilingLingkaran * tinggi;
        return luasPermukaanT3D;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Tembereng 3D Telah Selesai");
    }
}

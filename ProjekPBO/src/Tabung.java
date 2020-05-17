/**
 *
 * @author Agave-PC
 */
public class Tabung extends Lingkaran {
    protected double luasPermukaanTabung, tinggiDimen, volumeTabung; //encapsulation
    
    public Tabung(double jari, double tinggiDimensi){
        super(jari);
        tinggiDimen = tinggiDimensi;
    }
    
//    @Override
//    public double luasLingkaran(){
//        return super.luasLingkaran;
//    }
    
    protected double hitungVolumeTabung(){ 
        volumeTabung = Lingkaran.luasLingkaran * tinggiDimen;
        return volumeTabung;
    }

    protected double hitungLuasPermukaanTabung() { 
        luasPermukaanTabung = 2*Lingkaran.luasLingkaran + Lingkaran.kelilingLingkaran*tinggiDimen; //LPTabung 2*pi*r(r+t) => 2*pi*r^2 + 2*pi*r*t
        return luasPermukaanTabung;
    }

    public void end(){
        System.out.println("\nProses Perhitungan Tabung Telah Selesai");
    }
}

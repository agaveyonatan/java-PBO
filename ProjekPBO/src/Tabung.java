/**
 *
 * @author Agave-PC
 */
public class Tabung extends Lingkaran {
    private double luasPermukaanTabung, tinggiDimen, volumeTabung; //encapsulation
    
    public Tabung(double jari, double tinggiDimensi){
        super(jari);
        tinggiDimen = tinggiDimensi;
    }
    
    @Override
    double luasLingkaran1(){
        return super.luas;
    }
    
    double volumeTabung(){
        volumeTabung = luasLingkaran1() * tinggiDimen;
        return volumeTabung;
    }

    double luasPermukaanTabung() {
        luasPermukaanTabung = 2*luasLingkaran1() + 2*pi*jari_jari*tinggiDimen; //LPTabung 2*pi*r(r+t) => 2*pi*r^2 + 2*pi*r*t
        return luasPermukaanTabung;
    }

    public void end(){
        System.out.println("\nProses Perhitungan Tabung Telah Selesai");
    }
}

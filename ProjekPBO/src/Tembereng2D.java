import java.lang.Math; 

public class Tembereng2D extends Lingkaran {
    protected double kelilingT2D, luasT2D, sdt;  //encapsulation
    
    public Tembereng2D(double jari, double sudut){
        super(jari);
        sdt = sudut;
    }
//    
//    @Override
//     public double luasLingkaran(){
//        return super.luasLingkaran;
//    }
     
    public double hitungLuasT2D(){
        luasT2D = (sdt/360.0 * Lingkaran.luasLingkaran) - (1/2.0*super.jari_jari*super.jari_jari * Math.sin(Math.toRadians(sdt)));
        return luasT2D;
    }

    public double hitungKelilingT2D() {
        kelilingT2D = (sdt/360.0 * Lingkaran.kelilingLingkaran) + (2 * super.jari_jari * Math.sin(Math.toRadians(sdt / 2.0)));
        return kelilingT2D;
    }
 
    @Override
    public void end(){
        System.out.println("\nProses Perhitungan Tembereng 2D Telah Selesai");
    }
}
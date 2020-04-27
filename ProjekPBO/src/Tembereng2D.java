import java.lang.Math; 

public class Tembereng2D extends Lingkaran {
    private double keliling, luas, sdt;  //encapsulation
    
    Tembereng2D(double jari, double sudut){
        super(jari);
        sdt = sudut;
    }
    
    @Override
     double luasLingkaran1(){
        return super.luas;
    }
     
    public double luas(){
        luas = (sdt/360.0 * luasLingkaran1()) - (1/2.0*super.jari_jari*super.jari_jari * Math.sin(Math.toRadians(sdt)));
        return luas;
    }

    public double keliling() {
        keliling = (sdt/360.0 * 2 * super.pi * super.jari_jari) + (2 * super.jari_jari * Math.sin(Math.toRadians(sdt / 2.0)));
        return keliling;
    }
 
    public void end(){
        System.out.println("\nProses Perhitungan Tembereng 2D Telah Selesai");
    }
}
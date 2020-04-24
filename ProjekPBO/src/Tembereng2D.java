import java.lang.Math; 

public class Tembereng2D extends Lingkaran {
    double luas;
    double sdt;
    double keliling;
    
    Tembereng2D(double jari){
        super(jari);
    }
    
    @Override
     double luasLingkaran(){
        return super.luas;
    }
     
    double luas(double sudut){
        sdt = sudut;
        luas = (sdt/360.0 * luasLingkaran()) - (1/2.0*super.jari_jari*super.jari_jari * Math.sin(Math.toRadians(sdt)));
        return luas;
    }

    double keliling(double sudut) {
        sdt = sudut;
        keliling = (sdt/360.0 * 2 * super.pi * super.jari_jari) + (2 * super.jari_jari * Math.sin(Math.toRadians(sdt / 2.0)));
        return keliling;
    }
}
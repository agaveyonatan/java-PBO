public class Juring2D extends Lingkaran {
    double luas;
    double sdt;
    double keliling;
    
    Juring2D(double jari){
        super(jari);
    }
    
    @Override
     double luasLingkaran(){
        return super.luas;
    }
     
    double luas(double sudut){
        sdt = sudut;
        luas = sdt/360.0 * luasLingkaran();
        return luas;
    }

    double keliling(double sudut) {
        sdt = sudut;
        keliling = (2 * super.jari_jari) + (2 * super.pi * super.jari_jari * (sdt/360.0));
        return keliling;
    }
}
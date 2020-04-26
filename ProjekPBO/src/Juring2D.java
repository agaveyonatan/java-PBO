public class Juring2D extends Lingkaran {
    double luas;
    double sdt;
    double keliling;
    
    Juring2D(double jari, double sudut){
        super(jari);
        sdt = sudut;
    }
    
    @Override
     double luasLingkaran1(){
        return super.luas;
    }
     
    public double luas(){
        luas = sdt/360.0 * luasLingkaran1();
        return luas;
    }

    public double keliling() {
        keliling = (2 * super.jari_jari) + (2 * super.pi * super.jari_jari * (sdt/360.0));
        return keliling;
    }
  
    public void end(){
        System.out.println("\nProses Perhitungan Juring 2D Telah Selesai");
    }
}
public class Juring2D extends Lingkaran {
    protected double kelilingJuring2D, luasJuring2D, sdt; //encapsulation
    
    public Juring2D(double jari, double sudut){
        super(jari);
        sdt = sudut;
    }
//    
//    @Override
//    public double luasLingkaran(){
//        return super.luasLingkaran;
//    } 
     
    public double hitungLuasJ2D(){
        luasJuring2D = sdt/360.0 * Lingkaran.luasLingkaran;
        return luasJuring2D;
    }

    public double hitungKelilingJ2D() {
        kelilingJuring2D = (2 * super.jari_jari) + (Lingkaran.kelilingLingkaran * (sdt/360.0));
        return kelilingJuring2D;
    }
  
    public void end(){
        System.out.println("\nProses Perhitungan Juring 2D Telah Selesai");
    }
}
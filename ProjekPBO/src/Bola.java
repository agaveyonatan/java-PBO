import static java.lang.Math.pow;
/**
 *
 * @author Agave-PC
 */
public class Bola extends Lingkaran {
    public double volumeBola, luasPermukaanBola; //encapsulation
    
    public Bola(double jari){
        super(jari);
    }
    
//    @Override 
//    public double luasLingkaran(){
//        return super.luasLingkaran;
//    }
     
    public double hitungLuasPermukaanBola(){
        luasPermukaanBola = 4 * Lingkaran.luasLingkaran;
        return luasPermukaanBola;
    }
    
    public double hitungVolumeBola(){
        volumeBola =4.0/3.0 * Math.PI* pow(super.jari_jari,3);
        return volumeBola;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Bola Telah Selesai");
    }
}

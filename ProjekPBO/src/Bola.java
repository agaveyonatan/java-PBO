/**
 *
 * @author Agave-PC
 */
public class Bola extends Lingkaran {
    private double volume, luasPermukaan; //encapsulation
    
    Bola(double jari){
        super(jari);
    }
    
    @Override
     double luasLingkaran1(){
        return super.luas;
    }
     
    public double volume(){
        volume = 4 * luasLingkaran1();
        return volume;
    }
    
    public double luasPermukaan(){
        luasPermukaan =4.0/3.0 * pi* jari_jari * jari_jari * jari_jari;
        return luasPermukaan;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Bola Telah Selesai");
    }
}

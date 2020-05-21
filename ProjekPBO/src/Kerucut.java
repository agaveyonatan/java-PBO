import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Kerucut extends Lingkaran {
    public double tinggiD, luasPermukaan, garisPelukis;
    private double volume; //encapsulation
    
    public Kerucut(double jari, double tinggiDimensi){
        super(jari);
        tinggiD = tinggiDimensi;
    }
//    
//    @Override
//    public double luasLingkaran(){
//        return super.luasLingkaran;
//    }
        
    public double hitungVolume(){
        volume = 1.0/3.0 * Lingkaran.luasLingkaran * tinggiD;
        return volume;
    }
     
    public double hitungLuasPermukaan(){
        garisPelukis = Math.sqrt(Math.pow(super.jari_jari,2) + Math.pow(tinggiD, 2));
        luasPermukaan = Lingkaran.luasLingkaran +Math.PI*super.jari_jari*garisPelukis; //luas alas + luas selimut kerucut
        return luasPermukaan;
    }
    
//    public double getJari()
//    {
//        return super.jari_jari;
//    }
//    
//    public double getLuasLingakaran(){
//        return super.luasLingkaran;
//    }
}

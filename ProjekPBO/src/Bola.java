/**
 *
 * @author Agave-PC
 */
public class Bola extends Lingkaran {
    double pi = 3.14;
    private double volume;
    private double luasPermukaan;
    
    Bola(double jari){
        super(jari);
    }
    
    @Override
     double luasLingkaran(){
        return super.luas;
    }
     
    double volume(){
        volume = 4 * luasLingkaran();
        return volume;
    }
    
    double luasPermukaan(double jari){
        luasPermukaan =4.0/3.0 * pi* jari * jari * jari;
        return luasPermukaan;
    }
}

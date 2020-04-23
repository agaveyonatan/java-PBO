/**
 *
 * @author Agave-PC
 */
public class Kerucut extends Lingkaran {
    double tinggiD;
    double apotema;
    double luasPermukaan;
    double pi=3.14;
    private double volume;
    
    Kerucut(double jari){
        super(jari);
    }
    
    @Override
    double luasLingkaran(){
        return super.luas;
    }
    
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = 1.0/3.0 * luasLingkaran() * tinggiD;
        return volume;
    }
     
    double luasPermukaan(double jari, double apotema){
        apotema = apotema;
        luasPermukaan = pi*jari*(apotema+jari);
        return luasPermukaan;
    }
}

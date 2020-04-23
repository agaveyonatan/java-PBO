/**
 *
 * @author Agave-PC
 */
public class Tabung extends Lingkaran {
    double tinggiD;
    double pi = 3.14;
    
    private double volume;
    private double luasPermukaan;
    
    Tabung(double jari){
        super(jari);
    }
    
    @Override
    double luasLingkaran(){
        return super.luas;
    }
    
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = luasLingkaran() * tinggiD;
        return volume;
    }

    double luasPermukaan(double tinggiDimensi, double jari) {
        tinggiD = tinggiDimensi;
        luasPermukaan = 2*luasLingkaran() + 2*pi*jari*tinggiD;
        return luasPermukaan;
    }
}

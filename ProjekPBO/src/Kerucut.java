/**
 *
 * @author Agave-PC
 */
public class Kerucut extends Lingkaran {
    double tinggiD, luasPermukaan, apotheme;
    private double volume; //encapsulation
    
    Kerucut(double jari){
        super(jari);
    }
    
    @Override
    double luasLingkaran1(){
        return super.luas;
    }
    
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = 1.0/3.0 * luasLingkaran1() * tinggiD;
        return volume;
    }
     
    double luasPermukaan(double jari, double apotema){
        this.apotheme = apotema;
        luasPermukaan = pi*jari*(this.apotheme+jari);
        return luasPermukaan;
    }
    
    double getJari()
    {
        return super.jari_jari;
    }
}

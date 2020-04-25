/**
 *
 * @author Agave-PC
 */
public class KerucutTerpancung extends Kerucut{
    double tinggiD;
    private double volume;
    double luasPermukaan;
    double jari_jari;
    
    KerucutTerpancung(double jari, double apotema){
        super(apotema);
    }    
    
    @Override
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = 1.0/3.0 * luasLingkaran() * tinggiD;
        return volume;
    }
    
    double luasPermukaan(double jari, double apotema, double jari2){
        double jari_jari = jari2;
        return luasPermukaan;
    }
    
}

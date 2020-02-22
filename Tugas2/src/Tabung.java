/**
 *
 * @author Agave-PC
 */
public class Tabung extends Lingkaran {
    double tinggiD;
    private double volume;
    
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
}

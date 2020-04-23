/**
 *
 * @author Agave-PC
 */
public class Lingkaran {
    public double jari_jari;
    static double luas;
    double pi=3.14;
    int jariInteger;
    
    Lingkaran(double jari){
        jari_jari = jari;
    }
    
    double luasLingkaran(){
        luas = pi * jari_jari * jari_jari;
        return luas;
    }
    
    int luasLingkaran(int jari){
        jariInteger = jari;
        luas = pi * jariInteger * jariInteger;
        return (int)luas;
    }
}

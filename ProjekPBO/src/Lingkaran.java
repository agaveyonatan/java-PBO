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
    
    double luasLingkaran1(){
        luas = pi * jari_jari * jari_jari;
        return luas;
    }
    
    int luasLingkaran2(){
        luas = pi * jari_jari * jari_jari;
        return (int)luas;
    }
 
    public void end(){
        System.out.println("\nProses Perhitungan Lingkaran Telah Selesai");
    }
}

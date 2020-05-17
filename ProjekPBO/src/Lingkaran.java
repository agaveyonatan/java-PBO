
import static java.lang.Math.PI;

 /**
 *
 * @author Agave-PC
 */
public class Lingkaran {
    protected double jari_jari;
    static protected double luasLingkaran;
    static protected double kelilingLingkaran;
//    double static final Math.PI=3.14;

    public Lingkaran(double jari){
        jari_jari = jari; 
    }
    
    public double hitungLuasLingkaran(){
        luasLingkaran = Math.PI * jari_jari * jari_jari;
        return luasLingkaran;
    }
    
    public int hitungLuasLingkaran(int jari){
        luasLingkaran = Math.PI * jari_jari * jari_jari;
        return (int)luasLingkaran;
    }
    
    public double hitungKelilingLingkaran(){
        kelilingLingkaran = 2 * Math.PI * jari_jari;
        return kelilingLingkaran;
    }
    
    static double getKelilingLingkaran(){
        return Lingkaran.kelilingLingkaran;
    }
    public void end(){
        System.out.println("\nProses Perhitungan Lingkaran Telah Selesai");
    }
}

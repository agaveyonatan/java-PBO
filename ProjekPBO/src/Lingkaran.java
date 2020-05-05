 /**
 *
 * @author Agave-PC
 */
public class Lingkaran {
    public double jari_jari;
    static double luasLingkaran;
    double pi=3.14;

    public Lingkaran(double jari){
        jari_jari = jari; 
    }
    
    public double luasLingkaran(){
        luasLingkaran = pi * jari_jari * jari_jari;
        return luasLingkaran;
    }
    
    public int luasLingkaran(int jari){
        luasLingkaran = pi * jari_jari * jari_jari;
        return (int)luasLingkaran;
    }
 
    public void end(){
        System.out.println("\nProses Perhitungan Lingkaran Telah Selesai");
    }
}

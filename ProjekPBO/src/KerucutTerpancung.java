/**
 *
 * @author Agave-PC
 */
public class KerucutTerpancung extends Kerucut{
    double tinggiD;
    private double volume;
    double luasPermukaan;
    double jari_jari;
    double jari2;
    double apotheme;
    
    KerucutTerpancung(double jari, double apotema){
        super(apotema);
        this.apotheme = apotema;
    }  
    
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = 1.0/3.0*super.pi*tinggiD*(this.jari2*super.getJari() + Math.pow(this.jari2, 2) + Math.pow(super.getJari(), 2));
        return volume;
    }

    double luasPermukaan(double jari2){
        this.jari2 = jari2;
        
        // pi*a*(R+r)
        return super.pi*this.apotheme*(super.getJari()+this.jari2);
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Kerucut Terpancung Telah Selesai");
    }
}

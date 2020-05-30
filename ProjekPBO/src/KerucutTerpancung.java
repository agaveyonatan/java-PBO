import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class KerucutTerpancung extends Kerucut{
    private double volumeKTerpancung, garisPelukisKTerpancung, lSelimut, lLing2; //encapsulation
    public double luasPermukaanKTerpancung, jari2;
    
    public KerucutTerpancung(double jari, double tinggiDimensi, double jari2){
        super(jari, tinggiDimensi);
        this.jari2 = jari2;
    }
    
    public double volumeKTerpancung(){
        volumeKTerpancung = 1.0/3.0*Math.PI*super.tinggiD*(Math.pow(super.jari_jari, 2) + jari2 * super.jari_jari + Math.pow(jari2, 2));
        return volumeKTerpancung;
    }

    public double luasPermukaanKTerpancung(){
        garisPelukisKTerpancung = Math.sqrt(pow(Math.abs(super.jari_jari - jari2), 2) + pow(super.tinggiD, 2));
        lSelimut = Math.PI * garisPelukisKTerpancung * (super.jari_jari + jari2);
        lLing2 = Math.PI * jari2 * jari2;
        
        luasPermukaanKTerpancung = Lingkaran.luasLingkaran + lSelimut + lLing2;
        return luasPermukaanKTerpancung;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Kerucut Terpancung Telah Selesai");
    }
}

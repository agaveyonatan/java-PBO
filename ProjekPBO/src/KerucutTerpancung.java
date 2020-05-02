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
    
    public double garisPelukisKTerpancung(){
        garisPelukisKTerpancung = Math.sqrt(pow(Math.abs(super.jari_jari - this.jari2), 2) + pow(super.tinggiD, 2));
        return garisPelukisKTerpancung; 
    }
    
    public double volumeKTerpancung(){
        volumeKTerpancung = 1.0/3.0*super.pi*super.tinggiD*(Math.pow(super.getJari(), 2) + this.jari2 * super.getJari() + Math.pow(this.jari2, 2));
        return volumeKTerpancung;
    }
    
    public double luasLingkaran2(){
        lLing2 = super.pi * this.jari2 * this.jari2;
        return lLing2;
    }
    
    public double luasSelimutKTerpancung(){
        lSelimut = super.pi * garisPelukisKTerpancung() * (super.jari_jari + this.jari2);
        return lSelimut;
    }

    public double luasPermukaanKTerpancung(){        
        luasPermukaanKTerpancung =  super.getLuasLingakaran() + luasSelimutKTerpancung() + luasLingkaran2();
        return luasPermukaanKTerpancung;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Kerucut Terpancung Telah Selesai");
    }
}

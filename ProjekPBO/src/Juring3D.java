import java.lang.Math; 

public class Juring3D extends Bola{
    private double luasPermukaan, volume; //encapsulation
    double sudut;
    double taliBusur;
    
    Juring3D(double jari, double sudut){
        super(jari);
        this.sudut = sudut;
        taliBusur = 2 * super.jari_jari * Math.sin(Math.toRadians(sudut / 2.0));
    }
    
    public double volume() {
        volume = 2/3.0 * super.pi * Math.pow(super.jari_jari, 3);
        return volume;
    }
    
    public double luasPermukaan() {
        luasPermukaan = (2 * super.pi * Math.pow(super.jari_jari, 2)) + (super.pi * super.jari_jari * taliBusur / 2.0);
        return luasPermukaan;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Juring 3D Telah Selesai");
    }
}

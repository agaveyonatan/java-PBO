import java.lang.Math; 

public class Juring3D extends Bola{
    private double luasPermukaanJ3D, volumeJ3D; //encapsulation
    public double sudut, taliBusur;
    
    public Juring3D(double jari, double sudut){
        super(jari);
        this.sudut = sudut;
        taliBusur = 2 * super.jari_jari * Math.sin(Math.toRadians(sudut / 2.0));
    }
    
    public double hitungVolumeJ3D() {
        volumeJ3D = 2/3.0 * Math.PI * Math.pow(super.jari_jari, 3);
        return volumeJ3D;
    }
    
    public double hitungLuasPermukaanJ3D() {
        luasPermukaanJ3D = (2 * Math.PI * super.jari_jari) + (Math.PI * taliBusur / 2.0);
        return luasPermukaanJ3D;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Juring 3D Telah Selesai");
    }
}

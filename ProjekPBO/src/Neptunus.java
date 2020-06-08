
import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Neptunus extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingNeptunus,kecRotasi,kecRevolusi,luasNeptunus,volumeNeptunus,pLintasanRevolusi ;
    Thread thread;
    RunThread rt ;

    public Neptunus(double jari, double linRevNeptunus, double lKalaRoNeptunus, double lKalaRevNeptunus, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevNeptunus ;
        this.kalaRotasi = lKalaRoNeptunus;
        this.kalaRevolusi = lKalaRevNeptunus;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahNeptunus() {
        kelilingNeptunus = 2 * Math.PI*super.jari_jari;
        return kelilingNeptunus ;
    }
    private double cariLuasPermukaanNeptunus () {
         luasNeptunus = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasNeptunus;
    }
    
    private double cariVolumeNeptunus () {
        volumeNeptunus = (double)4/3 * Math.PI * pow(super.jari_jari,3);
        return volumeNeptunus;
    }
    
    private double cariKecepatanRotasiNeptunus () {
        kecRotasi =  kelilingNeptunus/ kalaRotasi;
        return kecRotasi;
    }
    
    private double cariKecepatanRevolusiNeptunus () {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahNeptunus(){
        return cariKelilingGarisTengahNeptunus();
    }
    
    protected double getLuasPermukaanNeptunus () {
        return cariLuasPermukaanNeptunus();
    }
    
    protected double getVolumeNeptunus () {
        return cariVolumeNeptunus();
    }
    
    protected double getKecepatanRotasiNeptunus(){
        return cariKecepatanRotasiNeptunus();
    }
    
    protected double getKecepatanRevolusiNeptunus(){
        return cariKecepatanRevolusiNeptunus();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nNeptunus : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahNeptunus()+ ""
                    + "\n - Luas Permukaan : " + cariLuasPermukaanNeptunus()+ ""
                    + "\n - Volume : " +cariVolumeNeptunus()+ ""
                    + "\n - Kecepatan Rotasi : " + cariKecepatanRotasiNeptunus()+ ""
                    + "\n - Kecepatan Revolusi : " +cariKecepatanRevolusiNeptunus() );
        }
    }
    
}

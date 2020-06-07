
import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Uranus extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingUranus,kecRotasi,kecRevolusi,luasUranus,volumeUranus,pLintasanRevolusi ;
    Thread thread;
    RunThread rt ;

    public Uranus(double jari, double linRevUranus, double lKalaRoUranus, double lKalaRevUranus, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevUranus ;
        this.kalaRotasi = lKalaRoUranus;
        this.kalaRevolusi = lKalaRevUranus;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahUranus() {
        kelilingUranus = 2 * Math.PI*super.jari_jari;
        return kelilingUranus ;
    }
    private double cariLuasPermukaanUranus () {
         luasUranus = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasUranus;
    }
    
    private double cariVolumeUranus () {
        volumeUranus = (double)4/3 * Math.PI * pow(super.jari_jari,3);
        return volumeUranus;
    }
    
    private double cariKecepatanRotasiUranus () {
        kecRotasi =  kelilingUranus/ kalaRotasi;
        return kecRotasi;
    }
    
    private double cariKecepatanRevolusiUranus () {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahUranus(){
        return cariKelilingGarisTengahUranus();
    }
    
    protected double getLuasPermukaanUranus () {
        return cariLuasPermukaanUranus();
    }
    
    protected double getVolumeUranus () {
        return cariVolumeUranus();
    }
    
    protected double getKecepatanRotasiUranus(){
        return cariKecepatanRotasiUranus();
    }
    
    protected double getKecepatanRevolusiUranus(){
        return cariKecepatanRevolusiUranus();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nUranus : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahUranus()+ ""
                    + "\n - Luas Permukaan : " + cariLuasPermukaanUranus()+ ""
                    + "\n - Volume : " +cariVolumeUranus()+ ""
                    + "\n - Kecepatan Rotasi : " + cariKecepatanRotasiUranus()+ ""
                    + "\n - Kecepatan Revolusi : " +cariKecepatanRevolusiUranus() );
        }
    }
    
}

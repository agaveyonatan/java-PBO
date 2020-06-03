
import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Bumi extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingBumi,kecRotasi,kecRevolusi,luasBumi,volumeBumi,pLintasanRevolusi;
    Thread thread;
    RunThread rt ;

    public Bumi(double jari, double linRevBumi, double lKalaRoBumi, double lKalaRevBumi, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevBumi ;
        this.kalaRotasi = lKalaRoBumi;
        this.kalaRevolusi = lKalaRevBumi;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahBumi() {
        kelilingBumi = 2 * Math.PI*super.jari_jari;
        return kelilingBumi ;
    }
    private double cariLuasPermukaanBumi () {
         luasBumi = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasBumi;
    }
    
    private double cariVolumeBumi() {
        volumeBumi = (double)4/3 * Math.PI * pow(super.jari_jari,3);
        return volumeBumi;
    }
    
    private double cariKecepatanRotasiBumi () {
        kecRotasi =  kelilingBumi/ kalaRotasi;
        return kecRotasi;
    }
    
    private double cariKecepatanRevolusiBumi () {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahBumi(){
        return cariKelilingGarisTengahBumi();
    }
    
    protected double getLuasPermukaanBumi() {
        return cariLuasPermukaanBumi();
    }
    
    protected double getVolumeBumi () {
        return cariVolumeBumi();
    }
    
    protected double getKecepatanRotasiBumi(){
        return cariKecepatanRotasiBumi();
    }
    
    protected double getKecepatanRevolusiBumi(){
        return cariKecepatanRevolusiBumi();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nBumi : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahBumi()+ ""
                    + "\n - Luas Permukaan        : " + cariLuasPermukaanBumi()+ ""
                    + "\n - Volume                : " + cariVolumeBumi()+ ""
                    + "\n - Kecepatan Rotasi      : " + cariKecepatanRotasiBumi()+ ""
                    + "\n - Kecepatan Revolusi    : " + cariKecepatanRevolusiBumi() );
        }
    }
    
}


import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Saturnus extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingSaturnus,kecRotasi,kecRevolusi,luasSaturnus,volumeSaturnus,pLintasanRevolusi ;
    Thread thread;
    RunThread rt ;

    public Saturnus(double jari, double linRevSaturnus, double lKalaRoSaturnus, double lKalaRevSaturnus, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevSaturnus ;
        this.kalaRotasi = lKalaRoSaturnus;
        this.kalaRevolusi = lKalaRevSaturnus;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahSaturnus() {
        kelilingSaturnus = 2 * Math.PI*super.jari_jari;
        return kelilingSaturnus ;
    }
    private double cariLuasPermukaanSaturnus () {
         luasSaturnus = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasSaturnus;
    }
    
    private double cariVolumeSaturnus () {
        volumeSaturnus = (double)4/3 * Math.PI * pow(super.jari_jari,3);
        return volumeSaturnus;
    }
    
    private double cariKecepatanRotasiSaturnus () {
        kecRotasi =  kelilingSaturnus/ kalaRotasi;
        return kecRotasi;
    }
    
    private double cariKecepatanRevolusiSaturnus () {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahSaturnus(){
        return cariKelilingGarisTengahSaturnus();
    }
    
    protected double getLuasPermukaanSaturnus () {
        return cariLuasPermukaanSaturnus();
    }
    
    protected double getVolumeSaturnus () {
        return cariVolumeSaturnus();
    }
    
    protected double getKecepatanRotasiSaturnus(){
        return cariKecepatanRotasiSaturnus();
    }
    
    protected double getKecepatanRevolusiSaturnus(){
        return cariKecepatanRevolusiSaturnus();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nSaturnus : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahSaturnus()+ ""
                    + "\n - Luas Permukaan : " + cariLuasPermukaanSaturnus()+ ""
                    + "\n - Volume : " +cariVolumeSaturnus()+ ""
                    + "\n - Kecepatan Rotasi : " + cariKecepatanRotasiSaturnus()+ ""
                    + "\n - Kecepatan Revolusi : " +cariKecepatanRevolusiSaturnus() );
        }
    }
    
}

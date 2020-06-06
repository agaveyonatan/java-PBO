
import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Jupiter extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi;
    protected static double kelilingJupiter, kecRotasi, kecRevolusi, luasJupiter, volumeJupiter,pLintasanRevolusi;
    Thread thread;
    RunThread rt;

    public Jupiter(double jari, double linRevJupiter, double lKalaRoJupiter, double lKalaRevJupiter, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevJupiter ;
        this.kalaRotasi = lKalaRoJupiter;
        this.kalaRevolusi = lKalaRevJupiter;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahJupiter() {
        kelilingJupiter = 2* Math.PI*super.jari_jari;
        return kelilingJupiter ;
    }

    private double cariLuasPermukaanJupiter() {
         luasJupiter = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasJupiter;
    }

    private double cariVolumeJupiter() {
        volumeJupiter = (double) 4 / 3 * Math.PI * pow(super.jari_jari, 3);
        return volumeJupiter;
    }

    private double cariKecepatanRotasiJupiter() {
        kecRotasi = kelilingJupiter / kalaRotasi;
        return kecRotasi;
    }

    private double cariKecepatanRevolusiJupiter() {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }

    protected double getKelilingGarisTengahJupiter() {
        return cariKelilingGarisTengahJupiter();
    }

    protected double getLuasPermukaanJupiter() {
        return cariLuasPermukaanJupiter();
    }

    protected double getVolumeJupiter() {
        return cariVolumeJupiter();
    }

    protected double getKecepatanRotasiJupiter() {
        return cariKecepatanRotasiJupiter();
    }

    protected double getKecepatanRevolusiJupiter() {
        return cariKecepatanRevolusiJupiter();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nJupiter : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahJupiter()+ ""
                    + "\n - Luas Permukaan        : " + cariLuasPermukaanJupiter()+ ""
                    + "\n - Volume                : " + cariVolumeJupiter()+ ""
                    + "\n - Kecepatan Rotasi      : " + cariKecepatanRotasiJupiter()+ ""
                    + "\n - Kecepatan Revolusi    : " + cariKecepatanRevolusiJupiter() );
        }
    }
    
}

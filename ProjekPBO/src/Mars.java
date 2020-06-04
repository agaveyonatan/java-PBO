
import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Mars extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingMars,kecRotasi,kecRevolusi,luasMars,volumeMars,pLintasanRevolusi;
    Thread thread;
    RunThread rt ;

    public Mars(double jari, double linRevMars, double lKalaRoMars, double lKalaRevMars, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevMars ;
        this.kalaRotasi = lKalaRoMars;
        this.kalaRevolusi = lKalaRevMars;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
       private double cariKelilingGarisTengahMars() {
        kelilingMars = 2 * Math.PI * super.jari_jari;
        return kelilingMars;
    }

    private double cariLuasPermukaanMars() {
        luasMars = 4 * Math.PI * pow(super.jari_jari, 2);
        return luasMars;
    }

    private double cariVolumeMars() {
        volumeMars = (double) 4 / 3 * Math.PI * pow(super.jari_jari, 3);
        return volumeMars;
    }

    private double cariKecepatanRotasiMars() {
        kecRotasi = kelilingMars / kalaRotasi;
        return kecRotasi;
    }

    private double cariKecepatanRevolusiMars() {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahMars() {
        return cariKelilingGarisTengahMars();
    }

    protected double getLuasPermukaanMars() {
        return cariLuasPermukaanMars();
    }

    protected double getVolumeMars() {
        return cariVolumeMars();
    }

    protected double getKecepatanRotasiMars() {
        return cariKecepatanRotasiMars();
    }

    protected double getKecepatanRevolusiMars() {
        return cariKecepatanRevolusiMars();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nMars : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahMars()+ ""
                    + "\n - Luas Permukaan        : " + cariLuasPermukaanMars()+ ""
                    + "\n - Volume                : " + cariVolumeMars()+ ""
                    + "\n - Kecepatan Rotasi      : " + cariKecepatanRotasiMars()+ ""
                    + "\n - Kecepatan Revolusi    : " + cariKecepatanRevolusiMars() );
        }
    }
    
}

import static java.lang.Math.pow;
/**
 *
 * @author Agave-PC
 */
public class Venus extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingVenus,kecRotasi,kecRevolusi,luasVenus,volumeVenus,pLintasanRevolusi ;
    Thread thread;
    RunThread rt ;

    public Venus(double jari, double linRevVenus, double lKalaRoVenus, double lKalaRevVenus, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevVenus ;
        this.kalaRotasi = lKalaRoVenus;
        this.kalaRevolusi = lKalaRevVenus;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahVenus() {
        kelilingVenus = 2*Math.PI*super.jari_jari;
        return kelilingVenus ;
    }
    private double cariLuasPermukaanVenus () {
         luasVenus = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasVenus;
    }
    
    private double cariVolumeVenus() {
        volumeVenus = (double)4/3 * Math.PI * pow(super.jari_jari,3);
        return volumeVenus;
    }
    
    private double cariKecepatanRotasiVenus () {
        kecRotasi = kelilingVenus / kalaRotasi;
        return kecRotasi;
    }
    
    private double cariKecepatanRevolusiVenus () {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahVenus(){
        return cariKelilingGarisTengahVenus();
    }
    
    protected double getLuasPermukaanVenus () {
        return cariLuasPermukaanVenus();
    }
    
    protected double getVolumeVenus () {
        return cariVolumeVenus();
    }
    
    protected double getKecepatanRotasiVenus(){
        return cariKecepatanRotasiVenus();
    }
    
    protected double getKecepatanRevolusiVenus(){
        return cariKecepatanRevolusiVenus();
    }
    
    @Override
   public void run() {
        synchronized(rt){
             RunThread.print("\nVenus : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahVenus()+ ""
                    + "\n - Luas Permukaan        : " + cariLuasPermukaanVenus()+ ""
                    + "\n - Volume                : " + cariVolumeVenus()+ ""
                    + "\n - Kecepatan Rotasi      : " + cariKecepatanRotasiVenus()+ ""
                    + "\n - Kecepatan Revolusi    : " + cariKecepatanRevolusiVenus() );
        }
    }
}

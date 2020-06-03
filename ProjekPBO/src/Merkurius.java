import static java.lang.Math.pow;

/**
 *
 * @author Agave-PC
 */
public class Merkurius extends Bola implements Runnable {
    protected double  kalaRotasi, kalaRevolusi; 
    protected static double kelilingMerkurius,kecRotasi,kecRevolusi,luasMerkurius,volumeMerkurius,pLintasanRevolusi ;
    Thread thread;
    RunThread rt ;

    public Merkurius(double jari, double linRevMerkurius, double lKalaRoMerkurius, double lKalaRevMerkurius, RunThread rt) {
        super(jari);
        this.pLintasanRevolusi = linRevMerkurius ;
        this.kalaRotasi = lKalaRoMerkurius;
        this.kalaRevolusi = lKalaRevMerkurius;
        this.rt = rt ;
        thread = new Thread(this);
    }
    
    private double cariKelilingGarisTengahMerkurius() {
        kelilingMerkurius = 2 * Math.PI*super.jari_jari;
        return kelilingMerkurius ;
    }
    private double cariLuasPermukaanMerkurius () {
         luasMerkurius = 4 * Math.PI* pow(super.jari_jari,2) ;
         return luasMerkurius;
    }
    
    private double cariVolumeMerkurius () {
        volumeMerkurius = (double)4/3 * Math.PI * pow(super.jari_jari,3);
        return volumeMerkurius;
    }
    
    private double cariKecepatanRotasiMerkurius () {
        kecRotasi =  kelilingMerkurius/ kalaRotasi;
        return kecRotasi;
    }
    
    private double cariKecepatanRevolusiMerkurius () {
        kecRevolusi = pLintasanRevolusi / kalaRevolusi;
        return kecRevolusi;
    }
    
    protected double getKelilingGarisTengahMerkurius(){
        return cariKelilingGarisTengahMerkurius();
    }
    
    protected double getLuasPermukaanMerkurius () {
        return cariLuasPermukaanMerkurius();
    }
    
    protected double getVolumeMerkurius () {
        return cariVolumeMerkurius();
    }
    
    protected double getKecepatanRotasiMerkurius(){
        return cariKecepatanRotasiMerkurius();
    }
    
    protected double getKecepatanRevolusiMerkurius(){
        return cariKecepatanRevolusiMerkurius();
    }

    @Override
    public void run() {
        synchronized(rt){
             RunThread.print("\nMerkurius : ", ""
                    + "\n - Keliling garis tengah : " + cariKelilingGarisTengahMerkurius()+ ""
                    + "\n - Luas Permukaan        : " + cariLuasPermukaanMerkurius()+ ""
                    + "\n - Volume                : " + cariVolumeMerkurius()+ ""
                    + "\n - Kecepatan Rotasi      : " + cariKecepatanRotasiMerkurius()+ ""
                    + "\n - Kecepatan Revolusi    : " + cariKecepatanRevolusiMerkurius() );
        }
    }
    
}

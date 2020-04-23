/**
 *
 * @author Agave-PC
 */
public class Juring extends Lingkaran {
    double luas;
    double sdt;
    double volume;
    
    Juring(double jari){
        super(jari);
    }
    
    @Override
     double luasLingkaran(){
        return super.luas;
    }
     
    double luas(double sudut){
        sdt = sudut;
        luas = sdt/360.0 * luasLingkaran();
        return luas;
    }

    double volume(double sudut, double jari) {
        sdt = sudut;
        volume = 2*jari + sdt/360 * 2*pi*jari;
        return volume;
    }
}

/**
 *
 * @author Agave-PC
 */
public class LimasJajarGenjang extends JajarGenjang {
    double tinggiD;
    private double volume;
    
    LimasJajarGenjang(double alas, double tinggi){
        super(alas, tinggi);
    }
    
    @Override
    double luasJajarGenjang(){
        return super.luas;
    }
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = 1.0/3.0 * luasJajarGenjang() * tinggiD;
        return volume;
    }
}

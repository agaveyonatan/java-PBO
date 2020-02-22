/**
 *
 * @author Agave-PC
 */
public class PrismaJajarGenjang extends JajarGenjang{
    double tinggiD; 
    private double volume;
    
    PrismaJajarGenjang(double alas, double tinggi){
        super(alas, tinggi);
    }
    
    @Override
    double luasJajarGenjang(){
        return super.luas;
    }
    
    double volume(double tinggiDimensi){
        tinggiD = tinggiDimensi;
        volume = luasJajarGenjang()*tinggiD;
        return volume;
    }
}

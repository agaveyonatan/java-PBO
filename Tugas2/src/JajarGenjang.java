/**
 *
 * @author Agave-PC
 */
public class JajarGenjang {
    double alasDouble, tinggiDouble;
    int alasInteger, tinggiInteger;
    static double luas;
    
    JajarGenjang(double alas, double tinggi){
        alasDouble = alas;
        tinggiDouble = tinggi;
    }
    
    double luasJajarGenjang(){
        luas = alasDouble * tinggiDouble;
        return luas;
    }
    
    int luasJajarGenjang(int alas, int tinggi){
        alasInteger = alas;
        tinggiInteger = tinggi;
        luas = alasInteger * tinggiInteger;
        return (int)luas;
    }
}

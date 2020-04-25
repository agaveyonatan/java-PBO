public class Busur extends Lingkaran{
    double panjangBusur;
    double sdt;
    
    Busur(double jari){
        super(jari);
    }
    
    @Override
    double luasLingkaran(){
        return super.luas;
    }
    
    double panjangBusur (double sudut) {
        sdt = sudut;
        panjangBusur = 2 * super.pi * super.jari_jari * (sdt/360.0);
        return panjangBusur;
    }
}

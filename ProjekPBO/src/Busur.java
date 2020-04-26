public class Busur extends Lingkaran{
    double panjangBusur;
    double sdt;
    
    Busur(double jari, double sudut){
        super(jari);
        sdt = sudut;
    }
    
    @Override
    double luasLingkaran1(){
        return super.luas;
    }
    
    public double panjangBusur(){
        panjangBusur = 2 * super.pi * super.jari_jari * (sdt/360.0);
        return panjangBusur;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Busur Telah Selesai");
    }
}

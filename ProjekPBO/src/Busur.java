public class Busur extends Lingkaran{
    protected double panjangBusur, sdt; //encapsulation
    
    public Busur(double jari, double sudut){
        super(jari);
        sdt = sudut;
    }
    
//    @Override
//    public double hitungLuasLingkaran(){
//        return super.luasLingkaran;
//    }
    
    public double hitungPanjangBusur(){
        panjangBusur = Lingkaran.kelilingLingkaran * (sdt/360.0);
        return panjangBusur;
    }
    
    public void end(){
        System.out.println("\nProses Perhitungan Busur Telah Selesai");
    }
}

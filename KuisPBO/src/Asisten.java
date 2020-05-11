/**
 *
 * @author Agave-PC
 */
public class Asisten implements Keterangan{
    protected double nilaiTulis, nilaiCoding, nilaiWawancara, nilaiMicro, hasil;
    protected String nim, nama, keputusan;
    
    public Asisten(String nim, String nama, double tulis, double coding, double wawancara, double micro){
        this.nim = nim;
        this.nama = nama;
        nilaiTulis = tulis;
        nilaiCoding = coding;
        nilaiWawancara = wawancara;
        nilaiMicro = micro;
    }
    
    public double hitungHasil(){
        hasil = (nilaiTulis + nilaiCoding + nilaiWawancara + nilaiMicro)/4.0;
        return hasil;
    }

    @Override
    public String keputusan() {
        if(hasil <= 85){
            keputusan = nama + " dengan NIM : " + nim + " dinyatakan GAGAL seleksi Asisten Lab";
            return keputusan;
        }
        else{
            keputusan = nama + " dengan NIM : " + nim + " dinyatakan LULUS seleksi Asisten Lab";
            return keputusan;
        }
    }
    
    
}

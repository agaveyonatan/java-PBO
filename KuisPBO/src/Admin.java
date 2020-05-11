/**
 *
 * @author Agave-PC
 */
public class Admin implements Keterangan{
    protected double nilaiTulis, nilaiCoding, nilaiWawancara, nilaiJaringan, hasil;
    protected String nim, nama, keputusan;
    
    public Admin(String nim, String nama, double tulis, double coding, double wawancara, double jaringan){
        this.nim = nim;
        this.nama = nama;
        nilaiTulis = tulis;
        nilaiCoding = coding;
        nilaiWawancara = wawancara;
        nilaiJaringan = jaringan;
    }
    
    public double hitungHasil(){
        hasil = (nilaiTulis + nilaiCoding + nilaiWawancara + nilaiJaringan)/4.0;
        return hasil;
    }

    @Override
    public String keputusan() {
        if(hasil <= 85){
            keputusan = nama + " dengan NIM : " + nim + " dinyatakan GAGAL seleksi Admin Lab";
            return keputusan;
        }
        else{
            keputusan = nama + " dengan NIM : " + nim + " dinyatakan LULUS seleksi Admin Lab";
            return keputusan;
        }
    }
    
    
}

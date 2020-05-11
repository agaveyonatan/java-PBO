/**
 *
 * @author Agave-PC
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pilihan, jumlah;
        double tulis, coding, wawancara;
        String nama, nim;
        
        do{
            System.out.println("\nPILIHAN PROGRAM");
            System.out.println("1. Asisten Laboratorium");
            System.out.println("2. Admin Laboratorium");
            System.out.println("3. Exit Program");
            System.out.print("Pilih program :");
            pilihan = input.nextByte();
            
            if(pilihan==1){
                double micro;
                
                System.out.println("\nFORM PENDAFTARAN ASISTEN LABORATORIUM");
                System.out.print("Banyak Data : ");
                jumlah = input.nextByte();
                try{
                    if(jumlah <= 0){
                        throw new RuntimeException("Pengisian Jumlah Data <=0");
                    }
                    for(int i = 1; i <= jumlah; i++){
                        System.out.println("\nPendaftar Asisten ke-["+i+"]");
                        System.out.print("NIM Mahasiswa           : ");
                        input.nextLine();
                        nim = input.nextLine();
                        System.out.print("Nama Mahasiswa          : ");
                        nama = input.nextLine();
                        System.out.print("Nilai Tes Tulis         : ");
                        tulis = input.nextDouble();
                        System.out.print("Nilai Tes Coding        : ");
                        coding = input.nextDouble();
                        System.out.print("Nilai Tes Wawancara     : ");
                        wawancara = input.nextDouble();
                        System.out.print("Nilai Tes Microteaching : ");
                        micro = input.nextDouble();
                        
                        Asisten as = new Asisten(nim, nama, tulis, coding, wawancara, micro);
                        
                        System.out.println("Hasil Perhitungan Nilai = " + as.hitungHasil());
                        System.out.println("Keputusan               = " + as.keputusan());
                    }
                }catch(RuntimeException exc){
                    System.err.println("\nException : " + exc);
                }  
            }
            else if(pilihan==2){
                double jaringan;
                
                System.out.println("\nFORM PENDAFTARAN ADMIN LABORATORIUM");
                System.out.print("Banyak Data : ");
                jumlah = input.nextByte();
                try{
                    if(jumlah <= 0){
                        throw new RuntimeException("Pengisian Jumlah Data <=0");
                    }
                    for(int i = 1; i <= jumlah; i++){
                        System.out.println("\nPendaftar Admin ke-["+i+"]");
                        System.out.print("NIM Mahasiswa              : ");
                        input.nextLine();
                        nim = input.nextLine();
                        System.out.print("Nama Mahasiswa             : ");
                        nama = input.nextLine();
                        System.out.print("Nilai Tes Tulis            : ");
                        tulis = input.nextDouble();
                        System.out.print("Nilai Tes Coding           : ");
                        coding = input.nextDouble();
                        System.out.print("Nilai Tes Wawancara        : ");
                        wawancara = input.nextDouble();
                        System.out.print("Nilai Tes Praktek Jaringan : ");
                        jaringan = input.nextDouble();
                        
                        Admin adm = new Admin(nim, nama, tulis, coding, wawancara, jaringan);
                        
                        System.out.println("Hasil Perhitungan Nilai    = " + adm.hitungHasil());
                        System.out.println("Keputusan                  = " + adm.keputusan());
                    }
                }catch(RuntimeException ex){
                    System.err.println("\nException : " + ex);
                }  
            }
            else if(pilihan==3){
                System.out.println("\nProgram Selesai");
            }
            else{
                System.out.println("\nPilihan Program Tidak Tersedia!");
            }
        }while(pilihan!=3);
    }    
}

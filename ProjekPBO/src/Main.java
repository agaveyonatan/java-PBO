/**
 *
 * @author Agave-PC
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Lingkaran a = new Lingkaran(); //polymorph
//        Lingkaran b = new Tabung(); //polymorph
        
        Scanner input = new Scanner(System.in);
        byte pilihan, pil2;
            System.out.println("||========================||");
            System.out.println("||Lingkaran dan Turunannya||");
            System.out.println("||========================||");
                double jari, tinggiDimensi, apotema, sudut, jari2;
                
              
                
                System.out.println("\n=========");
                System.out.println("Lingkaran");
                System.out.println("=========");
                
                System.out.print("\nPanjang Jari-Jari : ");
                jari = input.nextDouble();
                
                System.out.println("\nLuas Lingkaran : ");
                Lingkaran ling = new Lingkaran(jari);
                System.out.println("Hasil Berkoma = " + ling.luasLingkaran());
                System.out.println("Hasil Bulat   = " + ling.luasLingkaran((int)jari));
                do{
                    System.out.println("\nPilihan Class Level 2 : ");
                    System.out.println("1. Tembereng2D, Juring2D, Busur, Bola");
                    System.out.println("2. Kerucut");
                    System.out.println("3. Tabung");
                    System.out.print("Input Pilihan : ");
                    pilihan = input.nextByte();
                    
                    if(pilihan==1){
                        System.out.println("==================================");
                        System.out.println("Tembereng2D, Juring2D, Busur, Bola");
                        System.out.println("==================================");
                        do{
                            System.out.println("\nPilihan: ");
                            System.out.println("1. Tembereng");
                            System.out.println("2. Juring");
                            System.out.println("3. Busur");
                            System.out.println("4. Bola");
                            System.out.print("Input Pilihan : ");
                            pil2 = input.nextByte();
                            if(pil2==1){
                                System.out.println("\n============");
                                System.out.println("Tembereng 2D");
                                System.out.println("============");
                                System.out.print("Besar Sudut : ");
                                sudut = input.nextDouble();
                                Tembereng2D tembereng2D = new Tembereng2D(jari);
                                System.out.println("Luas Tembereng 2D     = " + tembereng2D.luas(sudut));
                                System.out.println("Keliling Tembereng 2D = " + tembereng2D.keliling(sudut));
                                
//                                System.out.println("\n============");
//                                System.out.println("Tembereng 3D");
//                                System.out.println("============");
                            }
                            else if(pil2==2){
                                System.out.println("\n=========");
                                System.out.println("Juring 2D");
                                System.out.println("=========");
                                System.out.print("Besar Sudut : ");
                                sudut = input.nextDouble();
                                Juring2D jring2D = new Juring2D(jari);
                                System.out.println("Luas Juring 2D     = " + jring2D.luas(sudut));
                                System.out.println("Keliling Juring 2D = " + jring2D.keliling(sudut));
                                
//                                System.out.println("\n=========");
//                                System.out.println("Juring 3D");
//                                System.out.println("=========");
                            }
                            else if(pil2==3){
                                System.out.println("\n=====");
                                System.out.println("Busur");
                                System.out.println("=====");
                                System.out.print("Besar Sudut : ");
                                sudut = input.nextDouble();
                                Busur pb = new Busur(jari);
                                System.out.println("Panjang Busur Lingkaran = " + pb.panjangBusur(sudut));
                            }
                            else if(pil2==4){
                                System.out.println("\n====");
                                System.out.println("Bola");
                                System.out.println("====");
                                Bola bla = new Bola(jari);
                                System.out.println("Volume Bola         = " + bla.volume());
                                System.out.println("Luas Permukaan Bola = " + bla.luasPermukaan(jari));
                            }
                            else{
                                System.out.println("Pilihan Tidak Tersedia!");
                            }
                        }while(pil2!=4);
                    }
                    else if(pilihan==2){
                        System.out.println("\n=======");
                        System.out.println("Kerucut");
                        System.out.println("=======");
                        System.out.print("Tinggi Dimensi : ");
                        tinggiDimensi = input.nextDouble();
                        Kerucut krct = new Kerucut(jari);
                        System.out.println("Volume Kerucut = " + krct.volume(tinggiDimensi));
                        System.out.println("\nCari Luas Permukaan Kerucut");
                        System.out.print("Apotema(s): ");
                        apotema = input.nextDouble();
                        System.out.println("Luas Permukaan Kerucut = " + krct.luasPermukaan(jari, apotema));
                        
//                        System.out.println("\n==================");
//                        System.out.println("Kerucut Terpancung");
//                        System.out.println("==================");
//                        System.out.print("Input r2 : ");
//                        jari2 = input.nextDouble();
//                        KerucutTerpancung kt = new KerucutTerpancung(jari, apotema);
//                        System.out.println("Luas Permukaan Kerucut Terpancung ="+ kt.luasPermukaan(jari, apotema, jari2));
                    }
                    else if(pilihan==3){
                        System.out.println("\n======");
                        System.out.println("Tabung");
                        System.out.println("======");
                        System.out.print("Tinggi Dimensi : ");
                        tinggiDimensi = input.nextDouble();
                        Tabung tbg = new Tabung(jari);
                        System.out.println("Volume Tabung         = " + tbg.volumeTabung(tinggiDimensi));
                        System.out.println("Luas Permukaan Tabung = " + tbg.luasPermukaanTabung(tinggiDimensi, jari));
                    }
                    else{
                        System.out.println("Pilihan Tidak Tersedia!");
                    }
                }while(pilihan!=3); 
    }
}
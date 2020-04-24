import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pilihan, pil2;
            System.out.println("Lingkaran dan Turunannya");
                double jari, tinggiDimensi, apotema, sudut;
                
                System.out.println("\nLuas Lingkaran");
                
                System.out.println("\nPanjang Jari-Jari: ");
                jari = input.nextDouble();
                
                System.out.println("\nLuas Lingkaran:");
                Lingkaran ling = new Lingkaran(jari);
                System.out.println("Hasil Berkoma :" + ling.luasLingkaran());
                System.out.println("Hasil Bulat :" + ling.luasLingkaran((int)jari));
                do{
                    System.out.println("\nPilihan: ");
                    System.out.println("1. Tembereng2D, Juring2D, Busur, Bola");
                    System.out.println("2. Kerucut");
                    System.out.println("3. Tabung");
                    System.out.println("Input Pilihan: ");
                    pilihan = input.nextByte();
                    
                    if(pilihan==1){
                        System.out.println("\nTembereng2D, Juring2D, Busur, Bola");
                        do{
                            System.out.println("\nPilihan: ");
                            System.out.println("1. Tembereng2D");
                            System.out.println("2. Juring2D");
                            System.out.println("3. Busur");
                            System.out.println("4. Bola");
                            pil2 = input.nextByte();
                            if(pil2==1){
                                System.out.println("\nTembereng 2D");
                                System.out.println("Besar Sudut:");
                                sudut = input.nextDouble();
                                Tembereng2D tembereng2D = new Tembereng2D(jari);
                                System.out.println("Luas Tembereng 2D :" + tembereng2D.luas(sudut));
                                System.out.println("Keliling Tembereng 2D :" + tembereng2D.keliling(sudut));
                            }
                            else if(pil2==2){
                                System.out.println("\nJuring 2D");
                                System.out.println("Besar Sudut:");
                                sudut = input.nextDouble();
                                Juring2D jring2D = new Juring2D(jari);
                                System.out.println("Luas Juring 2D :" + jring2D.luas(sudut));
                                System.out.println("Keliling Juring 2D :" + jring2D.keliling(sudut));
                            }
                            else if(pil2==3){
                                
                            }
                            else if(pil2==4){
                                System.out.println("\nBola");
                                Bola bla = new Bola(jari);
                                System.out.println("Volume Bola :" + bla.volume());
                                System.out.println("Luas Permukaan Bola :" + bla.luasPermukaan(jari));
                            }
                            else{
                                System.out.println("Pilihan Tidak Tersedia");
                            }
                        }while(pil2!=4);
                    }
                    else if(pilihan==2){
                        System.out.println("\nKerucut");         
                        System.out.println("Tinggi Dimensi :");
                        tinggiDimensi = input.nextDouble();
                        Kerucut krct = new Kerucut(jari);
                        System.out.println("Volume Kerucut : " + krct.volume(tinggiDimensi));
                        System.out.println("Apotema(s):");
                        apotema = input.nextDouble();
                        System.out.println("Luas Permukaan Kerucut : " + krct.luasPermukaan(jari, apotema));
                    }
                    else if(pilihan==3){
                        System.out.println("\nTabung");
                        System.out.println("Tinggi Dimensi :");
                        tinggiDimensi = input.nextDouble();
                        Tabung tbg = new Tabung(jari);
                        System.out.println("Volume Tabung : " + tbg.volume(tinggiDimensi));
                        System.out.println("Luas Permukaan Tabung : " + tbg.luasPermukaan(tinggiDimensi, jari));
                    }
                    else{
                        System.out.println("Pilihan Tidak Tersedia");
                    }
                }while(pilihan!=3);
    }
}
 /**
 *
 * @author Agave-PC
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {        
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
                try{
                    if (jari <= 0) {
                        throw new RuntimeException("Pengisian Jari-jari Lingkaran <=0");
                    }
                    System.out.println("\nLuas Lingkaran : ");
                    Lingkaran ling = new Lingkaran(jari);
                    Lingkaran li = new Lingkaran(jari); //polimorph
                    
                    System.out.println("Hasil Berkoma = " + ling.luasLingkaran1());
                    System.out.println("Hasil Bulat   = " + ling.luasLingkaran2());
                    li.end();
                    do{
                        System.out.println("\nPilihan Class Level 2 : ");
                        System.out.println("1. Tembereng, Juring, Busur, Bola");
                        System.out.println("2. Kerucut");
                        System.out.println("3. Tabung");
                        System.out.print("Input Pilihan : ");
                        pilihan = input.nextByte();

                        if(pilihan==1){
                            System.out.println("==============================");
                            System.out.println("Tembereng, Juring, Busur, Bola");
                            System.out.println("==============================");
                            do{
                                System.out.println("\nPilihan: ");
                                System.out.println("1. Tembereng");
                                System.out.println("2. Juring");
                                System.out.println("3. Busur");
                                System.out.println("4. Bola");
                                System.out.print("Input Pilihan : ");
                                pil2 = input.nextByte();
                                if(pil2==1){
                                    System.out.println("\n=========");
                                    System.out.println("Tembereng");
                                    System.out.println("=========");
                                    System.out.print("Besar Sudut : ");
                                    sudut = input.nextDouble();
                                    System.out.print("Besar Tinggi : ");
                                    tinggiDimensi = input.nextDouble();
                                    try{
                                        if (sudut <= 0 || tinggiDimensi <= 0) {
                                            throw new RuntimeException("Pengisian Besar Sudut atau Besar Tinggi <=0");
                                        }
                                        System.out.println("\n============");
                                        System.out.println("Tembereng 2D");
                                        System.out.println("============");
                                        
                                        Tembereng2D tembereng2D = new Tembereng2D(jari, sudut);
                                        Lingkaran tmbrng2D = new Tembereng2D(jari, sudut); //polimorph
                                        
                                        System.out.println("Luas Tembereng 2D     = " + tembereng2D.luas());
                                        System.out.println("Keliling Tembereng 2D = " + tembereng2D.keliling());
                                        tmbrng2D.end(); //polimorph
                                        try{
                                            if(tinggiDimensi > jari){
                                                throw new RuntimeException("Tinggi Dimensi > Jari-jari");
                                            }
                                            System.out.println("\n============");
                                            System.out.println("Tembereng 3D");
                                            System.out.println("============");

                                            Tembereng3D tembereng3D = new Tembereng3D(jari, tinggiDimensi);
                                            Lingkaran tmbrng3D = new Tembereng3D(jari, tinggiDimensi); //polimorph

                                            System.out.println("Luas Permukaan Tembereng 3D = " + tembereng3D.luasPermukaan());
                                            System.out.println("Volume Tembereng 3D =       = " + tembereng3D.volume());
                                            tmbrng3D.end(); //polimorph
                                        }
                                        catch (Exception ex){
                                            System.err.println("\nException : " + ex);
                                        }
                                        
                                    }
                                    catch (Exception ex){
                                        System.err.println("\nException : " + ex);
                                    }
                                }
                                else if(pil2==2){ 
                                    System.out.println("\n======");
                                    System.out.println("Juring");
                                    System.out.println("======");
                                    System.out.print("Besar Sudut : ");
                                    sudut = input.nextDouble();
                                    try{
                                        if (sudut <= 0) {
                                            throw new RuntimeException("Pengisian Besar Sudut <=0");
                                        }
                                        System.out.println("\n=========");
                                        System.out.println("Juring 2D");
                                        System.out.println("=========");
                                        
                                        Juring2D juring2D = new Juring2D(jari, sudut);
                                        Lingkaran jring2D = new Juring2D(jari, sudut); //polimorph
                                        
                                        System.out.println("Luas Juring 2D     = " + juring2D.luas());
                                        System.out.println("Keliling Juring 2D = " + juring2D.keliling());
                                         jring2D.end(); //polimorph
                                         
                                        System.out.println("\n=========");
                                        System.out.println("Juring 3D");
                                        System.out.println("=========");
                                        
                                        Juring3D juring3D = new Juring3D(jari, sudut);
                                        Lingkaran jring3D = new Juring3D(jari, sudut); //polimorph
                                        
                                        System.out.println("Luas Permukaan Juring 3D = " + juring3D.luasPermukaan());
                                        System.out.println("Volume Juring 3D         = " + juring3D.volume());
                                        jring3D.end(); //polimorph
                                        
                                    }
                                    catch (Exception ex){
                                        System.err.println("\nException : " + ex);
                                    }
                                }
                                else if(pil2==3){
                                    System.out.println("\n=====");
                                    System.out.println("Busur");
                                    System.out.println("=====");
                                    System.out.print("Besar Sudut : ");
                                    sudut = input.nextDouble();
                                    try{
                                        if (sudut <= 0) {
                                            throw new RuntimeException("Pengisian Besar Sudut <=0");
                                        }
                                        Busur pb = new Busur(jari, sudut);
                                        Lingkaran bsr = new Busur(jari, sudut);//polimorph
                                        
                                        System.out.println("Panjang Busur Lingkaran = " + pb.panjangBusur());
                                        bsr.end(); //polimorph
                                    }
                                    catch (Exception ex){
                                        System.err.println("\nException : " + ex);
                                    }
                                }
                                else if(pil2==4){
                                    System.out.println("\n====");
                                    System.out.println("Bola");
                                    System.out.println("====");
                                    Bola bla = new Bola(jari);
                                    Lingkaran ball = new Bola(jari); //polimorph
                                    
                                    System.out.println("Volume Bola         = " + bla.volume());
                                    System.out.println("Luas Permukaan Bola = " + bla.luasPermukaan());
                                    ball.end(); //polimorph
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
                            System.out.print("Apotema(s)     : ");
                            apotema = input.nextDouble();
                            System.out.print("Input r2       : ");
                            jari2 = input.nextDouble();
                            try{
                                if (tinggiDimensi <= 0 || apotema <= 0 || jari2 <= 0) {
                                    throw new RuntimeException("Pengisian Tinggi Dimensi atau Apotema Kerucut <=0");
                                }
                                Kerucut krct = new Kerucut(jari);
                                Lingkaran krc = new Kerucut(jari); //polimorph
                                
                                System.out.println("\nVolume Kerucut         = " + krct.volume(tinggiDimensi));
                                System.out.println("Luas Permukaan Kerucut = " + krct.luasPermukaan(jari, apotema));
                                krc.end(); //polimorph
                                
                                System.out.println("\n==================");
                                System.out.println("Kerucut Terpancung");
                                System.out.println("==================");
                                KerucutTerpancung kt = new KerucutTerpancung(jari, apotema);
                                KerucutTerpancung kterpancung = new KerucutTerpancung(jari, apotema); //polimorph
                                
                                System.out.println("Luas Permukaan Kerucut Terpancung ="+ kt.luasPermukaan(jari2));
                                System.out.println("Volume Kerucut Terpancung         ="+ kt.volume(tinggiDimensi));
                                kterpancung.end(); //polimorph
                            }
                            catch (Exception ex){
                                System.err.println("\nException : " + ex);
                            }
                        }
                        else if(pilihan==3){
                            System.out.println("\n======");
                            System.out.println("Tabung");
                            System.out.println("======");
                            System.out.print("Tinggi Dimensi : ");
                            tinggiDimensi = input.nextDouble();
                            try{
                                if (tinggiDimensi <= 0) {
                                    throw new RuntimeException("Pengisian Tinggi Dimensi Tabung <=0");
                                }
                                Tabung tbg = new Tabung(jari, tinggiDimensi);
                                Lingkaran tbung = new Tabung(jari, tinggiDimensi); //polimorph
                                                                
                                System.out.println("Volume Tabung         = " + tbg.volumeTabung());
                                System.out.println("Luas Permukaan Tabung = " + tbg.luasPermukaanTabung());
                                tbung.end(); //polimorph
                            }
                            catch (Exception ex){
                                System.err.println("\nException : " + ex);
                            }  
                        }
                        else{
                            System.out.println("Pilihan Tidak Tersedia!");
                        }
                    }while(pilihan!=3); 
                }
                catch (Exception ex){
                    System.err.println("\nException : " + ex);
                }  
    }
}
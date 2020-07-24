 /**
 *
 * @author Agave-PC
 */
import java.util.*;
import javax.swing.JFrame;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {     
        RunThread rt = new RunThread();
        Scanner input = new Scanner(System.in);
        byte pilihan, pil2, pilpro;
        do{
            System.out.println("\n===============");
            System.out.println("Pilihan Program");
            System.out.println("===============");
            System.out.println("1. Lingkaran dan Turunannya");
            System.out.println("2. Planet Angkasa");
            System.out.println("3. Exit");
            System.out.print("Input Pilihan :");
            pilpro = input.nextByte();
             
            if(pilpro==1){
                System.out.println("||========================||");
                System.out.println("||Lingkaran dan Turunannya||");
                System.out.println("||========================||");
                double jari, tinggiDimensi, sudut, jari2;
                
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
                    
                    System.out.println("Hasil Berkoma = " + ling.hitungLuasLingkaran());
                    System.out.println("Hasil Bulat   = " + ling.hitungLuasLingkaran((int)jari));
                    System.out.println("Keliling Lingkaran =" + ling.hitungKelilingLingkaran());
                    li.end();
                    do{
                        System.out.println("\nPilihan Class Level 2 : ");
                        System.out.println("1. Tembereng, Juring, Busur, Bola");
                        System.out.println("2. Kerucut");
                        System.out.println("3. Tabung");
                        System.out.println("4. Exit");
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
                                System.out.println("5. Kembali");
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
                                        
                                        System.out.println("Luas Tembereng 2D     = " + tembereng2D.hitungLuasT2D());
                                        System.out.println("Keliling Tembereng 2D = " + tembereng2D.hitungKelilingT2D());
                                        tmbrng2D.end(); //polimorph
                                        try{
                                            if(tinggiDimensi >= jari){
                                                throw new RuntimeException("Tinggi Dimensi > Jari-jari");
                                            }
                                            System.out.println("\n============");
                                            System.out.println("Tembereng 3D");
                                            System.out.println("============");

                                            Tembereng3D tembereng3D = new Tembereng3D(jari, tinggiDimensi);
                                            Lingkaran tmbrng3D = new Tembereng3D(jari, tinggiDimensi); //polimorph

                                            System.out.println("Luas Permukaan Tembereng 3D = " + tembereng3D.hitungLuasPermukaanT3D());
                                            System.out.println("Volume Tembereng 3D =       = " + tembereng3D.hitungVolumeT3D ());
                                            tmbrng3D.end(); //polimorph
                                        }
                                        catch (RuntimeException ex){
                                            System.err.println("\nException : " + ex);
                                        }
                                        
                                    }
                                    catch (RuntimeException ex){
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
                                        
                                        System.out.println("Luas Juring 2D     = " + juring2D.hitungLuasJ2D());
                                        System.out.println("Keliling Juring 2D = " + juring2D.hitungKelilingJ2D());
                                         jring2D.end(); //polimorph
                                         
                                        System.out.println("\n=========");
                                        System.out.println("Juring 3D");
                                        System.out.println("=========");
                                        
                                        Juring3D juring3D = new Juring3D(jari, sudut);
                                        Lingkaran jring3D = new Juring3D(jari, sudut); //polimorph
                                        
                                        System.out.println("Luas Permukaan Juring 3D = " + juring3D.hitungLuasPermukaanJ3D());
                                        System.out.println("Volume Juring 3D         = " + juring3D.hitungVolumeJ3D());
                                        jring3D.end(); //polimorph
                                        
                                    }
                                    catch (RuntimeException ex){
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
                                        if (sudut <= 0 || sudut >= 360) {
                                            throw new RuntimeException("Pengisian Besar Sudut <=0");
                                        }
                                        Busur pb = new Busur(jari, sudut);
                                        Lingkaran bsr = new Busur(jari, sudut);//polimorph
                                        
                                        System.out.println("Panjang Busur Lingkaran = " + pb.hitungPanjangBusur());
                                        bsr.end(); //polimorph
                                    }
                                    catch (RuntimeException ex){
                                        System.err.println("\nException : " + ex);
                                    }
                                }
                                else if(pil2==4){
                                    System.out.println("\n====");
                                    System.out.println("Bola");
                                    System.out.println("====");
                                    Bola bla = new Bola(jari);
                                    Lingkaran ball = new Bola(jari); //polimorph
                                    
                                    System.out.println("Volume Bola         = " + bla.hitungVolumeBola());
                                    System.out.println("Luas Permukaan Bola = " + bla.hitungLuasPermukaanBola());
                                    ball.end(); //polimorph
                                }
                                else if(pil2==5){
                                    System.out.println("\nKembali Ke Menu Awal. . .");
                                }
                                else{
                                    System.out.println("Pilihan Tidak Tersedia!");
                                }
                            }while(pil2!=5);
                        }
                        else if(pilihan==2){
                            System.out.println("\n=======");
                            System.out.println("Kerucut");
                            System.out.println("=======");
                            System.out.print("Tinggi Dimensi : ");
                            tinggiDimensi = input.nextDouble();
                            System.out.print("Input r2       : ");
                            jari2 = input.nextDouble();
                            try{
                                if (tinggiDimensi <= 0 || jari2 <= 0 || jari2 >= jari) {
                                    throw new RuntimeException("Pengisian Tinggi Dimensi atau r2 <=0");
                                }
                                Kerucut krct = new Kerucut(jari, tinggiDimensi);
                                Lingkaran krc = new Kerucut(jari, tinggiDimensi); //polimorph
                                
                                System.out.println("\nVolume Kerucut         = " + krct.hitungVolume());
                                System.out.println("Luas Permukaan Kerucut = " + krct.hitungLuasPermukaan());
                                krc.end(); //polimorph
                                
                                System.out.println("\n==================");
                                System.out.println("Kerucut Terpancung");
                                System.out.println("==================");
                                KerucutTerpancung kt = new KerucutTerpancung(jari, tinggiDimensi, jari2);
                                KerucutTerpancung kterpancung = new KerucutTerpancung(jari, tinggiDimensi, jari2); //polimorph
                                
                                System.out.println("Luas Permukaan Kerucut Terpancung ="+ kt.luasPermukaanKTerpancung());
                                System.out.println("Volume Kerucut Terpancung         ="+ kt.volumeKTerpancung());
                                kterpancung.end(); //polimorph
                            }
                            catch (RuntimeException ex){
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
                                                                
                                System.out.println("Volume Tabung         = " + tbg.hitungVolumeTabung());
                                System.out.println("Luas Permukaan Tabung = " + tbg.hitungLuasPermukaanTabung());
                                tbung.end(); //polimorph
                            }
                            catch (RuntimeException ex){
                                System.err.println("\nException : " + ex);
                            }  
                        }
                        else if(pilihan==4) {
                            System.out.println("\nKembali ke Pilihan Program Awal. . .");
                        }
                        else{
                            System.out.println("Pilihan Tidak Tersedia!");
                        }
                    }while(pilihan!=4); 
                }
                catch (RuntimeException ex){
                    System.err.println("\nException : " + ex);
                }
            }
            else if(pilpro==2){
                double jariMerkurius, jariVenus, jariBumi, jariMars, jariJupiter, jariSaturnus, jariUranus, jariNeptunus;
                double linRevMerkurius, linRevVenus, linRevBumi, linRevMars, linRevJupiter, linRevSaturnus, linRevUranus, linRevNeptunus;
                double lKalaRevMerkurius, lKalaRevVenus, lKalaRevBumi, lKalaRevMars, lKalaRevJupiter, lKalaRevSaturnus, lKalaRevUranus, lKalaRevNeptunus;
                double lKalaRoMerkurius, lKalaRoVenus, lKalaRoBumi, lKalaRoMars, lKalaRoJupiter, lKalaRoSaturnus, lKalaRoUranus, lKalaRoNeptunus;
                
                RandomAccessFile fSource = null;

                try{
                    String file = "D:\\Learning UPNYK\\PBO\\coba2.txt";
                    fSource = new RandomAccessFile(file, "rw");
                    
                    if (fSource.length() < 1){
                        System.out.println("==============");
                        System.out.println("Planet Angkasa");
                        System.out.println("==============");

                        //Merkurius
                        System.out.println("\n=========");
                        System.out.println("Merkurius");
                        System.out.println("=========");
                        System.out.print("Jari Merkurius    : ");
                        jariMerkurius = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevMerkurius = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoMerkurius = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevMerkurius = input.nextDouble();

                        fSource.writeDouble(jariMerkurius);
                        fSource.writeDouble(linRevMerkurius);
                        fSource.writeDouble(lKalaRoMerkurius);
                        fSource.writeDouble(lKalaRevMerkurius);
                        
                        Merkurius mer = new Merkurius(jariMerkurius, linRevMerkurius, lKalaRoMerkurius, lKalaRevMerkurius, rt);

                        //Venus
                        System.out.println("\n=====");
                        System.out.println("Venus");
                        System.out.println("=====");
                        System.out.print("Jari Venus        : ");
                        jariVenus = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevVenus = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoVenus = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevVenus = input.nextDouble();

                        fSource.writeDouble(jariVenus);
                        fSource.writeDouble(linRevVenus);
                        fSource.writeDouble(lKalaRoVenus);
                        fSource.writeDouble(lKalaRevVenus);
                        
                        Venus ven = new Venus(jariVenus, linRevVenus, lKalaRoVenus, lKalaRevVenus, rt);

                         //BUMI
                        System.out.println("\n====");
                        System.out.println("Bumi");
                        System.out.println("====");
                        System.out.print("Jari Bumi         : ");
                        jariBumi = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevBumi = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoBumi = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevBumi = input.nextDouble();

                        fSource.writeDouble(jariBumi);
                        fSource.writeDouble(linRevBumi);
                        fSource.writeDouble(lKalaRoBumi);
                        fSource.writeDouble(lKalaRevBumi);
                        
                        Bumi bumi = new Bumi(jariBumi, linRevBumi, lKalaRoBumi, lKalaRevBumi, rt);

                        //MARS
                        System.out.println("\n====");
                        System.out.println("Mars");
                        System.out.println("====");
                        System.out.print("Jari Mars         : ");
                        jariMars = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevMars = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoMars = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevMars = input.nextDouble();

                        fSource.writeDouble(jariMars);
                        fSource.writeDouble(linRevMars);
                        fSource.writeDouble(lKalaRoMars);
                        fSource.writeDouble(lKalaRevMars);
                        
                        Mars mars = new Mars(jariMars, linRevMars, lKalaRoMars, lKalaRevMars, rt);

                        //JUPITER
                        System.out.println("\n=======");
                        System.out.println("Jupiter");
                        System.out.println("=======");
                        System.out.print("Jari Jupiter      : ");
                        jariJupiter = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevJupiter = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoJupiter = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevJupiter = input.nextDouble();

                        fSource.writeDouble(jariJupiter);
                        fSource.writeDouble(linRevJupiter);
                        fSource.writeDouble(lKalaRoJupiter);
                        fSource.writeDouble(lKalaRevJupiter);
                        
                        Jupiter jup = new Jupiter(jariJupiter, linRevJupiter, lKalaRoJupiter, lKalaRevJupiter, rt);

                        //Saturnus
                        System.out.println("\n========");
                        System.out.println("Saturnus");
                        System.out.println("========");
                        System.out.print("Jari Saturnus     : ");
                        jariSaturnus = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevSaturnus = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoSaturnus = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevSaturnus = input.nextDouble();

                        fSource.writeDouble(jariSaturnus);
                        fSource.writeDouble(linRevSaturnus);
                        fSource.writeDouble(lKalaRoSaturnus);
                        fSource.writeDouble(lKalaRevSaturnus);
                        
                        Saturnus sat = new Saturnus(jariSaturnus, linRevSaturnus, lKalaRoSaturnus, lKalaRevSaturnus, rt);

                        //Uranus
                        System.out.println("\n======");
                        System.out.println("Uranus");
                        System.out.println("======");
                        System.out.print("Jari Uranus       : ");
                        jariUranus = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevUranus = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoUranus = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevUranus = input.nextDouble();

                        fSource.writeDouble(jariUranus);
                        fSource.writeDouble(linRevUranus);
                        fSource.writeDouble(lKalaRoUranus);
                        fSource.writeDouble(lKalaRevUranus);
                        
                        Uranus ura = new Uranus(jariUranus, linRevUranus, lKalaRoUranus, lKalaRevUranus, rt);

                        //Neptunus
                        System.out.println("\n========");
                        System.out.println("Neptunus");
                        System.out.println("========");
                        System.out.print("Jari Neptunus     : ");
                        jariNeptunus = input.nextDouble();
                        System.out.print("Lintasan Revolusi : ");
                        linRevNeptunus = input.nextDouble();
                        System.out.print("Kala Rotasi       : ");
                        lKalaRoNeptunus = input.nextDouble();
                        System.out.print("Kala Revolusi     : ");
                        lKalaRevNeptunus = input.nextDouble();

                        fSource.writeDouble(jariNeptunus);
                        fSource.writeDouble(linRevNeptunus);
                        fSource.writeDouble(lKalaRoNeptunus);
                        fSource.writeDouble(lKalaRevNeptunus);
                        
                        Neptunus nep = new Neptunus(jariNeptunus, linRevNeptunus, lKalaRoNeptunus, lKalaRevNeptunus, rt);

//                        mer.thread.setPriority(10);
//                        ven.thread.setPriority(9);
//                        bumi.thread.setPriority(8);
//                        mars.thread.setPriority(7);
//                        jup.thread.setPriority(6);
//                        sat.thread.setPriority(5);
//                        ura.thread.setPriority(4);
//                        nep.thread.setPriority(3);

                        mer.thread.start();
                        ven.thread.start();
                        bumi.thread.start();
                        mars.thread.start();
                        jup.thread.start();
                        sat.thread.start();
                        ura.thread.start();
                        nep.thread.start();
                    }else {
                        System.out.println("Raf Leng : " + fSource.length());

                        fSource.seek(0);
                        int i = 0;
                        double planet[][] = new double[8][4];
                        while (fSource.getFilePointer() < fSource.length()) {
                            for (int j = 0; j < 4; j++) {
                                planet[i][j] = fSource.readDouble();
                            }
                            i++;
                        }

                        String namaPlanet[] = {"MERKURIUS", "VENUS", "BUMI", "MARS", "JUPITER", "SATURNUS", "URANUS", "NEPTUNUS"};
                        
                        //OUTPUT DARI INPUTAN
                        for (int a = 0; a < 8; a++) {
                            System.out.println(namaPlanet[a] + "\n");
                            System.out.println("Jari jari " + namaPlanet[a].toLowerCase() + " : " + planet[a][0]);
                            System.out.println("lintasan " + namaPlanet[a].toLowerCase() + " : " + planet[a][1]);
                            System.out.println("rotasi " + namaPlanet[a].toLowerCase() + " : " + planet[a][2]);
                            System.out.println("revolusi " + namaPlanet[a].toLowerCase() + " : " + planet[a][3]);
                            System.out.println("");
                        }
                        
                        //OUTPUT DARI PROSES PERHITUNGAN DI MASING-MASING KELAS PLANET
                        Merkurius mer = new Merkurius(planet[0][0], planet[0][1], planet[0][2], planet[0][3], rt);
                        Venus ven = new Venus(planet[1][0], planet[1][1], planet[1][2], planet[1][3], rt);
                        Bumi bumi = new Bumi(planet[2][0], planet[2][1], planet[2][2], planet[2][3], rt);
                        Mars mars = new Mars(planet[3][0], planet[3][1], planet[3][2], planet[3][3], rt);
                        Jupiter jup = new Jupiter(planet[4][0], planet[4][1], planet[4][2], planet[4][3], rt);
                        Saturnus sat = new Saturnus(planet[5][0], planet[5][1], planet[5][2], planet[5][3], rt);
                        Uranus ura = new Uranus(planet[6][0], planet[6][1], planet[6][2], planet[6][3], rt);
                        Neptunus nep = new Neptunus(planet[7][0], planet[7][1], planet[7][2], planet[7][3], rt);

                        mer.thread.start();
                        ven.thread.start();
                        bumi.thread.start();
                        mars.thread.start();
                        jup.thread.start();
                        sat.thread.start();
                        ura.thread.start();
                        nep.thread.start();

                    }
                    fSource.close();
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(pilpro==3){
                System.out.println("\nProgram Selesai. . .");
            }
            else{
                System.out.println("\nPilihan Tidak Tersedia!");
            }
        }while(pilpro!=3);
    }
}
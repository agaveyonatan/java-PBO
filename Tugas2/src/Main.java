/**
 *
 * @author Agave-PC
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte pilihan;
        do{
            System.out.println("Pilihan: ");
            System.out.println("1. Jajargenjang serta turunan");
            System.out.println("2. Segitiga serta turunan");
            System.out.println("Input Pilihan: ");
            pilihan = input.nextByte();
            
            if(pilihan==1)
            {
                double alas, tinggi, tinggiDimensi;
                
                System.out.println("\nList:");
                System.out.println("Luas Jajargenjang");
                System.out.println("Volume Prisma Jajargenjang");
                System.out.println("Volume Limas Jajargenjang");
                
                System.out.println("\nPanjang Alas: ");
                alas = input.nextDouble();
                System.out.println("Tinggi Alas: ");
                tinggi = input.nextDouble();
                
                System.out.println("\nLuas Jajargenjang");
                JajarGenjang jg = new JajarGenjang(alas, tinggi);
                System.out.println("Hasil Berkoma :" + jg.luasJajarGenjang());
                System.out.println("Hasil Bulat :" + jg.luasJajarGenjang((int)alas, (int)tinggi));
                
                System.out.println("\nVolume Prisma Jajargenjang");
                System.out.println("Tinggi Dimensi :");
                tinggiDimensi = input.nextDouble();
                PrismaJajarGenjang prisma = new PrismaJajarGenjang(alas, tinggi);
                System.out.println("Volume Prisma Jajargenjang : " + prisma.volume(tinggiDimensi));
                
                System.out.println("\nVolume Limas Jajargenjang");
                System.out.println("Tinggi Dimensi :");
                tinggiDimensi = input.nextDouble();
                LimasJajarGenjang limas = new LimasJajarGenjang(alas, tinggi);
                System.out.println("Volume Prisma Jajargenjang : " + limas.volume(tinggiDimensi));
            }
            else if(pilihan==2)
            {
                double jari, tinggiDimensi;
                
                System.out.println("\nList:");
                System.out.println("Luas Lingkaran");
                System.out.println("Volume Tabung");
                System.out.println("Volume Kerucut");
                
                System.out.println("\nPanjang Jari-Jari: ");
                jari = input.nextDouble();
                
                System.out.println("\nLuas Lingkaran");
                Lingkaran ling = new Lingkaran(jari);
                System.out.println("Hasil Berkoma :" + ling.luasLingkaran());
                System.out.println("Hasil Bulat :" + ling.luasLingkaran((int)jari));
                
                System.out.println("\nVolume Tabung");
                System.out.println("Tinggi Dimensi :");
                tinggiDimensi = input.nextDouble();
                Tabung tbg = new Tabung(jari);
                System.out.println("Volume Tabung : " + tbg.volume(tinggiDimensi));
                
                System.out.println("\nVolume Kerucut");
                System.out.println("Tinggi Dimensi :");
                tinggiDimensi = input.nextDouble();
                Kerucut krct = new Kerucut(jari);
                System.out.println("Volume Kerucut : " + krct.volume(tinggiDimensi));
            }
            else
            {
                System.out.println("Pilihan Tidak Ada");
            }
        }while(pilihan!=2);
    }
}

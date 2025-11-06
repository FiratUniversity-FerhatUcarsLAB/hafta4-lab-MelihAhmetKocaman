/*
 * Ad Soyad: Melih Ahmet Kocaman
 * Ogrenci No: 250541088
 * Tarih: 25/10/2025
 * Aciklama: Görev 3
 */

import java.util.Scanner;
public class gorev_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı Soyadınızı Giriniz: ");
        String adSoyad = input.nextLine();


        System.out.println("Brüt Maaşınızı giriniz: ");
        double brutMaas = input.nextDouble();

        System.out.println("Mesai Saatinizi giriniz: ");
        int mesaiSaat = input.nextInt();

        double mesaiUcret = (brutMaas/160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcret;

        double sgk = toplamGelir * 0.14;
        double gelirVergisi = toplamGelir * 0.15;
        double damgaVergisi =  toplamGelir * 0.00759;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir);
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        System.out.println("========================================");
        System.out.println("              MAAŞ BORDROSU");
        System.out.println("========================================");
        System.out.printf("Çalışan: " + adSoyad);
        System.out.println("\n ");
        System.out.println("GELİRLER:");
        System.out.printf(" Brüt Maaş              :   %.2f TL",  brutMaas);
        System.out.printf("\n Mesai Ücreti (" + mesaiSaat + " saat) :     %.2f TL",mesaiUcret);
        System.out.println("\n ------------------------");
        System.out.printf(" TOPLAM GELİR           :   %.2f TL", toplamGelir);
        System.out.println("\n ");
        System.out.println("KESİNTİLER:");
        System.out.printf(" SGK Kesintisi (0.14)    :   %.2f TL", sgk);
        System.out.printf("\n Gelir Vergisi (0.15)    :   %.2f TL", gelirVergisi);
        System.out.printf("\n Damga Vergisi (0.008)   :     %.2f TL", damgaVergisi);
        System.out.println("\n -------------------------");
        System.out.printf(" TOPLAM KESİNTİ          :   %.2f TL", toplamKesinti );
        System.out.println(" ");
        System.out.printf("\nGünlük Net Kazanç        :    %.2f TL", gunlukNetKazanc);
        System.out.printf("\nSaatlik Net Kazanç       :     %.2f TL", saatlikNetKazanc);
        System.out.printf("\nNET MAAŞ                 :   %.2f TL", netMaas);
        System.out.println("\n========================================");






    }
}


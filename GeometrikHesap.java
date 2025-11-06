/*
 * Ad Soyad: Melih Ahmet Kocaman
 * Ogrenci No: 250541088
 * Tarih: 25/10/2025
 * Aciklama: Görev 2
 */

import java.util.Scanner;
public class GeometrikHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Daire yarıçapını giriniz: ");
        double yariCap = input.nextDouble();

        float pi = 3.1415f;

        double alan = pi * Math.pow(yariCap , 2);
        System.out.printf("Dairenin Alanı: %.2f cm^2", alan);

        double cevre = pi * 2 * yariCap;
        System.out.printf("\nDairenin Cevre: %.2f cm", cevre);

        double cap = 2 * yariCap;
        System.out.printf("\nDairenin Çapı: %.2f cm", cap);

        double kureHacmi = 4.0/3.0 * pi * Math.pow(yariCap, 3);
        System.out.printf("\nKürenin Hacmi: %.2f cm^3", kureHacmi);

        double kureYuzeyAlani = 4 * pi * Math.pow(yariCap, 2);
        System.out.printf("\nKürenin Yüzey Alanı: %.2f  cm^2", kureYuzeyAlani);




    }
}


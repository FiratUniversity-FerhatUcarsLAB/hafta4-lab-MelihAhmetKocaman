/*
 * Ad Soyad: Melih Ahmet Kocaman
 * Ogrenci No: 250541088
 * Tarih: 25/10/2025
 * Aciklama: Görev 1
 */


import java.util.Scanner;
public class gorev_1 {
    public static void main(String[] args) {

        //Değişkenler alınıyor
        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı girin: ");
        String ad = input.nextLine();

        System.out.println("Soyadınızı girin: ");
        String soyad = input.nextLine();

        System.out.println("Öğrenci Numaranızı girin: ");
        int ogrenci_no = input.nextInt();

        System.out.println("Yaşınızı girin: ");
        int yas = input.nextInt();

        System.out.println("GPA(0.0-4.0): ");
        float gpa = input.nextFloat();

        //if ve else komutuyla girilen gpa değeri değerlendiriliyor 
        if (gpa >= 1.8) {
            String durum = "Başarılı";

            System.out.printf("Ad Soyad: %s %s", ad, soyad);
            System.out.printf("\nÖğrenci No: %d", ogrenci_no);
            System.out.printf("\nYaş: %d", yas);
            System.out.printf("\nGPA: %.2f", gpa);
            System.out.println("\nDurum: " + durum );
        }
        else {
            String durum = "Başarısız";
            System.out.printf("Ad Soyad: %s %s", ad, soyad);
            System.out.printf("\nÖğrenci No: %d", ogrenci_no);
            System.out.printf("\nYaş: %d", yas);
            System.out.printf("\nGPA: %.2f", gpa);
            System.out.println("\nDurum: " + durum );

        }
    }
}

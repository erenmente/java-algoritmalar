/* 
Dışarıdan girilen bir tamsayı değişkeni için girilen değerdeki hem tek hem de çift rakamların toplamını; 
girilen sayının basamak sayısını ve tek rakamlar toplamı ile çift rakamlar toplamı arasındaki mutlak farkı bulup 
ekrana yazdıran programın kodu istenmektedir.

Bu benim düşündüğüm algoritma magic rakamlar içermesi nedeniyle clean code'dan uzak bir yapı.
*/

import java.util.Scanner;

public class SayiCozumleyici1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz.");

        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();

            int[] dizi = sayiCozumle(sayi);

            System.out.println("Tek Rakamlar Toplamı: " + dizi[0]);
            System.out.println("Çift Rakamlar Toplamı: " + dizi[1]);
            System.out.println("Basamktaki Rakamlar Toplamı : " + dizi[2]);
            System.out.println("Tek Rakamların Toplamı ile Çift Rakamlar Toplamının Mutlak Farkı: " + dizi[3]);
            System.out.println("Basamak Sayısı: " + dizi[4]);
        } else {
            System.out.println("Lütfen bir tam sayı giriniz.");

            scanner.next();
        }

        scanner.close();

    }

    static int[] sayiCozumle(int sayi) {
        int tekToplam = 0, ciftToplam = 0, count = 0, toplamFark = 0, toplam = 0;

        while (sayi > 0) {
            if ((sayi % 10) % 2 == 0) { // Son rakamı çift mi kontrol ediyor
                ciftToplam += sayi % 10; // Çift ise ciftToplam değişkeniyle toplayıp ciftToplam değişkenine atıyor.

            } else {
                tekToplam += sayi % 10; // Çift değilse tekToplam değişkenine atıyor.

            }
            count++; // Kaç basamak olduğunu hesaplıyor.
            sayi /= 10; // Hesapladığımız son rakamı atıyor.

        }

        toplam = tekToplam + ciftToplam; // Rakamlar toplamı

        toplamFark = tekToplam - ciftToplam; // Rakamlar Farkı

        if (toplamFark < 0) { // Rakamlar farkının mutlağını alıyor

            toplamFark *= -1;
        }

        int[] dizi = { tekToplam, ciftToplam, toplam, toplamFark, count }; // İstenen tüm sonuçlar diziye atanıp
                                                                           // dönderiliyor

        return dizi;
    }

}

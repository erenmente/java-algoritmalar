/* 
Dışarıdan girilen bir tamsayı değişkeni için girilen değerdeki hem tek hem de çift rakamların toplamını; 
girilen sayının basamak sayısını ve tek rakamlar toplamı ile çift rakamlar toplamı arasındaki mutlak farkı bulup 
ekrana yazdıran programın kodu istenmektedir.

Bu yapay zekanın yardım etmesiyle yazdığım algoritma öbür algoritmaya kıyasla daha rahat okunabilir profesyonel bir yapı.
*/


import java.util.Scanner;

public class SayiCozumleyici2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz.");

        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();

            AnalizSonucu sonuc = sayiCozumle(sayi);

            System.out.println("Tek rakamlar toplamı: " + sonuc.tekToplam);
            System.out.println("Çift rakamlar toplamı: " + sonuc.ciftToplam);
            System.out.println("Tek ve Çift Rakamlar Toplamı: " + sonuc.toplam);
            System.out.println("Tek ve Çift Rakamların Mutlak Farkı: " + sonuc.mutlakFark);
            System.out.println("Basamak Sayısı: " + sonuc.basamakSayisi);

        } else {
            System.out.println("Lütfen bir tam sayı giriniz.");

            scanner.next();
        }

    }

    static AnalizSonucu sayiCozumle(int sayi) {
        AnalizSonucu sonuc = new AnalizSonucu();
        int tekToplam = 0, ciftToplam = 0, count = 0, mutlakFark = 0, toplam = 0;

        while (sayi > 0) {
            if ((sayi % 10) % 2 == 0) {
                ciftToplam += sayi % 10;

            } else {
                tekToplam += sayi % 10;

            }
            count++;
            sayi /= 10;

        }

        toplam = tekToplam + ciftToplam;

        mutlakFark = tekToplam - ciftToplam;

        if (mutlakFark < 0) {

            mutlakFark *= -1;
        }

        sonuc.tekToplam = tekToplam;
        sonuc.ciftToplam = ciftToplam;
        sonuc.toplam = toplam;
        sonuc.mutlakFark = mutlakFark;
        sonuc.basamakSayisi = count;

        return sonuc;
    }

}

class AnalizSonucu {
    int tekToplam;
    int ciftToplam;
    int toplam;
    int mutlakFark;
    int basamakSayisi;
}
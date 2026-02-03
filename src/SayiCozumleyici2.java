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

        scanner.close();

    }

    static AnalizSonucu sayiCozumle(int sayi) { // Burada döndüreceğimiz değerin aslında class nesnesi olduğunu
                                                // belirtiyoruz
        AnalizSonucu sonuc = new AnalizSonucu(); // Nesne yarattık
        int tekToplam = 0, ciftToplam = 0, count = 0, mutlakFark = 0, toplam = 0;

        while (sayi > 0) { // Eğer değerler double olsaydı sonsuz döngüye girerdik
            if ((sayi % 10) % 2 == 0) { // Son rakamı çift mi kontrol ediyor
                ciftToplam += sayi % 10; // Çift ise ciftToplam değişkeniyle toplayıp ciftToplam değişkenine atıyor.

            } else {
                tekToplam += sayi % 10; // Çift değilse tekToplam değişkenine atıyor.

            }
            count++; // Kaç basamak olduğunu hesaplıyor.
            sayi /= 10; // Hesapladığımız son rakamı atıyor.

        }

        toplam = tekToplam + ciftToplam; // Rakamlar toplamı

        mutlakFark = tekToplam - ciftToplam; // Rakamların farkı

        if (mutlakFark < 0) { // Rakamların farkının mutlağı

            mutlakFark *= -1;
        }

        sonuc.tekToplam = tekToplam; // Bulduğumuz tek rakamlar toplamını AnalizSonucundaki değişkene atıyoruz
        sonuc.ciftToplam = ciftToplam; // Bulduğumuz çift rakamlar toplamını AnalizSonucundaki değişkene atıyoruz
        sonuc.toplam = toplam; // Bulduğumuz rakamlar toplamını AnalizSonucundaki değişkene atıyoruz
        sonuc.mutlakFark = mutlakFark; // Bulduğumuz mutlak farkı AnalizSonucundaki değişkene atıyoruz
        sonuc.basamakSayisi = count; // Bulduğumuz basamak sayısını AnalizSonucundaki değişkene atıyoruz

        return sonuc; // yarattığımız nesneyi dönderiyoruz
    }

}

class AnalizSonucu { // Boş kutumuz (değerler null değiller, default olarak atanıyorlar)
    int tekToplam;
    int ciftToplam;
    int toplam;
    int mutlakFark;
    int basamakSayisi;
}
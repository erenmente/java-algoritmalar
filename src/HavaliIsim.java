/*
Soru:
Kullanıcıdan ad ve soyad bilgisini girmesi istenir girilen ad değişkenindeki karakter sayısı 12'nin tam katı değil ise karakter sayısı 12'nin tam katı oluncaya kadar 
sonuna * karakteri eklenir. Soyad değişkenindeki karakter sayısı 12'nin tam katı değil ise  karakter sayısı 12'nin tam katı oluncaya kadar sonuna + karakteri eklenir. 
Ad değişkenini bir kare şeklinde ve Soyad değişkenini bir U harfi biçiminde ekrana yazdıran programı kodlayınız.
*/

import java.util.Scanner;

public class HavaliIsim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.next();

        ad = adYildizEkle(ad);

        adYazdir(ad);

        System.out.println("---------------");

        soyad = soyadArtiEkle(soyad);

        soyadYazdir(soyad);
    }

    static String adYildizEkle(String ad) {
        while (ad.length() % 12 != 0) { // Ad değişkenindeki harf sayısı 12 veya 12'nin katına eşit olmadığı sürece
                                        // devam edecek
            ad += "*"; // 12 veya 12'nin katına tamamlamak için * ekliyor
        }

        return ad; // yeni üretilen ad döndürülüyor
    }

    static void adYazdir(String ad) {
        int parcaSayisi = ad.length() / 4; // ad uzunluğunu dörede bölüyor çünkü karenin 4 çizgisi olur
        int boslukSayisi = parcaSayisi - 2; // karenin içindeki boşuk aslında bir harften öbür harfe kadar boş olur o
                                            // nedenle 2 çıkarılıyor.
        String bosluk = ""; // bosluğu başlangıçta boş bırakıyoruz.

        for (int i = 0; i < boslukSayisi; i++) { // Bosluk sayısı değişkeni kadar bosluk olması lazım
            bosluk += " "; // 2.kısım ve 4.kısım arasındaki bosluk dolduruluyor
        }

        System.out.println(ad.substring(0, parcaSayisi)); // 1. kısım kelimenin 0.kelimesinden(ilk kelime) parcaSayisi
                                                          // değişkeninin 1 eksiğine kadarki kısımı yazacak

        for (int i = 0, j = parcaSayisi - 1; i < parcaSayisi; i++, j--) { // Can alıcı kısım burası 2.kısım ile 3.kısım.
                                                                          // döngüde 2 tane değişken kullanılmıştır
                                                                          // nedeni ise biri 2.kısımın ilk harfini (i
                                                                          // değişkeni) öbürü
                                                                          // ise 4. kısımın son harfini yazması için (j
                                                                          // değişkeni) biri artarken (i değişkeni)
                                                                          // diğeri azalacak (j değişkeni)
            System.out.print(ad.substring(parcaSayisi + i, parcaSayisi + i + 1)); // Bu kısımda şunu unutmamak lazım
                                                                                  // substring metodu soldaki kısımı
                                                                                  // dahil ederken sağdaki kısımı dahil
                                                                                  // etmez yani burada:
                                                                                  // (parcaSayisi + i + 1). harfi
                                                                                  // yazmaz. Kısaca buradaki amacımız
                                                                                  // for'un son döneceği kısıma kadar
                                                                                  // her harfi teker teker yazmak

            System.out.print(bosluk); // Burada boslukları eklemezsek 2. kısım ile 4. kısım birbirine yapışır
            System.out.println(ad.substring(3 * parcaSayisi + j, 3 * parcaSayisi + j + 1)); // 2. kısımı yazmak için
                                                                                            // kullandığımız yöntemin
                                                                                            // aynısı sadece sonuncu
                                                                                            // harften başlıyor
        }

        System.out.println(ad.substring(2 * parcaSayisi, 3 * parcaSayisi)); // 3. kısım normal şekilde yazılıyor

    }

    static String soyadArtiEkle(String soyad) { // Bu kısımlar ad için yaptığımızın aynısı sadece kare değil U şeklinde yazacak
        while (soyad.length() % 12 != 0) {
            soyad += "+";
        }

        return soyad;
    }

    static void soyadYazdir(String soyad) {
        int parcaSayisi = soyad.length() / 3;
        int boslukSayisi = parcaSayisi - 2;
        String bosluk = "";

        for (int i = 0; i < boslukSayisi; i++) {
            bosluk += " ";
        }

        for (int i = 0, j = parcaSayisi - 1; i < parcaSayisi; i++, j--) {
            System.out.print(soyad.substring(0 + i, 0 + i + 1));
            System.out.print(bosluk);
            System.out.println(soyad.substring(2 * parcaSayisi + j, 2 * parcaSayisi + j + 1));
        }

        System.out.println(soyad.substring(parcaSayisi, 2 * parcaSayisi));
    }

}

/*
Dışarıdan girilen bir tamsayı değişkeni için eğer girilen değer çift ise sayıdaki rakamların aritmetik ortalamasını 
değilse geometrik ortalamasını bulan programın kodu istenmketedir.
*/

import java.util.Scanner;

public class GirdiyeGoreOrtalama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        double sonuc = ciftTekKontrol(sayi);

        System.out.printf("%.2f", sonuc);

        scanner.close();

    }

    public static double ciftTekKontrol(int sayi) {
        if (sayi % 2 == 0) {
            return aritmetikOrtalama(sayi); //Girilen sayı çift ise aritmatik ortalama hesabı yapacak.

        } else {
            return geometrikOrtalama(sayi); //Girilen sayı çift değilse (Tekse), geometrik ortalama hesabı yapacak.

        }

    }

    static double aritmetikOrtalama(int sayi) {
        double toplam = 0;
        int count = 0;
        while (sayi > 0) {
            toplam += sayi % 10;    //Sayi değişkeninin son rakamını alıyor toplam ile toplayıp toplam değikenine atıyor
            sayi /= 10; //Hesapladığımız basamağı kaldırıyoruz
            count++;    //Kaç kez toplama işlemi yaptığımızı veya kısaca kaç basamaklı bir sayı olduğunu buluyoruz.
        }

        return toplam / count;  //Aritmatik ortalamayı döndürüyoruz
    }

    static double geometrikOrtalama(int sayi) {
        int count = 0;
        double toplam = 1;

        while (sayi > 0) {
            toplam *= sayi % 10;    //Sayi değişkeninin son rakamını alıyor toplam ile toplayıp toplam değikenine atıyor
            sayi /= 10; //Hesapladığımız basamağı kaldırıyoruz
            count++;    //Kaç kez çarpma işlemi yaptığımızı veya kısaca kaç basamaklı bir sayı olduğunu buluyoruz.
        }

        return Math.pow(toplam, 1.0 / count);       //basamak sayısı (Yaptığımız çarpma işlemi sayısı) kaç ise toplam değişkenin o derece de kökünü alıyoruz.    
    }

}

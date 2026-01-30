//spontane aklıma gelen, kendimi denemek istediğimde yazdığım algoritma.

import java.util.Scanner;

public class KutuphaneKullanmadanDinamikDizi {
    int[] dizi = new int[2];

    int diziBoyutu = dizi.length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KutuphaneKullanmadanDinamikDizi app = new KutuphaneKullanmadanDinamikDizi();

        System.out.print("Lütfen ikilik tabana çevirmek istediğiniz sayıyı girin.");
        int sayi = scanner.nextInt();

        app.ikilikTabanaDonustur(sayi);

        app.yazdir();
    }

    void ikilikTabanaDonustur(int sayi) {
        int kalan = 0;
        int i = 0;

        while (sayi >= 1) {
            kalan = sayi % 2;// sayının kalanını alır.
            dizi[i] = kalan;// dizinin i. elemanına kalanı atar.
            sayi /= 2;// sayıyı 2'ye böler.
            i++;
            if (i == dizi.length) {//
                dinamikDizi();
            }
        }
    }

    void dinamikDizi() {
        diziBoyutu += 2; // diziyi oluşturduğumuzda dizi eleman sayısını dizi boyutuna atamıştık şimdi de
                         // 2 arttırıyoruz.
        int[] dizi2 = new int[diziBoyutu]; // eski dizi yerine yeni bir tane dizi oluşturuyoruz.

        for (int i = 0; i < dizi.length; i++) {// eski dizinin içindeki değerleri indexleri de aynı olacak şekilde
                                               // yenisine KOPYALIYORUZ.
            dizi2[i] = dizi[i];
        }
        dizi = dizi2; // en önemli kısım: burada eleman sayısı büyük olan yani yeni oluşturduğumuz
                      // dizinin referansını ilk dizi (metot dışarısında kullanılan)'ye atıyoruz ki metodun
                      // dışında aynı diziyi kullanarak yeni oluşturduğumuz diziye erişsin.

    }

    void yazdir() {
        for (int i = dizi.length - 1; i >= 0; i--) {// dizinin son elemanından başlayarak yazdırır.
            System.out.print(dizi[i]);
        }
    }

}

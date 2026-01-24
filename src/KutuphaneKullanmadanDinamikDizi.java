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
            kalan = sayi % 2;//sayının kalanını alır.
            dizi[i] = kalan;//dizinin i. elemanına kalanı atar.
            sayi /= 2;//sayıyı 2'ye böler.
            i++;
            if (i >= dizi.length) {
                dinamikDizi();
            }
        }
    }

    void dinamikDizi() {
        diziBoyutu += 2;
        int[] dizi2 = new int[diziBoyutu];
        for (int i = 0; i < dizi.length; i++) {//dizinin uzunluğunu artırmak için
            dizi2[i] = dizi[i];
        }
        dizi = dizi2;

    }

    void yazdir() {
        for (int i = dizi.length - 1; i >= 0; i--) {//dizinin son elemanından başlayarak yazdırır.
            System.out.print(dizi[i]);
        }
    }

}

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
            return aritmetikOrtalama(sayi);

        } else {
            return geometrikOrtalama(sayi);

        }

    }

    static double aritmetikOrtalama(int sayi) {
        double toplam = 0;
        int count = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
            count++;
        }

        return toplam / count;
    }

    static double geometrikOrtalama(int sayi) {
        int count = 0;
        double toplam = 1;

        while (sayi > 0) {
            toplam *= sayi % 10;
            sayi /= 10;
            count++;
        }

        return Math.pow(toplam, 1.0 / count);
    }

}

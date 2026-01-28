import java.util.Scanner;

public class SayiCozumleyici {

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

    }

    static int[] sayiCozumle(int sayi) {
        int tekToplam = 0, ciftToplam = 0, count = 0, toplamFark = 0, toplam = 0;

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

        toplamFark = tekToplam - ciftToplam;

        if (toplamFark < 0) {

            toplamFark *= -1;
        }

        int[] dizi = { tekToplam, ciftToplam, toplam, toplamFark, count};

        return dizi;
    }

}

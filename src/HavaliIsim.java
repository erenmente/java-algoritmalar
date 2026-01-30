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
        while (ad.length() % 12 != 0) {
            ad += "*";
        }

        return ad;
    }

    static void adYazdir(String ad) {
        int parcaSayisi = ad.length() / 4;
        int boslukSayisi = parcaSayisi - 2;
        String bosluk = "";

        for (int i = 0; i < boslukSayisi; i++) {
            bosluk += " ";
        }

        System.out.println(ad.substring(0, parcaSayisi));

        for (int i = 0, j = parcaSayisi - 1; i < parcaSayisi; i++, j--) {
            System.out.print(ad.substring(parcaSayisi + i, parcaSayisi + i + 1));
            System.out.print(bosluk);
            System.out.println(ad.substring(3 * parcaSayisi + j, 3 * parcaSayisi + j + 1));
        }

        System.out.println(ad.substring(2 * parcaSayisi, 3 * parcaSayisi));

    }

    static String soyadArtiEkle(String soyad) {
        while (soyad.length() % 12 != 0) {
            soyad += "+";
        }

        return soyad;
    }

    static void soyadYazdir(String soyad) {
        int parcaSayisi = soyad.length() / 4;
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

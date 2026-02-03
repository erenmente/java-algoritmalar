/*
Klavyeden girilen herhangi bir 4 basamaklı bir sayıyı yazıya çevirip ekrana yazan bir Java programı kodlayınız.
*/

import java.util.Scanner;

public class SayiCevirici {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yazıya çevrilmesini istediğiniz 4 basamaklı sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        Basamaklar basamak = basamaklaraBol(sayi);

        yazdir(basamak);

    }

    static Basamaklar basamaklaraBol(int sayi) {

        Basamaklar basamak = new Basamaklar();

        basamak.birler = sayi % 10;
        sayi /= 10;
        basamak.onlar = sayi % 10;
        sayi /= 10;
        basamak.yuzler = sayi % 10;
        sayi /= 10;
        basamak.binler = sayi % 10;

        return basamak;
    }

    static void yazdir(Basamaklar basamak) {

        String[] onlar = { "", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan" };
        String[] basamaklar = { "", "", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz" };

        if (basamak.yuzler == 0) {
            System.out.print(
                    basamaklar[basamak.binler] + " bin " + onlar[basamak.onlar] + " " + basamaklar[basamak.birler]);
        } else {
            System.out.print(basamaklar[basamak.binler] + " bin " + basamaklar[basamak.yuzler] + " yüz "
                    + onlar[basamak.onlar] + " " + basamaklar[basamak.birler]);
        }

        if (basamak.birler == 1) {
            System.out.println("bir");
        }

    }

}

class Basamaklar {
    int birler, onlar, yuzler, binler;
}

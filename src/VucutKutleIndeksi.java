/*
Soru: Kullanıcıdan boy (cm) ve kilo (kg) değerlerini alan; boy/kilo oranı 2'den küçükse "şişman", 
2-2.5 arasıysa "normal", 2.5'ten büyükse "zayıf" yazan programı kodlayınız.
*/

import java.util.Scanner;

public class VucutKutleIndeksi {

    int boy;
    double kilo;

    public VucutKutleIndeksi(int boy, double kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz(cm cinsinden): ");
        int boy = scanner.nextInt();

        System.out.print("Lütfen kilonuzu girniz(kg cinsinden): ");
        double kilo = scanner.nextDouble();

        VucutKutleIndeksi app = new VucutKutleIndeksi(boy, kilo);

        app.durumuYazdir();

        scanner.close();

    }

    double indexHesapla() {
        return boy / kilo;

    }

    void durumuYazdir() {
        double sonuc = indexHesapla();

        if (sonuc < 2) {
            System.out.println("Şişman");

        } else if (2 < sonuc && sonuc < 2.5) {
            System.out.println("Normal");

        } else {
            System.out.println("Zayıf");
        }
    }

}

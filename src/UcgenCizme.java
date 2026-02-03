//spontane aklıma gelen kendimi denemek istediğimde yazdığım algoritma.

import java.util.Scanner;

public class UcgenCizme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yükseklik giriniz: ");
        int yukseklik = scanner.nextInt();

        ciz(yukseklik);

        scanner.close();
    }

    static void ciz(int yukseklik) {

        for (int i = 0; i < yukseklik; i++) {// girilen yükseklik kadar satır oluşturuyor
            for (int j = 0; j < yukseklik - i - 1; j++) {// Satır arttıkça boşluk sayısı azalsın
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {// Her satırın 2 katının 1 fazlası kadar yıldız koy demek. +1'in nedeni
                                                 // her satırda tek sayı olması için (simetri).
                System.out.print("*");
            }

            System.out.println();// boşluk koyuyoruz ki hepsi yan yana yazılmasın.

        }

    }

}

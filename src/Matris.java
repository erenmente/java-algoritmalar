/* 
Soru: 
olustur isimli bir fonksiyon yazmanız istenmektedir. Bu fonksiyon sayi isimli bir tamsayı değişkenini parametre 
olarak almaktadır. Fonksiyonun parametre olarak aldığı sayi değişkeninin değeri 4 ile 8 arasında değişmektedir. 
Fonksiyon geriye sayi*4 boyutunda iki boyutlu bir diziyi geri döndürmesi istenmektedir. 
*/

import java.util.Scanner;

public class Matris {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("4 ile 8 arasında bir sayı giriniz.");
        int sayi = scanner.nextInt();

        if (sayi >= 4 && sayi <= 8) {
            int[][] array = matrisDoldur(sayi);
            yazdir(array);

        } else {
            System.out.println("4 ile 8 arasında bir rakam giriniz.");

        }
        scanner.close();
    }

    public static int[][] matrisDoldur(int sayi) {
        int[][] array = new int[sayi][4];
        int satirDegeriAzaltma = 2; //satir değeri 2şer azalarak devam edecek
        int sutunDegeri = 10;   //Sütun değri 10 ile başlayacakmış
        int satirDegeri = sutunDegeri;  //Sütun değerini satir değerine eşitlemiş.

        for (int i = 0; i < sayi; i++) {    //Dış döngü satır sayısını manipüle ediyor. 
            for (int j = 0; j <= 3; j++) {  //İç döngü i. satırın j. sütununu manipüle ediyor.

                if (j != 0) { //Eğer index 0 ise yani ilk sütun ise ellenmeyecek
                    satirDegeri -= satirDegeriAzaltma;
                }

                array[i][j] = satirDegeri;
            }
            sutunDegeri += 10;  //Sütun değeri 10 arttırılmış. 
            satirDegeri = sutunDegeri;  //sütun değerini satır değerine atamış.
            satirDegeriAzaltma++;   //Bu sefer satırdaki sütunlar arası değerleri 1 fazla azaltacağız.
        }
        return array;
    }

    public static void yazdir(int[][] array) {
        for (int i = 0; i < array.length; i++) {    //matrix yazdırma
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}

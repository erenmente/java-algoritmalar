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
        int satirDegeriAzaltma = 2;
        int sutunDegeri = 10;
        int satirDegeri = sutunDegeri;

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <= 3; j++) {

                if (j != 0) {
                    satirDegeri -= satirDegeriAzaltma;
                }

                array[i][j] = satirDegeri;
            }
            sutunDegeri += 10;
            satirDegeri = sutunDegeri;
            satirDegeriAzaltma++;
        }
        return array;
    }

    public static void yazdir(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

}

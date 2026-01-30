import java.util.Scanner;

public class UcgenCizme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yükseklik giriniz: ");
        int yukseklik = scanner.nextInt();

        cizdir(yukseklik);
    }

    static void cizdir(int yukseklik) {

        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < yukseklik - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}

import java.util.Scanner;

public class UcgenCizme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yükseklik giriniz: ");
        int yukseklik = scanner.nextInt();

        cizdir(yukseklik);
    }

    static void cizdir(int yukseklik) {
        int sayac = 1 ;

        for(int i = 0;i < yukseklik;i++){
            for(int j = 0; j < yukseklik - i; j++ ) {System.out.print(" ");}

            for(int k = 0; k < sayac + i; k++){System.out.print("*");}

            sayac++;
            System.out.println();

        }
        

    }

}

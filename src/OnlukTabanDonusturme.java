import java.util.Scanner;

public class OnlukTabanDonusturme {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Onluk tabanında bir sayı giriniz.");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            sekizlikTaban(sayi);

        } else {
            ikilikTaban(sayi);
        }

    }

    static void ikilikTaban(int sayi) {
        int kalan=0;

        while (sayi>=1) {
            kalan=sayi%2;

            System.out.print(kalan);//charlı olanaı da dene
            sayi /=2;
        }
    }

    static void sekizlikTaban(int sayi){
        int kalan=0;

        while(sayi>=1){//sayi 1 ile 0 arasındayken de yapmaya devam ederse sonsuz döngü olur
            kalan = sayi%8;
            
            System.out.print(kalan);

            sayi/=8;
        }
    }

}

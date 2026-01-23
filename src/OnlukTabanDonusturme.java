import java.util.Scanner;
import java.util.ArrayList;

public class OnlukTabanDonusturme {
    ArrayList<Integer> dizi = new ArrayList<>();

    public static void main(String[] args) {
        OnlukTabanDonusturme app = new OnlukTabanDonusturme();

        app.calistir();
    }

    public void calistir() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("çıkmak isterseniz q'ya basınız.");
            System.out.println("Lütfen Onluk tabanında bir sayı giriniz.");

            if (scanner.hasNextInt()) {// sayısal bir değer girilirse
                int sayi = scanner.nextInt();// girilen sayısal değer sayi değişkenine atanır

                if (sayi % 2 == 0) {
                    sekizlikTaban(sayi); // Girilen değer çift ise sekizlik tabana çeviriyor.
                    yazdir();

                } else {
                    ikilikTaban(sayi); // Girilen değer çift değil ise ikilik taban dönüştürüyor
                    yazdir();

                }
            } else {// girilen değer sayısal değil ise
                String k = scanner.next();
                String kelime = k.toLowerCase();// Büyük-küçük duyarlılığını kaldırıyoruz
                char karakter = kelime.charAt(0);// ben girilen değeri chara böyle dönüştürdüm

                if (karakter == 113) {// q harfi girilirse
                    System.out.println("Çıkılıyor...");

                    break;
                } else {
                    System.out.println("Çıkış için lütfen q tuşunu kullanınız.");// q dışında bir şey girdiyse
                    System.out.println();
                    continue;
                }
            }

        }
        scanner.close();
    }

    void ikilikTaban(int sayi) {// ArrayList de normal dizi gibi referans ile değişiyor
        int kalan = 0;// Atama yapılacak değişkenin başlangıç ilk değeri null olamaz.

        while (sayi >= 1) { // sayi 1 ile 0 arasındayken de yapmaya devam ederse sonsuz döngü olur
            kalan = sayi % 2; // 2'ye bölümünden kalanı alıyor
            dizi.add(kalan);// diziye ekliyor
            sayi /= 2; // sürekli 2ye bölüyor ta ki döngü koşulunu bozana kadar
        }
    }

    void sekizlikTaban(int sayi) {
        int kalan = 0;

        while (sayi >= 1) {
            kalan = sayi % 8;
            dizi.add(kalan);
            sayi /= 8;
        }
    }

    void yazdir() {
        for (int i = dizi.size() - 1; i >= 0; i--) {// kural gereği en sondaki bölümden başlar son kalan ile devam eder
                                                    // en son ilk kalan yazılır.
            System.out.print(dizi.get(i));
        }
        System.out.println();
    }

}

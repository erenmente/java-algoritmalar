/*
Dışarıdan en ve boy isimli iki tamsayı değerini giriş olarak alan bir program * sembollerinden oluşan 
bir dörtgeni ekrana çizdirmektedir. Bu programın kodu istenmektedir.

tek bakışta anlanılabilecek bir örnek olduğundan açıklama satırı eklemedim.
*/

import java.util.Scanner;

public class DortgenCizme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen en giriniz.");
        int en = scanner.nextInt();
        System.out.print("Lütfen boy giriniz");
        int boy = scanner.nextInt();

        cizdir(en, boy);

        scanner.close();

    }

    static void cizdir(int en, int boy) {
        for (int i = 0; i < boy; i++) {
            for (int j = 0; j < en; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

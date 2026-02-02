/*
Soru: Kullanıcıdan oynamak istediği oyun alanının büyüklüğünü (satır ve sütun boyutları) girmesi dışarıdan istensin. 
Kullanıcı tarafından girilen büyüklükte bir harita rasgele oluşturulsun. Oluşturulan haritate sadece 0 ve 1 değerleri vardır. 
0 değerleri temiz; 1 değerleri mayınlı bölgeleri göstersin.

Oyunun başlangıcında kullanıcının puan değeri 0'dır. Kullanıcıdan seçmek istediği lokasyonun satır ve sütun değerlerini 
girmesi istensin. Eğer kullanıcının girdiği pozisyonda mayın yoksa oyuncunun puanı 10 puan artırılır ve 
"Hala hayattasın... Devam" mesajı gösterilerek yeni bir lokasyonun satır ve sütun değerlerini girmesi istenir. 
Eğer kullanıcı mayınlı bir bölge seçmiş ise "Oyun bitti! Puanınız:" mesajı ile program sonlandırılır.
*/

import java.util.Scanner;

public class MayinTarlasi {
    final int BOS = 0;
    final int MAYIN = 1;
    final int PUAN_ARTISI = 10;

    static int[][] harita; // Bütün metotlara parametre olarak alacağıma class'da tanımlarım ve metotlara
                           // mainde oluşturduğum nesne ile ulaşarıım

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MayinTarlasi app = new MayinTarlasi();

        app.haritaOlustur();

        app.haritaDoldur();

        app.oyunaBasla();

        app.haritaYazdir();

    }

    void haritaOlustur() {
        System.out.print("Lütfen oyunda olmasını istediğiniz satır sayısını girin.");
        int satir = scanner.nextInt();

        System.out.print("Lütfen oyunda olmasını istediğiniz sütun sayısını girin.");
        int sutun = scanner.nextInt();

        harita = new int[satir][sutun];

    }

    void haritaDoldur() {
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                harita[i][j] = (int) (Math.random() * 2);

            }

        }

    }

    void oyunaBasla() {
        int puan = 0;
        while (true) {

            System.out.print("Seçmek istediğiniz satır:");
            int secilenSatir = scanner.nextInt() - 1; // - 1 yapma nedenim kullanıcı indislerin 0dan başladığını
                                                      // bilmesine gerek yok o nedenle kullanıcının girdiği değerin bir
                                                      // eksiğini alıyorum ki out of bond length hatası almayalım

            System.out.print("Seçmek istediğiniz sutun:");
            int secilenSutun = scanner.nextInt() - 1;

            if (harita[secilenSatir][secilenSutun] == BOS) {
                System.out.println("Hala hayattasın... Devam");
                puan = oyunaDevam(puan);

            } else {
                oyunuBitir(puan);
                break;
            }

        }

    }

    int oyunaDevam(int puan) { // puan hesabı yapıp puan döndürüyor
        puan += PUAN_ARTISI;
        return puan;

    }

    void oyunuBitir(int puan) { // Oyunu bitirmek için bir fonksiyon yaptım başta gereksiz gibi gözükebilir
                                // ancak ileride bir şey değiştirmek veya eklemek istersem direkt bu fonksiyona
                                // ekleme işllemi yapabilirim
        System.out.println("Oyun bitti! Puanınız: " + puan);
    }

    void haritaYazdir() { // klasik matris yazdırma yöntemi
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                System.out.print(harita[i][j]);
            }
            System.out.println();
        }
    }

}

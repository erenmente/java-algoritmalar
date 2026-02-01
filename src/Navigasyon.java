/*
Soru: 
0 ve 1 değerlerinden oluşan iki boyutlu bit matris haritanızı temsil etmektedir. Matris üzerindeki 1 değerleri yol pozisyonlarını göstermektedir. 
Yolun Başlangıç noktası matrisin (00) pozisyonu ve bitiş noktası (mn) pozisyonudur. Buradaki m satır numarası n sütun numarasıdır. Matris içerisinde 
gidilebilecek tek bir yol bulunmaktadır. İki boyutlu bu harita değişkenini parametre olarak alıp yol pozisyon bilgisini geri döndüren YolBul isimli fonksiyonu 
kodlayınız.

Matris doldur kısmı videoda yok ben kendim yapmak istedim.
*/

public class Navigasyon {
    public static void main(String[] args) {
        int[][] harita = new int[10][10];

        matrisDoldur(harita);

        yazdir(harita);

        System.out.print(yolBul(harita));

    }

    static String yolBul(int[][] harita) {
        String sonuc = "";

        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                if (harita[i][j] == 1) {
                    sonuc += " " + i + j;
                }
            }

        }

        return sonuc;
    }

    static void matrisDoldur(int[][] harita) {
        int satir = 0;
        int sutun = 0;
        harita[satir][sutun] = 1; // Başlangıç noktası

        // Hedefe (matrisin sonuna) ulaşana kadar devam et
        while (satir < harita.length - 1 || sutun < harita[0].length - 1) {

            // Eğer son satırdaysa
            if (satir == harita.length - 1) {
                sutun++;
            }
            // Eğer son sütundaysa
            else if (sutun == harita[0].length - 1) {
                satir++;
            }
            // İkisi de değilse rastgele karar ver
            else {
                if (Math.random() < 0.5) {
                    sutun++; // Sağa
                } else {
                    satir++; // Aşağı
                }
            }

            // Gidilen noktayı işaretle
            harita[satir][sutun] = 1;
        }

    }

    static void yazdir(int[][] harita) {
        for (int i = 0; i < harita.length; i++) {
            for (int j = 0; j < harita[i].length; j++) {
                System.out.print(harita[i][j] + " ");
            }
            System.out.println();
        }

    }

}

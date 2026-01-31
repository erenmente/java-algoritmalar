/*
Ferhat hocamın ders içi örneklerinden biri ama tabiki de kendim eklediğim bazı detaylar var (Alfabetik sıralama, en fazla harfi bulma). 
kendimi denemek için yaptığım algoritmalardan.
*/

public class HarfSay {
    char[] harfler = harfOlustur();

    int[] harfSayisi = kacTaneVar();

    public static void main(String[] args) {
        HarfSay app = new HarfSay();

        app.alfabetikSirala();

        app.harfleriGoster();

        System.out.println();

        app.kacTaneVarYazdir();

        app.enFazlayiYaz();

    }

    static char[] harfOlustur() {
        char[] harfler = new char[100]; // 100 eleman için yer açıyor heapte ve değer atamadığımız için null atanıyor

        for (int i = 0; i < harfler.length; i++) {
            harfler[i] = (char) (Math.random() * 26 + 'a'); // a'dan z'ye kadar rastgele harf üretiyor
        }

        return harfler;
    }

    void harfleriGoster() {
        for (int i = 0; i < harfler.length; i++) {
            if ((i + 1) % 20 == 0) { // güzel gözükmesi için 20 tane harf yazınca alt satıra geçiyor
                System.out.println(harfler[i]);
            } else {
                System.out.print(harfler[i] + " ");
            }

        }
    }

    int[] kacTaneVar() {
        int[] sayac = new int[26];

        for (int i = 0; i < harfler.length; i++) {
            sayac[harfler[i] - 'a']++; // harflerin[i]'ninci değerinin sayac'ın o indexteki değeri 1 arttıracak
        }

        return sayac;
    }

    void kacTaneVarYazdir() {
        char harf;

        for (int i = 0; i < harfSayisi.length; i++) {
            harf = (char) (i + 'a'); // i'nin o anda hangi harf üzerinde işlem yaptığını gösteriyoruz

            if ((i + 1) % 13 == 0) { // güzel gözükmesi için 13 harfte bir satır aşşağı in
                System.out.println(harfSayisi[i] + " Adet: " + harf);
            } else {
                System.out.print(harfSayisi[i] + " Adet: " + harf + ", ");
            }

        }

    }

    void alfabetikSirala() {
        char temp = 'a';

        for (int i = 0; i < harfler.length - 1; i++) { // Dış döngü bütün elemanları kapsıyor
            for (int j = 0; j < harfler.length - 1; j++) { // iç döngü tek bi elemanı hepsiyle kıyaslıyor. Dış döngü
                                                           // olmasa sadece en büyüğü en sona atardık
                if (harfler[j] > harfler[j + 1]) { // yanındakinden daha büyükse yanındakiyle yer değiştiriyor
                    temp = harfler[j];
                    harfler[j] = harfler[j + 1];
                    harfler[j + 1] = temp;
                }

            }

        }

    }

    kutu enFazlayiBul() {
        kutu kutu = new kutu(); // 2 tane değişkeni döndürmemiz gerekeceğinden bir kutu yaratıp onun içine
                                // doldurayim diye düşündüm.
        int enFazla = harfSayisi[0]; // en fazlayı ilk eleman varsaydım
        int enFazlaIndex = 0, temp = 0; // temp zaten yer değiştirirken kullanıyoruz. index ise hangi harf olduğunu
                                        // anlamamıza yardımcı olacak

        for (int i = 0; i < harfSayisi.length - 1; i++) {
            if (harfSayisi[i + 1] > enFazla) { // şuanki en fazlamızdan daha fazla olan bir harf varsa yer değiştirme
                                               // işlemi yapıyoruz
                temp = enFazla;
                enFazla = harfSayisi[i + 1];
                harfSayisi[i + 1] = temp;

                enFazlaIndex = i + 1; // indexini almayı unutmuyoruz

            }
        }

        kutu.enFazla = enFazla; // oluşturduğumuz kutuya değerleri atadık
        kutu.enFazlaIndex = enFazlaIndex; // oluşturduğumuz kutuya değerleri atadık

        return kutu;
    }

    void enFazlayiYaz() {
        kutu kutu = enFazlayiBul(); // değerleri almamız için yine nesne oluşturduk

        System.out.println(kutu.enFazla + " Tane: " + (char) (kutu.enFazlaIndex + 'a')); // aldığımız index sayesinde
                                                                                         // hangi harf olduğunu
                                                                                         // buluyoruz
    }

}

class kutu { // boş kutu değerleri geçirmek için
    int enFazla;
    int enFazlaIndex;
}

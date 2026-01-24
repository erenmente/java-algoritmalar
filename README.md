# Algoritma ve Veri Yapıları Örnekleri

Bu proje, temel algoritma ve veri yapısı kavramlarını pekiştirmek amacıyla Java dilinde yazılmış uygulamaları içermektedir.

## İçerik

1. **Kütüphane Kullanmadan Dinamik Dizi (Binary Dönüştürücü)**
2. **Matris Oluşturucu**
3. **Onluk Taban Dönüştürücü (İkilik ve Sekizlik)**

---

### 1. Kütüphane Kullanmadan Dinamik Dizi

**Dosya:** `src/KutuphaneKullanmadanDinamikDizi.java`

Bu uygulama, kullanıcının girdiği onluk tabandaki bir sayıyı (decimal) ikilik tabana (binary) dönüştürür.

* **Özellik:** Java'nın hazır `ArrayList` kütüphanesini kullanmak yerine, dizi boyutu yetersiz kaldığında manuel olarak diziyi genişleten (`dinamikDizi` metodu ile) özel bir yapı kullanır.
* **Kullanım:** Program çalıştırıldığında bir sayı girilir ve sonuç ekrana yazdırılır.

### 2. Matris Oluşturucu

**Dosya:** `src/Matris.java`

Belirli bir örüntüye göre matris (iki boyutlu dizi) oluşturup ekrana yazdıran bir uygulamadır.

* **Çalışma Mantığı:** Kullanıcıdan **4 ile 8** arasında bir sayı istenir.
* Girilen sayıya (satır sayısı) ve sabit 4 sütun genişliğine göre matris doldurulur.
* Hücre değerleri belirli bir matematiksel kurala göre (satır ve sütun indekslerine bağlı olarak artış/azalış göstererek) hesaplanır.

### 3. Onluk Taban Dönüştürücü

**Dosya:** `src/OnlukTabanDonusturme.java`

Girilen sayının tek veya çift olma durumuna göre farklı tabanlara dönüşüm yapan interaktif bir araçtır.

* **Çift Sayılar:** Sekizlik tabana (Octal) çevrilir.
* **Tek Sayılar:** İkilik tabana (Binary) çevrilir.
* **Özellikler:**
  * `q` tuşuna basılarak programdan çıkılabilir.
  * Hatalı girişlere (harf vb.) karşı kontrol mekanizması vardır.
  * Java `ArrayList` kütüphanesi kullanılarak sonuçlar saklanır ve tersten yazdırılarak doğru taban gösterimi elde edilir.

## Kurulum ve Çalıştırma

1. Projeyi bilgisayarınıza indirin veya kopyalayın.
2. Bir Java IDE'si (VS Code, IntelliJ, Eclipse) veya terminal kullanarak `src` klasörü içerisindeki `.java` dosyalarını derleyin.
3. İlgili sınıfın `main` metodunu çalıştırarak uygulamaları test edebilirsiniz.

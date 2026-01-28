# 🚀 Algoritma ve Veri Yapıları Örnekleri

Bu proje, temel algoritma ve veri yapısı kavramlarını pekiştirmek amacıyla **Java** dilinde yazılmış uygulamaları içerir.
Genel olarak **Fatih Özkaynak** hocamın kaynaklar kısmındaki oynatma listelerinden ilerledim. Buna ek olarak, merak ettiğim algoritmaları **Clean Code** prensiplerine sadık kalarak, modüler ve okunabilir şekilde uygulamaya çalıştım.

---

## 📂 İçerik Özeti

| # | Proje Adı | Ana Dosya | Temel Kavramlar |
|:-:|:---|:---|:---|
| 1 | **Dinamik Dizi (Binary)** | `KutuphaneKullanmadanDinamikDizi.java` | Array Resizing, Binary Conversion |
| 2 | **Matris Oluşturucu** | `Matris.java` | 2D Arrays, Pattern Generation |
| 3 | **Taban Dönüştürücü** | `OnlukTabanDonusturme.java` | Base Conversion (Octal/Binary) |
| 4 | **Sayı Çözümleyici** | `SayiCozumleyici2.java` | Class Structures, DRY Principle |
| 5 | **Ortalama Hesaplayıcı** | `GirdiyeGoreOrtalama.java` | Modular Methods, Math Logic |

---

## 🛠️ Proje Detayları

### 1. Kütüphane Kullanmadan Dinamik Dizi

📌 **Dosya:** [src/KutuphaneKullanmadanDinamikDizi.java](src/KutuphaneKullanmadanDinamikDizi.java)

* **Amaç:** Girilen onluk (decimal) sayıyı ikilik (binary) tabana çevirmek.
* **Teknik Detay:** Java'nın hazır `ArrayList` sınıfını kullanmak yerine, dizi dolduğunda boyutunu manuel olarak artıran (`dinamikDizi`) özel bir algoritma yazılmıştır. Bu sayede `ArrayList`'in arka planda nasıl çalıştığı simüle edilmiştir.

### 2. Matris Oluşturucu

📌 **Dosya:** [src/Matris.java](src/Matris.java)

* **Amaç:** Kullanıcıdan alınan satır sayısına (4-8 arası) göre özel bir sayısal örüntüye sahip 4 sütunlu matris oluşturmak.
* **Teknik Detay:** İç içe döngüler kullanılarak, her satırda azalan ve her sütunda artan dinamik bir matematiksel formül uygulanır.

### 3. Onluk Taban Dönüştürücü

📌 **Dosya:** [src/OnlukTabanDonusturme.java](src/OnlukTabanDonusturme.java)

* **Amaç:** Girilen sayının **Tek** veya **Çift** olmasına göre farklı tabanlara (Octal veya Binary) dönüşüm yapmak.
* **Özellikler:** 'q' tuşu ile çıkış imkanı, hatalı giriş kontrolü (Exception Handling benzeri yapı) ve sonuçları `ArrayList` ile tersten yazdırma mantığı içerir.

### 4. Sayı Çözümleyici ve Basamak Analizi

📌 **Dosya:** [src/SayiCozumleyici2.java](src/SayiCozumleyici2.java)

* **Amaç:** Bir sayının basamaklarını analiz ederek istatistiksel veriler (Tek/Çift toplamları, farklar vb.) sunmak.
* **Clean Code Dokunuşu:** Sonuçları taşımak için ilkel bir `int[]` dizisi yerine, **özel bir Sınıf (Class)** yapısı kullanılmıştır. Bu sayede "Magic Numbers" (örn: `dizi[3]`) sorunu çözülmüş ve kodun okunabilirliği artırılmıştır.

### 5. Girdiye Göre Ortalama Hesaplayıcı

📌 **Dosya:** [src/GirdiyeGoreOrtalama.java](src/GirdiyeGoreOrtalama.java)

* **Amaç:** Sayının türüne göre farklı ortalama hesapları yapmak.
  * **Çift Sayı:** Basamakların Aritmetik Ortalaması.
  * **Tek Sayı:** Basamakların Geometrik Ortalaması.
* **Teknik Detay:** Her işlem (`ciftTekKontrol`, `aritmetikOrtalama`, `geometrikOrtalama`) ayrı metotlara bölünerek modülerlik sağlanmıştır.

---

## 📚 Kaynakça

* [Fatih Özkaynak - Algoritma ve Programlama (Oynatma Listesi 1)](https://www.youtube.com/playlist?list=PLR_3k5Bkz0SBA9PoV6DrxpghD7pqPScGJ)
* [Fatih Özkaynak - Algoritma ve Programlama (Oynatma Listesi 2)](https://www.youtube.com/playlist?list=PLR_3k5Bkz0SAQnWSnrZqNe37GO0L3eidp)

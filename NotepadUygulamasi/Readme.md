# Notepad Uygulaması

Bu Java programı, kullanıcıdan metin girişi alır ve bu metni bir dosyaya kaydeder. Program tekrar başlatıldığında en son kaydedilen metni ekranda gösterir.

# Talimatlar

1. Metin Girişi: Programı çalıştırın ve metin girmeniz için bir istem alacaktır. İstediğiniz metni yazın ve Enter tuşuna basın.
2. Dosyaya Kaydetme: Program, girilen metni notepad.txt adlı bir dosyaya kaydedecektir.
3. En Son Kaydedilen Metni Gösterme: Program tekrar çalıştırıldığında, dosyadan en son kaydedilen metni okuyacak ve ekranda gösterecektir.

# Uygulama Detayları

* Kullanıcı Girişi: Kullanıcıdan girdi almak için Scanner sınıfı kullanılmıştır.
* Dosyaya Yazma: Metni dosyaya yazmak için FileWriter ve PrintWriter sınıfları kullanılmıştır.
* Dosyadan Okuma: En son kaydedilen metni dosyadan okumak için FileReader ve BufferedReader sınıfları kullanılmıştır.
* Hata Yönetimi: Dosya okuma ve yazma işlemleri sırasında oluşabilecek hataları ele almak için try-catch blokları kullanılmıştır.
* İhtiyacınıza göre program yapısını değiştirebilirsiniz. Örneğin, kullanıcı girdisini doğrudan dosyaya yazabilir veya önce bir veri yapısında saklayıp daha sonra dosyaya yazabilirsiniz.
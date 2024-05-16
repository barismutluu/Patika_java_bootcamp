# Java ile Dosyadan Sayıları Okuma ve Toplamını Bulma

Bu Java programı, belirtilen metin dosyasındaki (.txt) tüm sayıları okur, bu sayıların toplamını hesaplar ve sonucu ekrana yazdırır.

## Dosya İçeriği

Dosya içeriği aşağıdaki gibi olmalıdır:

5
10
20
12
33

Programın çıktısı 80 olmalıdır.

## Programın Çalıştırılması

Java programını çalıştırmak için aşağıdaki adımları izleyin:

1. Java JDK'nızın bilgisayarınızda yüklü olduğundan emin olun.
2. Java programını bir metin düzenleyici ile açın ve kodu kopyalayın.
3. Bir terminal veya komut istemcisinde, programın bulunduğu dizine gidin.
4. Programı derleyin: `javac Main.java`
5. Programı çalıştırın: `java Main`

## İpucular

- Java'da bir dosyadan veri okumak için `BufferedReader` sınıfını veya Java 7 ve üzeri için `java.nio.file` paketini kullanabilirsiniz. `BufferedReader`'ı `FileReader` ile birlikte kullanarak bir dosyayı satır satır okuyabilirsiniz.
- Dosyadan okunan her satır bir `String` olacaktır. Bu `String`'i bir tam sayıya dönüştürmek için `Integer.parseInt` metodunu kullanabilirsiniz.
- Her bir satırdaki sayıyı bir toplam değişkenine ekleyin. Bu değişken, döngü boyunca her bir sayıyı ekler ve sonuçta tüm sayıların toplamını elde edersiniz.
- Dosya okuma işlemleri her zaman `IOException` hatası fırlatabilir. Bu yüzden, dosya okuma kodunuzu `try-catch` bloğu içerisine almayı unutmayın.


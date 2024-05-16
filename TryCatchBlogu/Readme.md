## Try-Catch Bloğu

Soru: 10 elemanlı tek boyutlu bir dizi içerisinde kullanıcıdan alınan indeksteki elemanı döndüren bir Java metodu yazın. Eğer belirtilen indeks dizi boyutunun dışındaysa, metot bir hata mesajı döndürmelidir. Dizinin elmanlarını manuel olarak tanımlayın.


İpucu 1: Diziye erişim sağlarken `ArrayIndexOutOfBoundsException` hatasıyla karşılaşabilirsiniz. Bu hata, dizi boyutunun dışına çıkmaya çalıştığınızda fırlatılır.


İpucu 2: Bu tür bir hatayı yakalamak ve uygun bir hata mesajı döndürmek için `try-catch` bloklarını kullanabilirsiniz. `try` bloğu içerisinde hata olabilecek kodu yerleştirirsiniz. Eğer hata olursa, kontrol `catch` bloğuna geçer.


İpucu 3: `catch` bloğunda hata nesnesini yakalar ve hata mesajını döndürmek için kullanabilirsiniz.


İpucu 4: Metodunuz `try` bloğu içerisinde diziye erişmeye çalışmalı ve bu değeri döndürmeli. Eğer hata oluşursa, `catch` bloğunda hata mesajını döndürmelisiniz.


Bu ipuçlarını kullanarak, belirli bir indeksteki dizi elemanını döndüren ve hata kontrolü yapan bir Java metodu yazınız. Bol şanslar!
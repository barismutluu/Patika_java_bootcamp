## JDBC ile Veritabanı Uygulaması
Soru: JDBC kullanarak bir MySQL veritabanına bağlanan ve belirli bir tablodan veri çeken ve çekilen veriyi ekrana yazdıran bir Java uygulaması yazınız. Veritabanında işlem yaparak "employees" adında bir tablo ve her bir çalışanın "id", "name", "position" ve "salary" olmak üzere 4 sütun oluşturun. Manuel olarak veri tabanındaki employees tablosuna en az 5 tane employee kaydedin.


İpucu 1: İlk olarak, veritabanı sürücünüzü proje kütüphanenize eklemeniz gerekiyor. Bu örnekte MySQL için mysql-connector-java.jar dosyasını kullanabilirsiniz.


İpucu 2: java.sql paketini kullanarak JDBC ile veritabanına bağlanabilirsiniz. Bu paket DriverManager, Connection, Statement ve ResultSet gibi sınıfları içerir.


İpucu 3: DriverManager.getConnection() metodunu kullanarak veritabanına bir bağlantı oluşturabilirsiniz. Bu metodun parametreleri olarak veritabanının URL'ini, kullanıcı adını ve şifreyi geçireceksiniz.


İpucu 4: Connection nesnesinin createStatement() metodunu kullanarak bir SQL ifadesi (statement) oluşturabilirsiniz.


İpucu 5: Statement nesnesinin executeQuery() metodunu kullanarak bir SQL sorgusu çalıştırabilir ve sonuçları bir ResultSet nesnesinde saklayabilirsiniz.


İpucu 6: ResultSet nesnesini döngü içinde dolaşıp her bir satırı okuyabilir ve her bir sütunun değerini alabilirsiniz.


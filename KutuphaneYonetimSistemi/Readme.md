# Kütüphane Yönetim Sistemi

Bu proje, bir kütüphane yönetim sistemi tasarlamak için bir Maven Java projesidir. PostgreSQL veritabanını kullanır ve Hibernate ORM kullanarak veritabanı işlemlerini gerçekleştirir.

## Entity Sınıfları ve İlişkiler

Bu projede beş adet entity sınıfı bulunmaktadır: Kitap (Book), Yazar (Author), Kategori (Category), Yayınevi (Publisher) ve Kitap Ödünç Alma (BookBorrowing). Bu sınıflar arasında çeşitli ilişkiler tanımlanmıştır:

- Bir kitabın bir yazarı olabilir, bir yazarın birden fazla kitabı olabilir (One-to-Many ilişkisi).
- Bir kategori birden fazla kitaba sahip olabilirken, bir kitap birden fazla kategoriye ait olabilir (Many-to-Many ilişkisi).
- Bir kitabın bir yayınevi olabilir, bir yayınevinin birden fazla kitabı olabilir (One-to-Many ilişkisi).
- Bir kitap birden fazla ödünç alma işlemine sahip olabilir, ancak her ödünç alma işlemi yalnızca bir kitaba ait olabilir (One-to-Many ilişkisi).

Her bir entity sınıfı, ilişkileri ve temel değişkenleri içermektedir.


## Dependency'ler

Bu projede Maven kullanılmıştır. İlgili bağımlılıklar `pom.xml` dosyasında aşağıdaki gibi tanımlanmıştır:

```xml
<!-- Hibernate ORM -->
<dependencies>
        <!-- Hibernate Core Kütüphanesi -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>6.5.0.Final</version>
        </dependency>

        <!-- PostgreSQL JDBC Sürücüsü -->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.7.3</version>
        </dependency>
    </dependencies>

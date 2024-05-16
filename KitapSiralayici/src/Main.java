import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //5 Adet kitap verileri tanımlandı
        Book book1 = new Book("Hayvan Çiftliği", "George Orwell", 152);
        Book book2 = new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 160);
        Book book3 = new Book("Kabil'in Çene Kemiği", "Torquemada", 216);
        Book book4 = new Book("Beni Asla Bırakma", "Kazuo Ishiguro", 272);
        Book book5 = new Book("Söyleme Bilmesinler", "Şermin Yaşar", 200);

        //Kitap isimleri TreeSet'e saklandı.
        Set<Book> bookSetByTitle = new TreeSet<>();
        bookSetByTitle.add(book1);
        bookSetByTitle.add(book2);
        bookSetByTitle.add(book3);
        bookSetByTitle.add(book4);
        bookSetByTitle.add(book5);
        //Kitaplar A'dan Z'ye göre sıralandı
        System.out.println("\nKitabların İsimleri A'dan Z'ye Göre Sıralaması : \n");
        for (Book book : bookSetByTitle) {
            System.out.println(book.getTitle());
        }
        // Kitap sayfa sayıları TreeSet'e saklandı.
        Set<Book> bookSetByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPageCount(), book2.getPageCount());
            }
        });
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);
        //Kitap sayfaları küçükten büyüğe göre sıralandı.
        System.out.println("\nKitapların Sayfa Sayısına Göre Sıralaması : \n");
        for (Book book : bookSetByPageCount) {
            System.out.println(book.getTitle() + " - Sayfa Sayısı : " + book.getPageCount());
        }
    }
}
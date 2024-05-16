public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int pageCount;

    //Constructor tanımlandı
    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    //Getters and setters tanımı yapıldı.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
//Kitap isminin A'dan Z'ye göre kıyaslama yapması için Override compareTo method'u kullanıldı.
    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}

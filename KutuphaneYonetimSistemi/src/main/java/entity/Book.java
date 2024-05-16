package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long bookId;

    @Column(name = "book_name", length = 100, nullable = false)
    private String bookName;

    @Column(name = "book_publicationYear ", nullable = false)
    private int bookPublicationYear;

    @Column(name = "book_stock ", length = 100, nullable = false)
    private int bookStock;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinTable(name = "book_category", joinColumns = {@JoinColumn(name = "book_id")}, inverseJoinColumns = {@JoinColumn(name = "category_id")})
    private List<Category> categories;

    @OneToMany(mappedBy = "")
    private List<BookBorrowing> bookBorrowingList;

    public Book() {
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public int getBookStock() {
        return bookStock;
    }

    public void setBookStock(int bookStock) {
        this.bookStock = bookStock;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPublicationYear=" + bookPublicationYear +
                ", bookStock='" + bookStock +
                '}';
    }
}

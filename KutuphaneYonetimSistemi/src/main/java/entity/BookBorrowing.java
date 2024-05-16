package entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "bookborrowing")

public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookborrowing_id")
    private long bookborrowingId;

    @Column(name = "bookborrowing_borrowerName", length = 100, nullable = false)
    private String bookborrowingBorrowerName ;


    @Column(name = "bookborrowing_borrowingDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate bookborrowingBorrowingDate ;

    @Column(name = "bookborrowing_returnDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate bookborrowingReturnDate ;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_borrowing_book_id",referencedColumnName = "book_id")
    private Book book;

    public BookBorrowing() {
    }


    public void setBookborrowingId(long bookborrowingId) {
        this.bookborrowingId = bookborrowingId;
    }

    public String getBookborrowingBorrowerName() {
        return bookborrowingBorrowerName;
    }

    public void setBookborrowingBorrowerName(String bookborrowingBorrowerName) {
        this.bookborrowingBorrowerName = bookborrowingBorrowerName;
    }

    public LocalDate getBookborrowingBorrowingDate() {
        return bookborrowingBorrowingDate;
    }

    public void setBookborrowingBorrowingDate(LocalDate bookborrowingBorrowingDate) {
        this.bookborrowingBorrowingDate = bookborrowingBorrowingDate;
    }

    public LocalDate getBookborrowingReturnDate() {
        return bookborrowingReturnDate;
    }

    public void setBookborrowingReturnDate(LocalDate bookborrowingReturnDate) {
        this.bookborrowingReturnDate = bookborrowingReturnDate;
    }

    public long getBookborrowingId() {
        return bookborrowingId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }



    @Override
    public String toString() {
        return "BookBorrowing{" +
                "bookborrowingReturnDate=" + bookborrowingReturnDate +
                ", bookborrowingBorrowingDate=" + bookborrowingBorrowingDate +
                ", bookborrowingBorrowerName='" + bookborrowingBorrowerName + '\'' +
                ", bookborrowingId=" + bookborrowingId +
                '}';
    }
}

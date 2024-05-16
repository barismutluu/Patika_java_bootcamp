package entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private long authorId;

    @Column(name = "author_name", length = 100, nullable = false)
    private String authorName;


    @Column(name = "author_birthDate")
    @Temporal(TemporalType.DATE)
    private LocalDate authorBirthDate;

    @Column(name = "author_country", length = 100)
    private String authorCountry;

    @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    private List<Book> bookList;

    public Author() {
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getAuthorBirthDate() {
        return authorBirthDate;
    }

    public void setAuthorBirthDate(LocalDate authorBirthDate) {
        this.authorBirthDate = authorBirthDate;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorBirthDate=" + authorBirthDate +
                ", authorCountry='" + authorCountry + '\'' +
                '}';
    }

    // Getter ve setter metotları

    // Diğer özellikler de eklenebilir.
}
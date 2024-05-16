package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher")

public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private long publisherId;

    @Column(name = "publisher_name", length = 100, nullable = false)
    private String authorName;


    @Column(name = "publisher_EstablishmentYear")
    private int publisherEstablishmentYear;

    @Column(name = "publisher_address ", length = 100)
    private String publisheraddress ;

    @OneToMany(mappedBy = "publisher",cascade = CascadeType.REMOVE)
    private List<Book> bookList;

    public Publisher() {
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublisherEstablishmentYear() {
        return publisherEstablishmentYear;
    }

    public void setPublisherEstablishmentYear(int publisherEstablishmentYear) {
        this.publisherEstablishmentYear = publisherEstablishmentYear;
    }

    public String getPublisheraddress() {
        return publisheraddress;
    }

    public void setPublisheraddress(String publisheraddress) {
        this.publisheraddress = publisheraddress;
    }
}

package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "category_name", length = 100, nullable = false)
    private String categoryName;


    @Column(name = "category_description", length = 100)
    private String categoryDescription;

    @ManyToMany(mappedBy = "categories",cascade = CascadeType.REMOVE)
    private List<Book> bookList;

    public Category() {
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "category{" +
                "categoriesId=" + categoryId +
                ", categoriesName='" + categoryName + '\'' +
                ", categoriesDescription='" + categoryDescription + '\'' +
                '}';
    }
}

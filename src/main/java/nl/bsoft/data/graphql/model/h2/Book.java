package nl.bsoft.data.graphql.model.h2;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "BOOK")
public class Book {

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(
            name = "BOOK_AUTHOR",
            joinColumns = {@JoinColumn(name = "BOOK_ID")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHOR_ID")}
    )
    @EqualsAndHashCode.Exclude
    Set<Author> authors = new HashSet<>();
    @Id
    @Column(name = "BOOK_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pageCount", nullable = false)
    private int pageCount;
}

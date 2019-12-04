package nl.bsoft.data.graphql.model.h2;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "AUTHOR")
public class Author {

    @Id
    @Column(name = "AUTHOR_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    @EqualsAndHashCode.Exclude
    private Set<Book> books = new HashSet<>();
}

package nl.bsoft.data.graphql.config.h2.repo;

import nl.bsoft.data.graphql.model.h2.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepositoryH2 extends JpaRepository<Book, Integer> {
    Optional<Book> findBookByNameAndPageCount(String name, int pageCount);

}

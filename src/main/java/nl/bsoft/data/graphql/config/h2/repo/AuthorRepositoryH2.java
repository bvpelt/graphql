package nl.bsoft.data.graphql.config.h2.repo;

import nl.bsoft.data.graphql.model.h2.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepositoryH2 extends JpaRepository<Author, Integer> {

    Optional<Author> findAuthorByFirstNameAndLastName(final String firstName, final String lastName);
}

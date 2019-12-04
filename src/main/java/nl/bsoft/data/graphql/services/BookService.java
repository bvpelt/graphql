package nl.bsoft.data.graphql.services;

import nl.bsoft.data.graphql.config.h2.repo.AuthorRepositoryH2;
import nl.bsoft.data.graphql.config.h2.repo.BookRepositoryH2;
import nl.bsoft.data.graphql.model.h2.Author;
import nl.bsoft.data.graphql.model.h2.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepositoryH2 bookRepositoryH2;
    private final AuthorRepositoryH2 authorRepositoryH2;

    public BookService(final BookRepositoryH2 bookRepositoryH2,
                       final AuthorRepositoryH2 authorRepositoryH2) {
        this.bookRepositoryH2 = bookRepositoryH2;
        this.authorRepositoryH2 = authorRepositoryH2;
    }


    @Transactional(transactionManager = "transactionManagerH2")
    public Book createBook(final String name, final int pageCount, final Set<Author> authors) {
        //
        // If book exists then
        //   do nothing, should be a mutation
        // else
        //   for each author in authors
        //     if author exist then add existing author to autorset
        //     else create new author add new author to autorset
        //   add authorset to book
        //   save book
        //
        Book book = new Book();
        Book createdBook = null;

        Optional<Book> optionalBook = this.bookRepositoryH2.findBookByNameAndPageCount(name, pageCount);
        if (optionalBook.isPresent()) {
            book = optionalBook.get();
        } else {
            book.setName(name);
            book.setPageCount(pageCount);


            Set<Author> currentAuthors = new HashSet<>();

            Book finalBook = book;
            authors.forEach(author -> {
                Optional<Author> foundAuthor = this.authorRepositoryH2.findAuthorByFirstNameAndLastName(author.getFirstName(), author.getLastName());
                if (foundAuthor.isPresent()) {
                    currentAuthors.add(foundAuthor.get());
                } else {
                    author.getBooks().add(finalBook);
                    Author newAuthor = this.authorRepositoryH2.save(author);
                    currentAuthors.add(newAuthor);
                }
            });
            book.setAuthors(currentAuthors);
            createdBook = this.bookRepositoryH2.save(book);
        }

        return createdBook;
    }

    @Transactional(readOnly = true, transactionManager = "transactionManagerH2")
    public List<Book> getAllBooks(final int count) {
        return this.bookRepositoryH2.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true, transactionManager = "transactionManagerH2")
    public Optional<Book> getBook(final int id) {
        return this.bookRepositoryH2.findById(id);
    }
}
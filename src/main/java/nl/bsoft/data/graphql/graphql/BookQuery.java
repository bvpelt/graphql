package nl.bsoft.data.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import nl.bsoft.data.graphql.model.h2.Book;
import nl.bsoft.data.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookQuery implements GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public List<Book> getBooks(final int count) {
        return this.bookService.getAllBooks(count);
    }

    public Optional<Book> getBook(final int id) {
        return this.bookService.getBook(id);
    }
}
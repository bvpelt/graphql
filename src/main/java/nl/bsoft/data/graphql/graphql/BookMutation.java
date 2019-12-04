package nl.bsoft.data.graphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import nl.bsoft.data.graphql.model.h2.Author;
import nl.bsoft.data.graphql.model.h2.Book;
import nl.bsoft.data.graphql.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BookMutation implements GraphQLMutationResolver {
    @Autowired
    private BookService bookService;

    public Book createBook(final String name, final int pageCount, final Set<Author> authors) {
        return this.bookService.createBook(name, pageCount, authors);
    }
}
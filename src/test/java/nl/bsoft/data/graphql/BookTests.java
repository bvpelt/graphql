package nl.bsoft.data.graphql;


import lombok.extern.slf4j.Slf4j;
import nl.bsoft.data.graphql.model.h2.Author;
import nl.bsoft.data.graphql.model.h2.Book;
import nl.bsoft.data.graphql.services.BookService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@ContextConfiguration(classes = GraphqlApplication.class, loader = SpringBootContextLoader.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookTests {

    @Autowired
    private BookService bookService;

    @Test
    public void insertBook() {
        Book book = new Book();
        Set<Author> authors = new HashSet<>();

        String bookName = "Jip en Janneke";
        int bookPages = 123;
        book.setName(bookName);
        book.setPageCount(bookPages);
        book.setAuthors(authors);

        Book newBook = bookService.createBook(bookName, bookPages, authors);

        Assert.assertNotNull(newBook);
        Assert.assertEquals(book.getName(), newBook.getName());
        Assert.assertEquals(book.getPageCount(), newBook.getPageCount());
    }

    @Test
    public void insertBookAuthor() {
        Book book = new Book();
        Set<Author> authors = new HashSet<>();

        String bookName = "Jip en Janneke";
        int bookPages = 123;
        book.setName(bookName);
        book.setPageCount(bookPages);
        book.setAuthors(authors);

        Book newBook = bookService.createBook(bookName, bookPages, authors);

        Assert.assertNotNull(newBook);
        Assert.assertEquals(book.getName(), newBook.getName());
        Assert.assertEquals(book.getPageCount(), newBook.getPageCount());

        Author author = new Author();
        author.setFirstName("Jan");
        author.setLastName("de Vries");
        authors.add(author);

        newBook = bookService.createBook(bookName, bookPages, authors);

        Assert.assertNotNull(newBook);
        Assert.assertEquals(book.getName(), newBook.getName());
        Assert.assertEquals(book.getPageCount(), newBook.getPageCount());
        Assert.assertEquals(book.getAuthors().size(), newBook.getAuthors().size());

    }
}

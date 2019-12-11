package nl.bsoft.data.graphql;


import lombok.extern.slf4j.Slf4j;
import nl.bsoft.data.graphql.model.h2.Author;
import nl.bsoft.data.graphql.model.h2.Book;
import nl.bsoft.data.graphql.model.h2.ISBN;
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

    @Test
    public void checkISBN() {

        // prefix               978
        // registratieGroep      90
        // uitgeversAanduiding  488
        // titelAanduiding     3731
        // controleCijfer         1
        ISBN isbn = new ISBN("9789048837311");
        Assert.assertEquals( 978, isbn.getPrefix());
        Assert.assertEquals(  90, isbn.getRegistratieGroep());
        Assert.assertEquals( 488, isbn.getUitgeversAanduiding());
        Assert.assertEquals(3731, isbn.getTitelAanduiding());
        Assert.assertEquals(   1, isbn.getControleCijfer());
        log.info("ISBN: {}", isbn);

        isbn = new ISBN("9789045039770");
        Assert.assertEquals( 978, isbn.getPrefix());
        Assert.assertEquals(  90, isbn.getRegistratieGroep());
        Assert.assertEquals( 450, isbn.getUitgeversAanduiding());
        Assert.assertEquals(3977, isbn.getTitelAanduiding());
        Assert.assertEquals(   0, isbn.getControleCijfer());
        log.info("ISBN: {}", isbn);

        isbn = new ISBN("9789029078931");
        Assert.assertEquals( 978, isbn.getPrefix());
        Assert.assertEquals(  90, isbn.getRegistratieGroep());
        Assert.assertEquals( 290, isbn.getUitgeversAanduiding());
        Assert.assertEquals(7893, isbn.getTitelAanduiding());
        Assert.assertEquals(   1, isbn.getControleCijfer());
        log.info("ISBN: {}", isbn);

        isbn = new ISBN("9781785031168");
        Assert.assertEquals( 978, isbn.getPrefix());
        Assert.assertEquals(   1, isbn.getRegistratieGroep());
        Assert.assertEquals( 850, isbn.getUitgeversAanduiding());
        Assert.assertEquals(3116, isbn.getTitelAanduiding());
        Assert.assertEquals(   8, isbn.getControleCijfer());
        log.info("ISBN: {}", isbn);

        isbn = new ISBN("9780099590088");
        Assert.assertEquals( 978, isbn.getPrefix());
        Assert.assertEquals(  00, isbn.getRegistratieGroep());
        Assert.assertEquals( 995, isbn.getUitgeversAanduiding());
        Assert.assertEquals(9008, isbn.getTitelAanduiding());
        Assert.assertEquals(   8, isbn.getControleCijfer());
        log.info("ISBN: {}", isbn);

        isbn = new ISBN("9783257229530");
        Assert.assertEquals( 978, isbn.getPrefix());
        Assert.assertEquals(   3, isbn.getRegistratieGroep());
        Assert.assertEquals( 572, isbn.getUitgeversAanduiding());
        Assert.assertEquals(2953, isbn.getTitelAanduiding());
        Assert.assertEquals(   0, isbn.getControleCijfer());
        log.info("ISBN: {}", isbn);

    }
}

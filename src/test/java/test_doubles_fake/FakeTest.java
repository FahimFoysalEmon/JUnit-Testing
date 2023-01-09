package test_doubles_fake;

import org.example.fake.Book;
import org.example.fake.BookRepository;
import org.example.fake.BookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeTest {

    @Test
    public void testFake() {
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("1", "Mockito In Action", 250, LocalDate.now()));
        bookService.addBook(new Book("2", "Mockito In Action 2.0", 200, LocalDate.now()));


        assertEquals(2, bookService.findNumberOfBooks());
    }

}

package dummy;

import org.example.dummy.EmailService;
import org.example.dummy.Book;
import org.example.dummy.BookRepository;
import org.example.dummy.BookService;
import org.junit.jupiter.api.Test;
import dummy.FakeBookRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    public void demoDummy() {
        BookRepository bookRepository = new FakeBookRepository();
        EmailService emailService = new DummyEmailService();
        BookService bookService = new BookService(bookRepository, emailService);

        bookService.addBook(new Book("1", "Mockito In Action", 250, LocalDate.now()));
        bookService.addBook(new Book("2", "Mockito In Action 2.0", 200, LocalDate.now()));


        assertEquals(2, bookService.findNumberOfBooks());
    }

}

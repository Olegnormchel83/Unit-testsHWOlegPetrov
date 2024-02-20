package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * У вас есть класс BookService, который использует интерфейс
 * BookRepository для получения информации о книгах из базы данных.
 * Ваша задача написать unit-тесты для BookService,
 * используя Mockito для создания мок-объекта BookRepository.
 */

class BookServiceTest {

    @Test
    void testBookServiceReturnBookByID() {
        BookService mockedBookService = mock(BookService.class);
        String bookID = "1";
        Book book = new Book(bookID);
        when(mockedBookService.findBookById(bookID)).thenReturn(book);

        Book res = mockedBookService.findBookById("1");

        assertThat(res).isNotNull().isEqualTo(book);
    }

    @Test
    void testBookServiceReturnAllBooks() {
        BookService mockedBookService = mock(BookService.class);
        Book book1 = new Book("1");
        Book book2 = new Book("2");
        Book book3 = new Book("3");
        Book book4 = new Book("4");
        when(mockedBookService.findAllBooks()).thenReturn(Arrays.asList(book1, book2, book3, book4));

        List<Book> res = mockedBookService.findAllBooks();

        assertThat(res).
                isNotEmpty().
                hasSize(4).
                contains(book1).
                contains(book3);
    }
}
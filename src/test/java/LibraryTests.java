import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {

    private Library library;
    private Book book1;

    @Before
    public void before() {
        library = new Library(400);
        book1 = new Book("Words of radiance", "Brandon Sanderson", "Fantasy");
    }

    @Test
    public void can_count_books() {
        int result = library.count_books();
        assertEquals(0, result);
    }

    @Test
    public void can_add_book(){
        library.addBook(book1);
        assertEquals(1, library.count_books());
    }

    @Test
    public void can_delete_book(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0,library.count_books());
    }

    @Test
    public void check_adds_book_if_stock_not_full() {
        library.addBook(book1);
        library.check_stock();
        assertEquals(1, library.count_books());
        assertEquals(true, library.check_stock());
    }


}

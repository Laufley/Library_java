import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTests {

    Borrower borrower;
    Book book1;
    Library library;
    @Before
    public void before(){
        book1 = new Book("Words of radiance", "Brandon Sanderson", "Fantasy");
        library = new Library(800);
        borrower = new Borrower();
    }

    @Test
    public void can_count_books(){
        int result = borrower.count_books();
        assertEquals(0, result);
    }

    @Test
    public void can_add_book_to_borrower_collection(){
        // eliminate passed in book from library
        library.addBook(book1);
        library.removeBook(book1);
        // check books.size()
        assertEquals(0, library.count_books());
        // add passed-in book to borrowedBooks
        borrower.addToBorrowerCollection(book1);
        // check borrowedBooks.size()
        assertEquals(1, borrower.count_books());



   }


}

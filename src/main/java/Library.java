import java.util.ArrayList;

public class Library {

    //defining properties
    private int capacity;
    private ArrayList<Book> books;


    // constructor function
    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    //methods

    public int count_books() {
        return this.books.size();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book){ this.books.remove(book);}

    public boolean check_stock() {
        return this.capacity >= count_books();
    }
}

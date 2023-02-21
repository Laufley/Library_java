import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    //defining properties
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> collection;


    // constructor function
    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
        this.collection = new HashMap<>();
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

    // HashMaping Methods

    public int add_book_by_genre_to_collection(){
        //iterate over books
        for (Book book : books) {
            // find genre key for each book
            String genre = book.getGenre();
            // add genre key to collection
        }
        return collection.add(genre);
    }

    public int collection_by_genre_length(){
        return this.collection.size(genre);
    }




}

import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book>borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public int count_books(){
        return borrowedBooks.size();
    }

    public void addToBorrowerCollection(Book book){
        this.borrowedBooks.add(book);

    }
}

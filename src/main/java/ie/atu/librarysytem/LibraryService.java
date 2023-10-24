package ie.atu.librarysytem;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Create a LibraryService class that will manage the library operations.
 //       a. Include a method addBook(Book book) to add a book to the library.
 //       b. Include a method getBooks() to retrieve a list of all books in the library.

@Service
public class LibraryService {

    private List<Book> library = new ArrayList<>();

    public void addBook(Book book){
        library.add(book);
    }
    public List<Book>getBooks(){
        return library;
    }
}

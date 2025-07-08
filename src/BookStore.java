import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private Map<String, Book> inventory = new HashMap<>();

    public void printBooks() {
        System.out.println("\navailable books:\n");
        for (Map.Entry<String, Book> b : inventory.entrySet()) {
            Book book = b.getValue();
            System.out.println("- " + book.getIsbn());
        }
    }

    public void AddBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("\nadded Book: " + book.getIsbn() + " to inventory!!!");
    }

    public void removeOutdatedBooks(int years) {
        List<String> outdated = new ArrayList<>();
        for (Map.Entry<String, Book> b : inventory.entrySet()) {
            Book book = b.getValue();
            if (2025 - book.getYearPublished() > years) {
                outdated.add(b.getKey());
            }
        }
        System.out.println("\nOutdated books: \n");
        for (String isbn : outdated) {
            Book book = inventory.get(isbn);
            System.out.println("- " + book.getIsbn());
            inventory.remove(isbn);
        }
        System.out.println("\nremoved outdated books!!!");
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        book.BuyBook(isbn, quantity, email, address);
    }
}

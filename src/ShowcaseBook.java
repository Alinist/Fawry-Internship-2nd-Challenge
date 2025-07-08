public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int yearPublished, String author) {
        super(isbn, title, yearPublished, 0.0, author); // price = 0 bec it's NOT FOR SALE!
    }

    @Override
    public void BuyBook(String isbn, int quantity, String email, String address) {
        System.out.println("showcase book: " + isbn + " is not for sale!!!");
    }
}

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int yearPublished, double price, String author, int stock) {
        super(isbn, title, yearPublished, price, author);
        this.stock = stock;
    }

    @Override
    public void BuyBook(String isbn, int quantity, String email, String address) {
        if (quantity > stock) {
            throw new IllegalArgumentException("not enough stock available for PaperBook: " + isbn + "!!!");
        }
        stock -= quantity;
        System.out.println("\nPaper book: " + isbn + " bought. will be sent to shipping service now!");
        ShippingService.SendToShipping(address, getIsbn(), quantity);
        System.out.println("paid amount = " + (getPrice() * quantity) + "\n");
    }
}

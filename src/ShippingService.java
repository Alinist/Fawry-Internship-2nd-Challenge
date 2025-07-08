public class ShippingService {
    public static void SendToShipping(String address, String isbn, int quantity) {
        System.out.println("bookstore: shipping " + quantity + " copy of " + isbn + " to " + address);
    }
}

public class MailService {
    public static void SendToEmail(String email, String isbn, String fileType) {
        System.out.println("bookstore: sending " + isbn + " with file type: " + fileType + " to " + email);
    }
}


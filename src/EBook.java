public class EBook extends Book {
    private String file_type;

    public EBook(String isbn, String title, int year_published, double price, String author, String fileType) {
        super(isbn, title, year_published, price, author);
        this.file_type = fileType;
    }

    public String getFile_type() {
        return file_type;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    @Override
    public void BuyBook(String isbn, int quantity, String email, String address) {
        System.out.println("EBook: " + isbn + " bought. will be sent to email now!");
        MailService.SendToEmail(email, isbn, getFile_type());
        System.out.println("paid amount = " + (getPrice() * quantity) + "\n");
    }
}

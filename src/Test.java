public class Test {
    public static void testApp() {
        BookStore bookstore = new BookStore();

        // add all different book kinds
        PaperBook paperBook1 = new PaperBook("book1", "title1", 2023, 30, "person1", 10);
        EBook eBook1 = new EBook("book2", "title2", 2024, 20, "person2", "PDF");
        ShowcaseBook showcaseBook = new ShowcaseBook("book3", "title3", 2021, "person3");

        bookstore.AddBook(paperBook1);
        bookstore.AddBook(eBook1);
        bookstore.AddBook(showcaseBook);

        bookstore.printBooks();

        // buy books
        bookstore.buyBook("book1", 2, "alyashrafelprince2004@gmail.com", "Nasr City");
        bookstore.buyBook("book2", 5, "alyashrafelprince2004@gmail.com", "Nasr City");

        // invalid case 1: buy more than in stock => error
        //bookstore.buyBook("book1", 10, "alyashrafelprince2004@gmail.com", "Nasr City");

        // invalid case 2: buy a showcase book => no error (prevents the user from buying the book XD)
        bookstore.buyBook("book3", 1, "alyashrafelprince2004@gmail.com", "Nasr City");

        // remove books that are in year 2021 or earlier(2020, 2019, etc...)
        bookstore.removeOutdatedBooks(3); // book3 removed

        bookstore.printBooks();
    }
}

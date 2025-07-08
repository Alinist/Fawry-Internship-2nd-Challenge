# Quantum Bookstore System

## Overview

The **Quantum Bookstore** system is an online bookstore that handles different types of books:

- **PaperBooks** (with stock management and shipping)    
- **EBooks** (with file types and email delivery)
- **ShowcaseBooks** (display-only, not for sale)

It allows users to manage books, buy them, and remove outdated ones from the inventory.

---

## System Components

- **Main**  
    The entry point of the program that runs the `testApp()` method for testing the functionality.
    
- **Test**  
    Contains the `testApp()` method that demonstrates adding, buying, and removing books.
    
- **BookStore**  
    Manages the inventory of books, with methods to add books, buy books, and remove outdated ones.
    
- **Book** (Abstract Class)  
    The base class for all book types, with common properties like ISBN, title, year, price, and author.
    
- **EBook**  
    Represents electronic books. Implements the `BuyBook` method to simulate sending the book to an email.
    
- **PaperBook**  
    Represents physical books. Implements the `BuyBook` method to simulate shipping the book.
    
- **ShowcaseBook**  
    Represents books that are not for sale. It prevents the user from buying the book.
    
- **MailService**  
    Simulates sending an eBook to an email.
    
- **ShippingService**  
    Simulates shipping a PaperBook to a specified address.
    

---

## Operations and Usage

### 1. Add a Book

Books can be added to the store with the `AddBook` method:

```java
PaperBook paperBook = new PaperBook("book1", "title1", 2023, 30, "author1", 10);
EBook eBook = new EBook("book2", "title2", 2024, 20, "author2", "PDF");
ShowcaseBook showcaseBook = new ShowcaseBook("book3", "title3", 2021, "author3");

bookstore.AddBook(paperBook);
bookstore.AddBook(eBook);
bookstore.AddBook(showcaseBook);
```

#### Output

![image](https://github.com/user-attachments/assets/e2fd2471-c819-40ce-938d-d725cf05b531)


### 2. Buy a Book

The `buyBook` method allows customers to purchase a book:

```java
bookstore.buyBook("book1", 2, "alyashrafelprince2004@gmail.com", "Nasr City");
bookstore.buyBook("book2", 1, "alyashrafelprince2004@gmail.com", "Nasr City");
bookstore.buyBook("book3", 1, "alyashrafelprince2004@gmail.com", "Nasr City");
```

- **Invalid cases**:
    
    - Not enough stock for **PaperBooks**.
    - **ShowcaseBooks** cannot be purchased.

#### Output

![image](https://github.com/user-attachments/assets/c2964a7f-a481-42d4-a7c6-aefed8fd8401)


### 3. Remove Outdated Books

Remove books older than a certain number of years:

```java
bookstore.removeOutdatedBooks(3);  // Removes books older than 3 years
```
#### Output

![image](https://github.com/user-attachments/assets/99c920be-2bc5-49f7-b661-b2c8f398fb92)

package OOPS.Encapsulation;

class Book {
    private String bookName;
    private String author;
    private int price;
    private int availableCopies;
    private int totalCopies;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setAvailableCopies(int availableCopies) {
        if (availableCopies >= 0) {
            this.availableCopies = availableCopies;
            this.totalCopies = availableCopies;
        } else {
            System.out.println("Invalid number of copies");
        }
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book issued successfully");
            System.out.println("Available copies: " + availableCopies);
        } else {
            System.out.println("Books not available");
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println("Book returned successfully");
            System.out.println("Available copies: " + availableCopies);
        } else {
            System.out.println("Invalid return. No book is currently issued.");
        }
    }
}

public class libraryManagement {
    public static void main(String[] args) {

        Book obj = new Book();

        obj.setBookName("The Heaven");
        obj.setAuthor("Mr Sachin Sharma");
        obj.setPrice(3500);
        obj.setAvailableCopies(1);

        System.out.println("Book name: " + obj.getBookName());
        System.out.println("Author name: " + obj.getAuthor());
        System.out.println("Book price: " + obj.getPrice());
        System.out.println("Available copies: " + obj.getAvailableCopies());

        obj.issueBook();
        obj.returnBook();
    }
}

// LibraryResourceManagement.java

abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract String getType();

    public void displayBasicInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryResource {
    private String isbn;

    public Book(String title, String author, String isbn) {
        super(title, author);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getType() {
        return "Book";
    }

    public void displayDetails() {
        displayBasicInfo(); // Inherited method.
        System.out.println("ISBN: " + isbn);
        System.out.println("Type: " + getType());
    }
}

class Magazine extends LibraryResource {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String getType() {
        return "Magazine";
    }

    public void displayDetails() {
        displayBasicInfo();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Type: " + getType());
    }
}

class DVD extends LibraryResource {
    private int durationMinutes;

    public DVD(String title, String author, int durationMinutes) {
        super(title, author);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getType() {
        return "DVD";
    }

    public void displayDetails() {
        displayBasicInfo();
        System.out.println("Duration (minutes): " + durationMinutes);
        System.out.println("Type: " + getType());
    }
}

public class LibraryResourceManagement {
    public static void main(String[] args) {
        System.out.println("--- Book Details ---");
        Book book1 = new Book("The Java Handbook", "Jane Doe", "978-1234567890"); // Encapsulation.
        book1.displayDetails();
        System.out.println();

        System.out.println("--- Magazine Details ---");
        Magazine mag1 = new Magazine("Tech Monthly", "Various", 156);
        mag1.displayDetails();
        System.out.println();

        System.out.println("--- DVD Details ---");
        DVD dvd1 = new DVD("Nature's Wonders", "John Smith", 120);
        dvd1.displayDetails();
        System.out.println();

        System.out.println("--- Polymorphism with LibraryResource reference ---");
        LibraryResource[] resources = {
            new Book("Clean Code", "Robert C. Martin", "978-0132350884"),
            new Magazine("Science Today", "Editors", 205),
            new DVD("Coding Documentaries", "Various Directors", 90)
        };

        for (LibraryResource resource : resources) {
            resource.displayBasicInfo();
            System.out.println("Resource Type: " + resource.getType()); // Polymorphism: Calls specific getType().
            System.out.println();
        }
    }
}

/*
Sample Input/Output:

--- Book Details ---
Title: The Java Handbook
Author: Jane Doe
ISBN: 978-1234567890
Type: Book

--- Magazine Details ---
Title: Tech Monthly
Author: Various
Issue Number: 156
Type: Magazine

--- DVD Details ---
Title: Nature's Wonders
Author: John Smith
Duration (minutes): 120
Type: DVD

--- Polymorphism with LibraryResource reference ---
Title: Clean Code
Author: Robert C. Martin
Resource Type: Book

Title: Science Today
Author: Editors
Resource Type: Magazine

Title: Coding Documentaries
Author: Various Directors
Resource Type: DVD
*/

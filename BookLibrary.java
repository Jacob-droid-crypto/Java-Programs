class Boook{
    String title;
    String author;
    final int boookID;

    static int bookCounter = 1000;
    static final String LIBRARY_NAME = "Central Library";

    Boook() {
        title = "Not mentioned";
        author = "Not mentioned";
        boookID = bookCounter++;
    }

    Boook(String title, String author) {
        this.title = title;
        this.author = author;
        boookID = bookCounter++;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book ID: " + boookID);
    }

    public void displayInfo(boolean showLibrary) {
        displayInfo();
        if (showLibrary) {
            System.out.println("Library Name: " + LIBRARY_NAME);
        }
    }

    public static void displayTotalBooks() {
        System.out.println("Total Books: " + (bookCounter - 1000));
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Boook book = new Boook();
        book.displayInfo(true);     
        book.displayTotalBooks();  
    }
}

class Book {
    int bookId;
    String title;
    String author;
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}
public class LibraryManagementSystem {
    static int linearSearch(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Java", "James"),
                new Book(2, "Python", "Guido"),
                new Book(3, "C++", "Bjarne")
        };
        int result = linearSearch(books, "Python");
        if (result != -1)
            System.out.println("Book Found at Index " + result);
        else
            System.out.println("Book Not Found");
    }
}

public class Book extends LibraryItem implements Loanable {
    public Book(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void loan() {
        System.out.println("Book loaned: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Book returned: " + title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book - Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}
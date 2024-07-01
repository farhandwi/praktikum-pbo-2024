public class Magazine extends LibraryItem implements Loanable {
    public Magazine(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void loan() {
        System.out.println("Magazine loaned: " + title);
    }

    @Override
    public void returnItem() {
        System.out.println("Magazine returned: " + title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine - Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}
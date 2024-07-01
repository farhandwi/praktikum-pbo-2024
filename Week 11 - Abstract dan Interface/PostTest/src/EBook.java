public class EBook extends LibraryItem implements Downloadable {
    public EBook(String title, String author, int year) {
        super(title, author, year);
    }

    @Override
    public void download() {
        System.out.println("EBook downloaded: " + title);
    }

    @Override
    public void displayInfo() {
        System.out.println("EBook - Title: " + title + ", Author: " + author + ", Year: " + year);
    }
}
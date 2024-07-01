public class Main {
    public static void main(String[] args) {
        LibraryItem book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        LibraryItem magazine = new Magazine("National Geographic", "Various", 2021);
        LibraryItem ebook = new EBook("Digital Fortress", "Dan Brown", 1998);

        LibraryMember regularMember = new RegularMember("RM001", "John Doe");
        LibraryMember premiumMember = new PremiumMember("PM001", "Jane Smith");

        // Regular member borrows a book and a magazine
        regularMember.borrowItem(book);
        regularMember.borrowItem(magazine);

        // Premium member borrows a book and downloads an ebook
        premiumMember.borrowItem(book);
        if (ebook instanceof EBook) {
            // Cast premiumMember to PremiumMember before calling downloadEBook
            ((PremiumMember)premiumMember).downloadEBook((EBook) ebook);
        }

        // Display information about the items
        book.displayInfo();
        magazine.displayInfo();
        ebook.displayInfo();

        // Members return the borrowed items
        regularMember.returnItem(book);
        regularMember.returnItem(magazine);
        premiumMember.returnItem(book);
    }
}

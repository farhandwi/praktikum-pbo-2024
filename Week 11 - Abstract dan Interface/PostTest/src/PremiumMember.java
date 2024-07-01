public class PremiumMember extends LibraryMember {
    public PremiumMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item instanceof Loanable) {
            Loanable loanableItem = (Loanable) item;
            loanableItem.loan();
            System.out.println("Premium member " + name + " borrowed " + item.title);
        } else {
            System.out.println("Premium member " + name + " cannot borrow " + item.title);
        }
    }

    @Override
    public void returnItem(LibraryItem item) {
        if (item instanceof Loanable) {
            Loanable loanableItem = (Loanable) item;
            loanableItem.returnItem();
            System.out.println("Premium member " + name + " returned " + item.title);
        } else {
            System.out.println("Premium member " + name + " cannot return " + item.title);
        }
    }

    public void downloadEBook(EBook ebook) {
        ebook.download();
        System.out.println("Premium member " + name + " downloaded " + ebook.title);
    }
}
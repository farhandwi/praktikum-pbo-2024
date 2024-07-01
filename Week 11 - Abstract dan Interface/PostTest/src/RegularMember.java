public class RegularMember extends LibraryMember {
    public RegularMember(String memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        if (item instanceof Loanable) {
            Loanable loanableItem = (Loanable) item;
            loanableItem.loan();
            System.out.println("Regular member " + name + " borrowed " + item.title);
        } else {
            System.out.println("Regular member " + name + " cannot borrow " + item.title);
        }
    }

    @Override
    public void returnItem(LibraryItem item) {
        if (item instanceof Loanable) {
            Loanable loanableItem = (Loanable) item;
            loanableItem.returnItem();
            System.out.println("Regular member " + name + " returned " + item.title);
        } else {
            System.out.println("Regular member " + name + " cannot return " + item.title);
        }
    }
}

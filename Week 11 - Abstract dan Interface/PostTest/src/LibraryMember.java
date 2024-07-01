public abstract class LibraryMember {
    protected String memberId;
    protected String name;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public abstract void borrowItem(LibraryItem item);

    public abstract void returnItem(LibraryItem item);
}

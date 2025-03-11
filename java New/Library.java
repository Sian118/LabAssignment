class Library {
    private String name;
    private Book book;
    private Incharge incharge;
    private Staff staff;

    public Library(String name, Book book, Incharge incharge, Staff staff) {
        this.name = name;
        this.book = book;
        this.incharge = incharge;
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Library Name: " + name + "\nBook: " + book + "\nIncharge: " + incharge + "\nStaff: " + staff;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Library library = (Library) obj;
        return name.equals(library.name) &&
                book.equals(library.book) &&
                incharge.equals(library.incharge) &&
                staff.equals(library.staff);
    }
}

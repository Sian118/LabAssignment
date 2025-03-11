public class LibraryApp {
    public static void main(String[] args) {
        Address address1 = new Address("Islamabad", "Pakistan");
        Person author1 = new Person("Sian Ahmed", address1);
        Date date1 = new Date(15, 7, 2020);
        Book book1 = new Book("Bet book", "12345", date1, author1);

        Incharge incharge1 = new Incharge("Manager", new Person("Ali Pansoor", new Address("Karachi", "Pakistan")));
        Staff staff1 = new Staff("Librarian", new Person("Ahmed Akhtar", new Address("Imimim", "Strtr")));

        Library library1 = new Library("City Library", book1, incharge1, staff1);
        Library library2 = new Library("City Library", book1, incharge1, staff1);

        System.out.println("Library 1 Details:" + library1);
        System.out.println("\nLibrary 2 Details" + library2);

        System.out.println("Are libraries equal? " + library1.equals(library2));
    }
}

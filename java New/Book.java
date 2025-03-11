class Book {
    private String title, issn;
    private Date publicationDate;
    private Person author;

    public Book(String title, String issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }

    public Book(Book other) {
        this.title = other.title;
        this.issn = other.issn;
        this.publicationDate = new Date(other.publicationDate);
        this.author = new Person(other.author);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && issn.equals(book.issn) &&
               publicationDate.equals(book.publicationDate) &&
               author.equals(book.author);
    }


}

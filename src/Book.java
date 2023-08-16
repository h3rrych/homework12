public class Book {
    private String nameBook;
    private  Author author;
    private int publicationYear;

    public Book(String nameBook, int publicationYear, Author author) {
        this.nameBook = nameBook;
        this.publicationYear = publicationYear;
        this.author = author;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublicationYear() {
        return this.publicationYear;

    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

}

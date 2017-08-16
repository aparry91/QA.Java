public class Book extends Item {

    private String bookSubject;

    public Book(String author, String title, String type, boolean isCheckedOut, String bookSubject) {
        super(author, title, type, isCheckedOut);
        this.bookSubject = bookSubject;
    }

    public String getBookSubject() {
        return bookSubject;
    }

    public void setBookSubject(String bookType) {
        this.bookSubject = bookType;
    }
}

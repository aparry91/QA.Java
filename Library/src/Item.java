public class Item {

    private String author;
    private String title;
    private String type;
    private static int id = 0;
    private int bookId;
    private boolean isCheckedOut = false;

    public Item(String author, String title, String type, boolean isCheckedOut) {
        id++;
        this.bookId = id;
        this.author = author;
        this.title = title;
        this.type = type;
        this.isCheckedOut = isCheckedOut;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isCheckedOut(boolean b) {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Item.id = id;
    }

    @Override
    public String toString() {
        String temp = "";
        temp = "Item{" +
                "bookId='" + bookId + '\'' +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
        return temp;
    }

    }

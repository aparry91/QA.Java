public class Journal extends Item{

    private String pubDate;

    public Journal(String author, String title, String type, boolean isCheckedOut, String pubDate) {
        super(author, title, type, isCheckedOut);
        this.pubDate = pubDate;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}

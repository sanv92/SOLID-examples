package srp.good;

public class Book {
    private String bookName;

    private String authorName;

    private String content;

    public Book(String bookName, String authorName, String content) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.content = content;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

package srp.good;

public class BookDisplay {
    public void show(Book book, Device device) {
        String text = String.format("Name: %s, author: %s, content: %s", book.getBookName(), book.getAuthorName(), book.getContent());
        device.display(text);
    }
}

package srp.good;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Book Name", "Author Name", "text text text");
        Device device = new WindowsConsole();

        BookDisplay bookDisplay = new BookDisplay();
        bookDisplay.show(book, device);
    }

}

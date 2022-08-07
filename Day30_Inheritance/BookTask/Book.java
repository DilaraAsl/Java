package Day30_Inheritance.BookTask;

public class Book {

    private String title, type, author;
    private int price;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Invalid price " + price);
        }
        this.price = price;
    }

    public Book(String title, String type, String author, int price) {
        setTitle(title);
        setType(type);
        setAuthor(author);
        setPrice(price);

    }

    public String toString() {
        return getClass().getSimpleName() + " " + '{' +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;

    }
}
package Day30_Inheritance.BookTask;

public class AudioBook extends Book {
    private int length;
    private String narrator;

    public AudioBook(String title, String type, String author, String narrator, int price, int length) {
        super(title, type, author, price);
        setNarrator(narrator);
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        return super.toString() +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}

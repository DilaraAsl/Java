package Day30_Inheritance.BookTask;

public class Ebook extends Book {

    private char size;
    private int pages;

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages < 0) {
            System.out.println("Invalid page size : " + size);
            System.exit(1);
        }
        this.pages = pages;
    }

    public Ebook(String title, String type, String author, int price, int length, char size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);

    }

    @Override
    public String toString() {
        return super.toString() + "size=" + size +
                ", pages=" + pages +
                '}';
    }
}

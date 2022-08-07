package XtraTasks.AggregationTask;

public class TextBook {
    public String title, author, publisher;

    public TextBook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public TextBook(TextBook obj2){
        this.title = obj2.title;
        this.author = obj2.author;
        this.publisher = obj2.publisher;
    }
    public void set(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }


    public String toString() {
        return "Text Book Information:  " +
                "\n title: '" + title + '\'' +
                "\n author: '" + author + '\'' +
                "\n publisher: '" + publisher + '\'';
    }
}

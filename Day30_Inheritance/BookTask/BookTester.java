package Day30_Inheritance.BookTask;

public class BookTester {
    public static void main(String[] args) {
        AudioBook aBook1 = new AudioBook("Of mice and men", "Fiction", "Steinbeck", "John Lemon", 24, 120);
        System.out.println(aBook1.toString());
    }
}

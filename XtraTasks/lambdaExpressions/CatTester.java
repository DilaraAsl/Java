package XtraTasks.lambdaExpressions;

public class CatTester {
    public static void main(String[] args) {
        // Cat myCat = new Cat();
        printThing(
                () -> {
                    System.out.println("meow");
                }
        );
    }

    static void printThing(Printable thing) {
        thing.print();
    }
}

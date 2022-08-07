package day31_Inheritance.animalOverriding;

public class AnimalTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Tig", "street", 'M', 8, "medium", "gray");
        myCat.drink();
        myCat.eat();
        myCat.sleep();
    }
}

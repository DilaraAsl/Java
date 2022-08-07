package day34_Interface.AnimalTask;

public class Parrot extends Animal implements Flyable {
    public Parrot(String breed, char gender, int age, String size, String color) {
        super(breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}

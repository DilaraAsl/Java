package day34_Interface.AnimalTask;

public class Cat extends Animal implements Playable {
    public Cat(String breed, char gender, int age, String size, String color) {
        super(breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eating cat food");

    }

    @Override
    public String toString() {
        eat();
        play();

        return super.toString() + "friendly: " + isFriendly;
    }
}

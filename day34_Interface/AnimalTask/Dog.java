package day34_Interface.AnimalTask;

public class Dog extends Animal implements Playable {
    public Dog(String breed, char gender, int age, String size, String color) {
        super(breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating a bone.");
    }

    @Override
    public String toString() {
        eat();
        play();
        return super.toString() + "Friendly: " + isFriendly;
    }
}

package day34_Interface.AnimalTask;

public class Eagle extends Animal implements Wild, Flyable {
    public Eagle(String breed, char gender, int age, String size, String color) {
        super(breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats a rabbit.");
    }

    public void hunting() {
        System.out.println(getName() + " is hunting for mice.");
    }

    public void fly() {
        System.out.println(getName() + " can fly high .");
    }

    @Override
    public String toString() {
        eat();
        hunting();
        fly();
        return super.toString() + " Can Fly : " + canFly;
    }

}

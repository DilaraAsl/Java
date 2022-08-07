package day34_Interface.AnimalTask;

public class Tiger extends Animal {
    public Tiger(String breed, char gender, int age, String size, String color) {
        super(breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("My tiger is eating.");

    }
}

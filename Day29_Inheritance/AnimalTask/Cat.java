package Day29_Inheritance.AnimalTask;

public class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name, String breed, char gender, char size, int age) {
        super(name, breed, gender, size, age);

    }

    public void scratch() {
        System.out.println(getName() + " is scratching");
    }

    public void meow() {
        System.out.println(getName() + " is meowing");
    }


}

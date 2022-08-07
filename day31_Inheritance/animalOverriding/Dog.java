package day31_Inheritance.animalOverriding;

public class Dog extends Animal {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " eating its bone now.");
    }
}

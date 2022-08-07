package day31_Inheritance.animalOverriding;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + " is drinking milk");
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating cat food.");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " is sleeps 11 hours everyday.");
    }
}

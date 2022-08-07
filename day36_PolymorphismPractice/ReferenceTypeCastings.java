package day36_PolymorphismPractice;

import Day29_Inheritance.AnimalTask.Animal;
import Day29_Inheritance.AnimalTask.Cat;
import Day29_Inheritance.AnimalTask.Dog;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Dog();
        Dog dog2 = (Dog) animal;
        dog2.bark();
        ((Dog) animal).bark();
        Cat cat = new Cat();
        Animal animal2 = new Cat();
        ((Cat) animal2).scratch();
        // ((Cat)animal2).scratch();// down casting
    }
}

package Day29_Inheritance.AnimalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, char size, int age) {
        super(name, breed, gender, size, age);

    }

    public Dog() {
        super();

    }

    ;

    public void bark() {
        System.out.println(getName() + " is barking.");
    }


}


package Day17_CustomClasses;

public class DogTester {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Max"; // set the instance variables
        dog1.breed="husky";
        dog1.eat();
        dog1.setInfo("max","husky","small", 'm',2, "blue");
        System.out.println(dog1);

    }

}

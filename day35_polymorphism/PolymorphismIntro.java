package day35_polymorphism;

import day33_abstraction.EmployeeTask.Employee;
import day33_abstraction.EmployeeTask.Teacher;
import day34_Interface.AnimalTask.*;
import day35_polymorphism.polymorphismTask.transportationTask.Audi;
import day35_polymorphism.polymorphismTask.transportationTask.Car;

import java.util.Arrays;

public class PolymorphismIntro {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("yorkshire", 'm', 4, "small", "white"), new Cat("persian", 'f', 10, "small", "white"), new Eagle("bald eagle", 'm', 3, "small", "black")};
        animals[0].sleep();
        Object str = new String();
        Integer n = 100;
        Boolean r = true;
        Audi myCar = new Audi("Audi", "2020", "black", 2022, 20000);
        Object[] list = {myCar, n, r, animals};
        Employee myTeacher = new Teacher("Muhtar", 33, 'M', "123", "Java Teacher", 100000);
        myTeacher.work();
        System.out.println(Arrays.toString(list));
        Car myCar2 = new Audi("Audi", "2020", "black", 1999, 20000);
        boolean isAudi = myCar2 instanceof Audi;
        System.out.println(isAudi);
        System.out.println(myCar2.getColor());
        Animal eagle = new Eagle("bald eagle", 'm', 3, "small", "black");
        eagle.drink();
        eagle.eat();
        Animal tiger = new Tiger("bengal", 'm', 6, "large", "yellow");
        tiger.drink();
        tiger.eat();
        tiger.drink();
        Eagle myEagle = null;
        Parrot myParrot = null;
        Flyable[] bird = {myEagle, myParrot};
    }

}

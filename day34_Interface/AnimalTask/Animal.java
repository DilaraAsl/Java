package day34_Interface.AnimalTask;

public abstract class Animal {
    private String name, breed;
    private final char gender;
    private int age;

    public Animal(String breed, char gender, int age, String size, String color) {
        setName(getClass().getSimpleName());
        setBreed(breed);
        this.gender = gender; // gender can be set only in constructor because it is final
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String size, color;

    public void drink() {
        System.out.println(name + " is drinking water.");
    }

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " sleeps 10 hours a day .");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'';
    }

}

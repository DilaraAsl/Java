package day28_Encapsulation.personTask;

public class Person {
    public String name;
    public int age;
    public String language;
    public char gender;
    public static String planet;
    public static boolean isHuman;
    public static int noOfWings;
    public static int noOfHeads;

    static{
        planet="Earth";
        isHuman=true;
        noOfWings=0;
        noOfHeads=0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    public Person(String name, int age, String language, char gender) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.gender = gender;
    }
}

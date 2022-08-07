package Day24_RemoveIf_DateAndTime;

import java.time.LocalDate;

public class Person {
    //name age gender birthday
    public String name;
    public int age;
    public char gender;
    public LocalDate birthday;

    public Person(String name, char gender, LocalDate birthday) {
        this.name = name;  // instance variable names and parameter names are the same--> use this
        this.gender = gender;
        this.birthday = birthday;
        age=LocalDate.now().getYear()-birthday.getYear(); // no parameter for age no need for this
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
